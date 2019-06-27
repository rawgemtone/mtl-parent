package com.pc.bean;

public class Brand
{
	private Integer brandId;
	private String brandName;
	private String brandDesc;
	private String bak1;
	
	public Integer getBrandId()
	{
		return brandId;
	}
	public void setBrandId(Integer brandId)
	{
		this.brandId = brandId;
	}
	public String getBrandName()
	{
		return brandName;
	}
	public void setBrandName(String brandName)
	{
		this.brandName = brandName;
	}
	public String getBrandDesc()
	{
		return brandDesc;
	}
	public void setBrandDesc(String brandDesc)
	{
		this.brandDesc = brandDesc;
	}
	public String getBak1()
	{
		return bak1;
	}
	public void setBak1(String bak1)
	{
		this.bak1 = bak1;
	}
	
	public Brand(Integer brandId, String brandName, String brandDesc,
			String bak1)
	{
		super();
		this.brandId = brandId;
		this.brandName = brandName;
		this.brandDesc = brandDesc;
		this.bak1 = bak1;
	}
	public Brand()
	{
		super();
	}
	@Override
	public String toString()
	{
		return "Brand [brandId=" + brandId + ", brandName=" + brandName
				+ ", brandDesc=" + brandDesc + ", bak1=" + bak1 + "]";
	}
	
}
