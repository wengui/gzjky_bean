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
	private int pointerStart;
	
	/**
	 * 一页显示的数据条数
	 */
	private int pageSize;

	public int getPointerStart() {
		return pointerStart;
	}

	public void setPointerStart(int pointerStart) {
		this.pointerStart = pointerStart;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
}
