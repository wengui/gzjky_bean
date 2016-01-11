package com.gzjky.bean.extend;

/**
 * 分页处理Bean
 * @author yuting
 *
 */
public class PageBean {

	/**
	 * 翻页起始位置
	 */
	private int pageMax;
	
	/**
	 * 一页显示的数据条数
	 */
	private int pageMin;

	public int getPageMax() {
		return pageMax;
	}

	public void setPageMax(int pageMax) {
		this.pageMax = pageMax;
	}

	public int getPageMin() {
		return pageMin;
	}

	public void setPageMin(int pageMin) {
		this.pageMin = pageMin;
	}


	
}
