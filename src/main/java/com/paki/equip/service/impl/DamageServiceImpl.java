package com.paki.equip.service.impl;

import com.paki.equip.dao.DamageMapper;
import com.paki.equip.pojo.Damage;
import com.paki.equip.pojo.DamageExample;
import com.paki.equip.service.DamageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DamageServiceImpl implements DamageService {
    @Autowired
    DamageMapper damageMapper;
    @Override
    public int countByExample(DamageExample example) {
        return damageMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(DamageExample example) {
        return damageMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer damageid) {
        return damageMapper.deleteByPrimaryKey(damageid);
    }

    @Override
    public int insert(Damage record) {
        return damageMapper.insert(record);
    }

    @Override
    public int insertSelective(Damage record) {
        return damageMapper.insertSelective(record);
    }

    @Override
    public List<Damage> selectByExample(DamageExample example) {
        return damageMapper.selectByExample(example);
    }

    @Override
    public Damage selectByPrimaryKey(Integer damageid) {
        return damageMapper.selectByPrimaryKey(damageid);
    }

    @Override
    public int updateByExampleSelective(Damage record, DamageExample example) {
        return damageMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Damage record, DamageExample example) {
        return damageMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Damage record) {
        return damageMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Damage record) {
        return 0;
    }
}
