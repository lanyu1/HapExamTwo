package com.hand.address.mapper;

import com.hand.hap.mybatis.common.Mapper;
import com.hand.address.dto.addressList;

public interface addressListMapper extends Mapper<addressList>{
    int myUpdate(addressList list);
}