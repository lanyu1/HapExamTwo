package com.hand.address.service.impl;

import com.hand.address.mapper.addressListMapper;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hand.address.dto.addressList;
import com.hand.address.service.IaddressListService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class addressListServiceImpl extends BaseServiceImpl<addressList> implements IaddressListService{
    @Autowired
    private addressListMapper addressListMapper;
    @Override
    public int updateList(List<addressList> lists) {
        lists.forEach(addressList -> checkOvn(addressListMapper.myUpdate(addressList),addressList));
        return lists.size();
    }
}