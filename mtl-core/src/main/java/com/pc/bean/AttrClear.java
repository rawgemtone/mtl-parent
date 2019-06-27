package com.pc.bean;

import java.util.List;

public class AttrClear
{
	private Integer attrTypeId;
	private String attrTypeName;
	private String attrPage;
	private List<AttrInfo> attrInfo;
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
	public List<AttrInfo> getAttrInfo()
	{
		return attrInfo;
	}
	public void setAttrInfo(List<AttrInfo> attrInfo)
	{
		this.attrInfo = attrInfo;
	}
	public AttrClear(Integer attrTypeId, String attrTypeName, String attrPage,
			List<AttrInfo> attrInfo)
	{
		super();
		this.attrTypeId = attrTypeId;
		this.attrTypeName = attrTypeName;
		this.attrPage = attrPage;
		this.attrInfo = attrInfo;
	}
	public AttrClear()
	{
		super();
	}
	@Override
	public String toString()
	{
		return "AttrClear [attrTypeId=" + attrTypeId + ", attrTypeName="
				+ attrTypeName + ", attrPage=" + attrPage + ", attrInfo="
				+ attrInfo + "]";
	}
	
}
