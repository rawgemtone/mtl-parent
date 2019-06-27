package com.pc.dao;

import java.util.List;

import com.pc.bean.AttrInfo;
import com.pc.bean.AttrType;

public interface IAttrDao
{
	public List<AttrType> selectAttrTypeList();
	public List<AttrInfo> selectAttrInfoList();
}
