package com.pc.bean;

public class ProductAttrDiscount
{
	private int discountId;
	private int produceId;
	private int attrId;
	private int discountPrice;
	private String discountDesc;
	private String bak1;
	public int getDiscountId()
	{
		return discountId;
	}
	public void setDiscountId(int discountId)
	{
		this.discountId = discountId;
	}
	public int getProduceId()
	{
		return produceId;
	}
	public void setProduceId(int produceId)
	{
		this.produceId = produceId;
	}
	public int getAttrId()
	{
		return attrId;
	}
	public void setAttrId(int attrId)
	{
		this.attrId = attrId;
	}
	public int getDiscountPrice()
	{
		return discountPrice;
	}
	public void setDiscountPrice(int discountPrice)
	{
		this.discountPrice = discountPrice;
	}
	public String getDiscountDesc()
	{
		return discountDesc;
	}
	public void setDiscountDesc(String discountDesc)
	{
		this.discountDesc = discountDesc;
	}
	public String getBak1()
	{
		return bak1;
	}
	public void setBak1(String bak1)
	{
		this.bak1 = bak1;
	}
	public ProductAttrDiscount(int discountId, int produceId, int attrId,
			int discountPrice, String discountDesc, String bak1)
	{
		super();
		this.discountId = discountId;
		this.produceId = produceId;
		this.attrId = attrId;
		this.discountPrice = discountPrice;
		this.discountDesc = discountDesc;
		this.bak1 = bak1;
	}
	public ProductAttrDiscount()
	{
		super();
	}
	@Override
	public String toString()
	{
		return "ProductAttrDiscount [discountId=" + discountId + ", produceId="
				+ produceId + ", attrId=" + attrId + ", discountPrice="
				+ discountPrice + ", discountDesc=" + discountDesc + ", bak1="
				+ bak1 + "]";
	}
	
}
