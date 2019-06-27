package com.pc.bean;

import java.util.List;

public class AttrType
{
	private Integer attrTypeId;
	private String attrTypeName;
	private String attrPage;
	public Integer getAttrTypeId()
	{
		return attrTypeId;
	}
	public void setAttrTypeId(Integer attrTypeId)
	{
		this.attrTypeId = attrTypeId;
	}
	public String getAttrTypeName()
	{
		return attrTypeName;
	}
	public void setAttrTypeName(String attrTypeName)
	{
		this.attrTypeName = attrTypeName;
	}
	public String getAttrPage()
	{
		return attrPage;
	}
	public void setAttrPage(String attrPage)
	{
		this.attrPage = attrPage;
	}
	public AttrType(Integer attrTypeId, String attrTypeName, String attrPage)
	{
		super();
		this.attrTypeId = attrTypeId;
		this.attrTypeName = attrTypeName;
		this.attrPage = attrPage;
	}
	@Override
	public String toString()
	{
		return "AttrType [attrTypeId=" + attrTypeId + ", attrTypeName="
				+ attrTypeName + ", attrPage=" + attrPage + "]";
	}
	public AttrType()
	{
		super();
	}
	
	
}
