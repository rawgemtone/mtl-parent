package com.pc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pc.bean.AttrInfo;
import com.pc.bean.AttrType;
import com.pc.dao.IAttrDao;
@Service
public class IAttrServiceImpl implements IAttrService
{
	@Autowired
	private IAttrDao attrdao;
	@Override
	public List<AttrType> selectAttrTypeList()
	{
		return attrdao.selectAttrTypeList();
	}
	@Override
	public List<AttrInfo> selectAttrInfoList()
	{
		return attrdao.selectAttrInfoList();
	}

}
