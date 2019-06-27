package com.pc.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

public interface IPriceService
{
	public Integer calculatePrice(Integer[] discount_ids);
}
