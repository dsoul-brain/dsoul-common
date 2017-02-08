package com.easwift.common.json.entity;

/**
 * @remark [通用JSON返回结果类]
 * @extend [NONE]
 * @author [dingwei.tang]
 * @date [2016年8月12日 下午1:44:47]
 */
public class Result {
	
	public static final Boolean SUCCESS = Boolean.TRUE;
	public static final Boolean FAILURE = Boolean.FALSE;

	private Boolean state;
	private String message;
	private Object data;

	public Result(Boolean state, String message, Object data) {
		this.state = state;
		this.message = message;
		this.data = data;
	}

	public Result(String message, Object data) {
		this.state = Boolean.TRUE;
		this.message = message;
		this.data = data;
	}

	public Result(String message) {
		this.state = Boolean.TRUE;
		this.message = message;
	}

	public Boolean getState() {
		return state;
	}

	public void setState(Boolean state) {
		this.state = state;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	

	
}
