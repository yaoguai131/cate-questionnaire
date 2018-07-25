package com.cate.catequestionnaire.tool;

import java.io.Serializable;

public class BaseAjaxResponse implements Serializable{
	
	private static final long serialVersionUID = -5821136787539677545L;
	public static final int SUCCESS = 1;
	public static final int FAIL = 0;
	private int code = FAIL;
	private String errorMessage;
	private String result;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	
	
}
