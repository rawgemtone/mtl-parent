package com.pc.bean;

public class PageQuery
{
	private Integer begin;
	private Integer pageSize;
	public Integer getBegin()
	{
		return begin;
	}
	public void setBegin(Integer begin)
	{
		this.begin = begin;
	}
	public Integer getPageSize()
	{
		return pageSize;
	}
	public void setPageSize(Integer pageSize)
	{
		this.pageSize = pageSize;
	}
	public PageQuery(Integer begin, Integer pageSize)
	{
		super();
		this.begin = begin;
		this.pageSize = pageSize;
	}
	public PageQuery()
	{
		super();
	}
	@Override
	public String toString()
	{
		return "PageQuery [begin=" + begin + ", pageSize=" + pageSize + "]";
	}
	
}
