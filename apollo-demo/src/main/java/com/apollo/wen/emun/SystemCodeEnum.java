package com.apollo.wen.emun;

/**
 * 
 * @desc 系统编码
 * @author josnow
 * @date 2018年1月18日 下午4:57:10
 * @version 1.0.0
 */
public enum SystemCodeEnum {

	/** 本系统 */
	LOCAL_SYS(100, "cur"),
	/** 会员中心系统 */
	REMOTE_SYS_MEMBER(100, "member"),
	/** app系统 */
	REMOTE_SYS_APP(101, "app"),
	/** esales系统 */
	REMOTE_SYS_ESALES(102, "esales"),

	;

	private int value;
	private String text;

	private SystemCodeEnum(int value, String text) {
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

}
