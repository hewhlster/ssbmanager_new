package org.fjh.comm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Page {
	private Integer pageSize; //每页的记录数
	private Integer pages;   //总页数
	private Integer pageIndex; //当前页
	private Map<String,Object> params;//查询条件
	private List<Object> datas;//查询结果
	
	//设定初始值
	private Page(){
		pageSize=0;
		pages =0;
		pageIndex=1;
		params = new HashMap<String,Object>();
		datas = new ArrayList<Object>();
	}
	
	
	public static Page newBuilder(Integer pageIndex,Integer pageSize){
		Page page =new Page();
		page.setPageIndex(pageIndex);
		page.setPageSize(pageSize);
		return page;
	}
	
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getPages() {
		return pages;
	}
	public void setPages(Integer pages) {
		this.pages = pages;
	}
	public Integer getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}
	public Map<String, Object> getParams() {
		return params;
	}
	public void setParams(Map<String, Object> params) {
		this.params = params;
	}
	public List<Object> getDatas() {
		return datas;
	}
	public void setDatas(List<Object> datas) {
		this.datas = datas;
	}	
}
