package com.pc.bean;

public class Price
{
	//  int gid, int package_id, String property_ids, String desc_ids, String pj_ids
	private int gid;
	private int packageId;
	private String property_ids;
	private String desc_ids;
	private String pj_ids;
	public int getGid()
	{
		return gid;
	}
	public void setGid(int gid)
	{
		this.gid = gid;
	}
	public int getPackageId()
	{
		return packageId;
	}
	public void setPackageId(int packageId)
	{
		this.packageId = packageId;
	}
	public String getProperty_ids()
	{
		return property_ids;
	}
	public void setProperty_ids(String property_ids)
	{
		this.property_ids = property_ids;
	}
	public String getDesc_ids()
	{
		return desc_ids;
	}
	public void setDesc_ids(String desc_ids)
	{
		this.desc_ids = desc_ids;
	}
	public String getPj_ids()
	{
		return pj_ids;
	}
	public void setPj_ids(String pj_ids)
	{
		this.pj_ids = pj_ids;
	}
	public Price(int gid, int packageId, String property_ids, String desc_ids,
			String pj_ids)
	{
		super();
		this.gid = gid;
		this.packageId = packageId;
		this.property_ids = property_ids;
		this.desc_ids = desc_ids;
		this.pj_ids = pj_ids;
	}
	public Price()
	{
		super();
	}
	@Override
	public String toString()
	{
		return "Price [gid=" + gid + ", packageId=" + packageId
				+ ", property_ids=" + property_ids + ", desc_ids=" + desc_ids
				+ ", pj_ids=" + pj_ids + "]";
	}
	
	
}
