package com.jeecms.bbs.web;
import java.io.Serializable;

public class ResultVo implements Serializable{

	private static final long serialVersionUID = 1L;
	private int status;
	private String message;
	
	private Object data;
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
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
	public ResultVo() {
		super();
	}
	public ResultVo(int status, String message, Object data) {
		super();
		this.status = status;
		this.message = message;
		this.data = data;
	}
	@Override
	public String toString() {
		return "ResultVo [status=" + status + ", message=" + message + ", data=" + data + "]";
	}
	
	
}