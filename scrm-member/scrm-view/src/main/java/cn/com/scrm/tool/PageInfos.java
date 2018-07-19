package cn.com.scrm.tool;

import java.io.Serializable;

/**
 * @desc 默认接收页面处理
 * 
 * ***/
public class PageInfos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
   
	private Integer pageSize = CommonStatic.PAGE_DEFAULT_SIZE;
	
	private Integer pageNum  = CommonStatic.PAGE_DEFAULT_NUM;

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	
}
