package com.swagger.wen.vo;

import java.io.Serializable;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.swagger.wen.config.ResultCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 项目名称：learning-item
 * 类名称：ResultVO
 * 类描述：TODO
 * 创建人：yingx
 * 创建时间： 2019/9/18
 * 修改人：yingx
 * 修改时间： 2019/9/18
 * 修改备注：
 */
@ApiModel(value = "ResultVO", description = "公用返回定义")
@JacksonXmlRootElement(localName = "root") // 方便对象和xml的转换
public class ResultVO<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "状态码", required = true)
    @JacksonXmlProperty(localName = "code")
    private String code;

    @ApiModelProperty(value = "返回描述", required = true)
    @JacksonXmlProperty(localName = "message")
    private String message;

    @ApiModelProperty(value = "业务数据", required = false)
    @JacksonXmlProperty(localName = "data")
    private T data;

    public ResultVO() {
        this.code = ResultCodeEnum.SUCCESS.getCode();
        this.message = ResultCodeEnum.SUCCESS.getMsg();
    }

    public ResultVO(T data) {
        this.data = data;
        this.code = ResultCodeEnum.SUCCESS.getCode();
        this.message = ResultCodeEnum.SUCCESS.getMsg();
    }

    public ResultVO(ResultCodeEnum codeEnum, T data) {
        this.data = data;
        this.code = codeEnum.getCode();
        this.message = codeEnum.getMsg();
    }

    public ResultVO(ResultCodeEnum codeEnum) {
        this.code = codeEnum.getCode();
        this.message = codeEnum.getMsg();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    /**
     * @Title：success 
     * @Description： 默认成功
     * @return com.cignacmb.web.permission.vo.ResultVO<T> 
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static <T> ResultVO<T> success() {
        return new ResultVO("");
    }

    /**
     * @Title：success 
     * @Description：自定义成功提醒 
     * @param data
     * @return com.cignacmb.web.permission.vo.ResultVO<T> 
     */
    public static <T> ResultVO<T> success(T data) {
        return new ResultVO<T>(data);
    }

    /**
     * @Title：success 
     * @Description：自定义成功类 codeEnum
     * @param codeEnum
     * @return com.cignacmb.web.permission.vo.ResultVO<T> 
     */
    public static <T> ResultVO<T> success(ResultCodeEnum codeEnum) {
        return new ResultVO<T>(codeEnum);
    }

    /**
     * @Title：success 
     * @Description：自定义成功类及提醒信息 
     * @param codeEnum
     * @param data
     * @return com.cignacmb.web.permission.vo.ResultVO<T> 
     */
    public static <T> ResultVO<T> success(ResultCodeEnum codeEnum, T data) {
        return new ResultVO<T>(codeEnum, data);
    }

    /**
     *
     * @Title: fail
     * @Description: 默认返回失败
     * @return
     * @return ResultVO
     * @throws
     */
    public static <T> ResultVO<T> fail() {
        return new ResultVO<T>(ResultCodeEnum.FAIL);
    }

    /**
     *
     * @Title: fail
     * @Description: 返回自定义失败信息
     * @param code
     * @return
     * @return ResultVO
     * @throws
     */
    public static <T> ResultVO<T> fail(ResultCodeEnum codeEnum) {
        return new ResultVO<T>(codeEnum);
    }

    /**
     *
     * @Title: fail
     * @Description: 返回自定义结果
     * @param object
     * @return
     * @return ResultVO
     * @throws
     */
    public static <T> ResultVO<T> fail(T data) {
        return new ResultVO<T>(ResultCodeEnum.FAIL, data);
    }

    /**
     *
     * @Title: fail
     * @Description: 返回自定义失败信息和结果
     * @return
     * @return ResultVO
     * @throws
     */
    public static <T> ResultVO<T> fail(ResultCodeEnum codeEnum, T data) {
        return new ResultVO<T>(codeEnum, data);
    }

    @Override
    public String toString() {
        return "ResultVO{" + "code='" + code + '\'' + ", message='" + message + '\'' + ", data=" + data + '}';
    }
}

