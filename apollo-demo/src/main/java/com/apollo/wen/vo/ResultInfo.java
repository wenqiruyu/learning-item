package com.apollo.wen.vo;

import com.apollo.wen.emun.CodeEnum;
import com.apollo.wen.emun.SystemCodeEnum;

import java.io.Serializable;

public class ResultInfo implements Serializable {
	private static final long serialVersionUID = 4974604554663126173L;

	/** 系统编码 */
	private Integer systemCode;

	/** 状态码 */
	private Integer statusCode;

	/** 返回提示信息 */
	private String msg;

	/** 返回数据 */
	private Object data;

	@Deprecated
	public ResultInfo() {
	}

	@Deprecated
	public ResultInfo(Integer statusCode, String msg) {
		this.statusCode = statusCode;
		this.msg = msg;
	}

	@Deprecated
	public ResultInfo(Integer statusCode, String msg, Object data) {
		this.statusCode = statusCode;
		this.msg = msg;
		this.data = data;
	}

	public ResultInfo(SystemCodeEnum systemCodeEnum, CodeEnum codeEnum) {
		this.systemCode = systemCodeEnum.getValue();
		this.statusCode = codeEnum.getValue();
		this.msg = codeEnum.getText();
	}

	public ResultInfo(SystemCodeEnum systemCodeEnum, CodeEnum codeEnum, String msg) {
		this.systemCode = systemCodeEnum.getValue();
		this.statusCode = codeEnum.getValue();
		this.msg = msg;
	}

	public ResultInfo(SystemCodeEnum systemCodeEnum, CodeEnum codeEnum, Object data) {
		this.systemCode = systemCodeEnum.getValue();
		this.statusCode = codeEnum.getValue();
		this.msg = codeEnum.getText();
		this.data = data;
	}

	public ResultInfo(SystemCodeEnum systemCodeEnum, CodeEnum codeEnum, String msg, Object data) {
		this.systemCode = systemCodeEnum.getValue();
		this.statusCode = codeEnum.getValue();
		this.msg = msg;
		this.data = data;
	}

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Integer getSystemCode() {
		return systemCode;
	}

	public void setSystemCode(Integer systemCode) {
		this.systemCode = systemCode;
	}

	/**
	 * 
	 * @desc 是否失败状态
	 * @auth josnow
	 * @date 2018年1月31日 下午3:23:28
	 * @return true：失败； false：成功
	 */
	public static boolean isFailed(ResultInfo resultInfo) {
		return resultInfo != null && resultInfo.getStatusCode() < 0;
	}
}
