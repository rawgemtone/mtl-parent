package com.pc.bean;

public class BrandPage
{
	private Integer begin;
	private Integer pageSize;
	private Integer brandId;
	private Integer currentPage;
	
	public BrandPage()
	{
		super();
	}
	public Integer getCurrentPage()
	{
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage)
	{
		this.currentPage = currentPage;
	}
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
	public Integer getBrandId()
	{
		return brandId;
	}
	public void setBrandId(Integer brandId)
	{
		this.brandId = brandId;
	}
	
	public BrandPage(Integer begin, Integer pageSize, Integer brandId,
			Integer currentPage)
	{
		super();
		this.begin = begin;
		this.pageSize = pageSize;
		this.brandId = brandId;
		this.currentPage = currentPage;
	}
	public BrandPage(Integer begin, Integer pageSize, Integer brandId)
	{
		super();
		this.begin = begin;
		this.pageSize = pageSize;
		this.brandId = brandId;
	}
	@Override
	public String toString()
	{
		return "BrandPage [begin=" + begin + ", pageSize=" + pageSize
				+ ", brandId=" + brandId + ", currentPage=" + currentPage + "]";
	}
	
	
	
}
