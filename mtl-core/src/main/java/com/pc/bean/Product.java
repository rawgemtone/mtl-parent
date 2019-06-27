package com.pc.bean;

public class Product
{
	private Integer productId;
	private String productCode;
	private String productName;
	private Integer productType;
	private Integer productBrand;
	private String imageId;
	private Integer productMinPrice;
	private String bak1;
	public Integer getProductId()
	{
		return productId;
	}
	public void setProductId(Integer productId)
	{
		this.productId = productId;
	}
	public String getProductCode()
	{
		return productCode;
	}
	public void setProductCode(String productCode)
	{
		this.productCode = productCode;
	}
	public String getProductName()
	{
		return productName;
	}
	public void setProductName(String productName)
	{
		this.productName = productName;
	}
	public Integer getProductType()
	{
		return productType;
	}
	public void setProductType(Integer productType)
	{
		this.productType = productType;
	}
	public Integer getProductBrand()
	{
		return productBrand;
	}
	public void setProductBrand(Integer productBrand)
	{
		this.productBrand = productBrand;
	}
	public String getImageId()
	{
		return imageId;
	}
	public void setImageId(String imageId)
	{
		this.imageId = imageId;
	}
	public Integer getProductMinPrice()
	{
		return productMinPrice;
	}
	public void setProductMinPrice(Integer productMinPrice)
	{
		this.productMinPrice = productMinPrice;
	}
	public String getBak1()
	{
		return bak1;
	}
	public void setBak1(String bak1)
	{
		this.bak1 = bak1;
	}
	public Product(Integer productId, String productCode, String productName,
			Integer productType, Integer productBrand, String imageId,
			Integer productMinPrice, String bak1)
	{
		super();
		this.productId = productId;
		this.productCode = productCode;
		this.productName = productName;
		this.productType = productType;
		this.productBrand = productBrand;
		this.imageId = imageId;
		this.productMinPrice = productMinPrice;
		this.bak1 = bak1;
	}
	public Product()
	{
		super();
	}
	@Override
	public String toString()
	{
		return "Product [productId=" + productId + ", productCode="
				+ productCode + ", productName=" + productName
				+ ", productType=" + productType + ", productBrand="
				+ productBrand + ", imageId=" + imageId + ", productMinPrice="
				+ productMinPrice + ", bak1=" + bak1 + "]";
	}
	
}
