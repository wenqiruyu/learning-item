package com.apollo.wen.controller;

import com.apollo.wen.emun.CodeEnum;
import com.apollo.wen.emun.SystemCodeEnum;
import com.apollo.wen.vo.ResultInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Api(value = "演示Apollo控制器",tags = {"演示Apollo控制器"})
public class DemoController {

    @Value("${name:default_name}")
    private String name;

    @Value("${password:default_password}")
    private String password;

    @ApiOperation(value="测试通过@value注入数据，获取application name",tags = {"演示Apollo控制器"})
    @RequestMapping(value = "/test/value/name", method = RequestMethod.POST)
    public ResultInfo testValue() {
        Map<String, Object> map = new HashMap();
        map.put("name", name);
        return new ResultInfo(SystemCodeEnum.LOCAL_SYS, CodeEnum.SUCCESS, map);
    }

    @ApiOperation(value="测试通过@value注入数据，获取profiles active",tags = {"演示Apollo控制器"})
    @RequestMapping(value = "/test/value/active", method = RequestMethod.POST)
    public ResultInfo activeValue() {
        Map<String, Object> map = new HashMap();
        map.put("password", password);
        return new ResultInfo(SystemCodeEnum.LOCAL_SYS, CodeEnum.SUCCESS, map);
    }
}
