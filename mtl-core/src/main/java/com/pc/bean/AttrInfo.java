package com.pc.bean;

public class AttrInfo
{
	private Integer attrId;
	private String attrName;
	private String attrDes;
	private String bak1;
	
	
	public Integer getAttrId()
	{
		return attrId;
	}
	public void setAttrId(Integer attrId)
	{
		this.attrId = attrId;
	}
	public String getAttrName()
	{
		return attrName;
	}
	public void setAttrName(String attrName)
	{
		this.attrName = attrName;
	}
	public String getAttrDes()
	{
		return attrDes;
	}
	public void setAttrDes(String attrDes)
	{
		this.attrDes = attrDes;
	}
	public String getBak1()
	{
		return bak1;
	}
	public void setBak1(String bak1)
	{
		this.bak1 = bak1;
	}
	public AttrInfo(Integer attrId, String attrName, String attrDes, String bak1)
	{
		super();
		this.attrId = attrId;
		this.attrName = attrName;
		this.attrDes = attrDes;
		this.bak1 = bak1;
	}
	public AttrInfo()
	{
		super();
	}
	@Override
	public String toString()
	{
		return "AttrInfo [attrId=" + attrId + ", attrName=" + attrName
				+ ", attrDes=" + attrDes + ", bak1=" + bak1 + "]";
	}
	
}
