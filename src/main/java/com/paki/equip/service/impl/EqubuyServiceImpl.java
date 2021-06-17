package com.paki.equip.service.impl;

import com.paki.equip.dao.EqubuyMapper;
import com.paki.equip.pojo.Equbuy;
import com.paki.equip.pojo.EqubuyExample;
import com.paki.equip.service.EqubuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EqubuyServiceImpl implements EqubuyService {

    @Autowired
    EqubuyMapper equbuyMapper;

    @Override
    public List<Equbuy> selectByExample(EqubuyExample example) {
        return equbuyMapper.selectByExample(example);
    }

    @Override
    public Equbuy selectByPrimaryKey(Integer equid) {
        return equbuyMapper.selectByPrimaryKey(equid);
    }

    @Override
    public int updateByExampleSelective(Equbuy record, EqubuyExample example) {
        return equbuyMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int deleteByPrimaryKey(Integer equid) {
        return equbuyMapper.deleteByPrimaryKey(equid);
    }

    @Override
    public int insert(Equbuy record) {
        return equbuyMapper.insert(record);
    }

    @Override
    public Equbuy selectByname(String euqname) {
        return equbuyMapper.selectByname(euqname);
    }
}
