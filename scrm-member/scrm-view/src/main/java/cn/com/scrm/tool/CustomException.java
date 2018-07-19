package cn.com.scrm.tool;

/**
 * @desc 自定义异常
 * @author ligc
 * ***/
public class CustomException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2444987491116996221L;
	
	private Integer excpCode;
	private String  excpMsg;
	
	
	public CustomException() {
		super();
	}
	public CustomException(Integer excpCode, String excpMsg) {
		super();
		this.excpCode = excpCode;
		this.excpMsg = excpMsg;
	}
	

}
