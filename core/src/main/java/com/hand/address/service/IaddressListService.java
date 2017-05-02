package com.hand.address.service;

import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;
import com.hand.address.dto.addressList;

import java.util.List;

public interface IaddressListService extends IBaseService<addressList>, ProxySelf<IaddressListService>{
    int updateList(List<addressList> lists);
}