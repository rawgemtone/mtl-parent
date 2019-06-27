package com.pc.service;

import java.util.List;

import com.pc.bean.AttrInfo;
import com.pc.bean.AttrType;

public interface IAttrService
{
	public List<AttrType> selectAttrTypeList();
	public List<AttrInfo> selectAttrInfoList();
}
