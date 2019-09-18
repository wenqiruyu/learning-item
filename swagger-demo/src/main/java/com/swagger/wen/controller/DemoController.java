package com.swagger.wen.controller;

import com.swagger.wen.config.ResultCodeEnum;
import com.swagger.wen.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 项目名称：learning-item
 * 类名称：DemoController
 * 类描述：TODO
 * 创建人：yingx
 * 创建时间： 2019/9/18
 * 修改人：yingx
 * 修改时间： 2019/9/18
 * 修改备注：
 */
@RestController
@Api(tags = "swagger测试用例", position = 1)
public class DemoController {

    @GetMapping("/getWen")
    @ApiOperation(value = "测试测试", notes = "言邢", position = 2)
    public Object getWen(){
        return new ResultVO(ResultCodeEnum.SUCCESS);
    }
}
