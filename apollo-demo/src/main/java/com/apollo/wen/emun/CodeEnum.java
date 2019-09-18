package com.apollo.wen.emun;

/**
 * 
 * @desc 状态码 只有负数是错误状态，自然数都是正确状态
 * @author josnow
 * @date 2018年1月11日 下午2:15:47
 * @version 1.0.0
 */
public enum CodeEnum {

	/** 操作成功 */
	SUCCESS(0, "操作成功"),
	/** 操作失败 */
	ERROR(-1, "操作失败"),
	/** 请求参数有误 */
	ERROR_PARAM(-400, "请求参数有误"),
	/** 操作未授权 */
	ERROR_NOT_AUTH(-401, "操作未授权"),
	/** 请求未找到 */
	ERROR_NOT_FOUND(-404, "请求未找到"),
	/** 服务器异常 */
	ERROR_SERVER(-500, "服务器异常"),
	/** 调用远程服务器异常 */
	ERROR_REMOTE(-501, "调用远程服务器异常"),
	/** 调用远程服务器返回结果错误，比如：期望返回json，结果返回了非json字符串。亦可用于非异常错误 */
	ERROR_REMOTE_ERROR_RESULT(-502, "调用远程服务器返回结果错误"),
	/** 请求未授权，用户未登录 */
	ERROR_NOT_LOGIN(-901, "请求未授权，用户未登录"),
	/** 无内部员工信息  */
	ERROR_NOT_EMP(-900,"非内部员工")
	;

	private int value;
	private String text;

	private CodeEnum(int value, String text) {
		this.value = value;
		this.text = text;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public static void main(String[] args) {
		System.out.println(CodeEnum.ERROR_PARAM.getText());
		System.out.println(CodeEnum.ERROR_PARAM.getValue());
	}

}
