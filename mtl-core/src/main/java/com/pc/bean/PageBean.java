package com.pc.bean;

import java.util.List;

public class PageBean<T>
{
	private  Integer currentPage;
	private Integer totalPage;
	private Integer pageSize;
	private Integer totalSize;
	private List<T> list;
	
	@Override
	public String toString()
	{
		return "PageBean [currentPage=" + currentPage + ", totalPage="
				+ totalPage + ", pageSize=" + pageSize + ", totalSize="
				+ totalSize + ", list=" + list + "]";
	}
	public PageBean()
	{
		super();
	}
	public PageBean(Integer currentPage, Integer totalPage, Integer pageSize,
			Integer totalSize, List<T> list)
	{
		super();
		this.currentPage = currentPage;
		this.totalPage = totalPage;
		this.pageSize = pageSize;
		this.totalSize = totalSize;
		this.list = list;
	}
	public List<T> getList()
	{
		return list;
	}
	public void setList(List<T> list)
	{
		this.list = list;
	}
	public Integer getCurrentPage()
	{
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage)
	{
		this.currentPage = currentPage;
	}
	public Integer getTotalPage()
	{
		return totalPage;
	}
	public void setTotalPage(Integer totalPage)
	{
		this.totalPage = totalPage;
	}
	public Integer getPageSize()
	{
		return pageSize;
	}
	public void setPageSize(Integer pageSize)
	{
		this.pageSize = pageSize;
	}
	public Integer getTotalSize()
	{
		return totalSize;
	}
	public void setTotalSize(Integer totalSize)
	{
		this.totalSize = totalSize;
	}
	
}
