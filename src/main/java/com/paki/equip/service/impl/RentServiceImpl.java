package com.paki.equip.service.impl;

import com.paki.equip.dao.RentMapper;
import com.paki.equip.pojo.Rent;
import com.paki.equip.pojo.RentExample;
import com.paki.equip.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentServiceImpl implements RentService {

    @Autowired
    RentMapper rentMapper;
    @Override
    public int insert(Rent record) {
        return rentMapper.insertSelective(record);
    }

    @Override
    public int clearRent(Integer rentmanid) {
        return rentMapper.clearRent(rentmanid);
    }

    @Override
    public List<Rent> selectByExample(RentExample example) {
        return rentMapper.selectByExample(example);
    }
}
