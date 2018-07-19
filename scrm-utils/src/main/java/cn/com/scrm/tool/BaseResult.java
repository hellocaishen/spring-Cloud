package cn.com.scrm.tool;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class BaseResult implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1771368144871799584L;
	
	private String  msg;
	private Integer code;
	private Map<String,Object> data = new HashMap<String,Object>();
	
	public BaseResult(String msg, Integer code, Map<String, Object> data) {
		super();
		this.msg = msg;
		this.code = code;
		this.data = data;
	}
	
	public BaseResult(String msg, Integer code) {
		super();
		this.msg = msg;
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public Map<String, Object> getMap() {
		return data;
	}
	public void setMap(Map<String, Object> data) {
		this.data = data;
	}
	
	

}
