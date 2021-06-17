package com.paki.equip.service.impl;

import com.paki.equip.dao.RepairMapper;
import com.paki.equip.pojo.Repair;
import com.paki.equip.pojo.RepairExample;
import com.paki.equip.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepairServeImpl implements RepairService {

    @Autowired
    RepairMapper repairMapper;

    @Override
    public int countByExample(RepairExample example) {
        return repairMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(RepairExample example) {
        return repairMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer repairid) {
        return repairMapper.deleteByPrimaryKey(repairid);
    }

    @Override
    public int insert(Repair record) {
        return repairMapper.insert(record);
    }

    @Override
    public int insertSelective(Repair record) {
        return repairMapper.insertSelective(record);
    }

    @Override
    public List<Repair> selectByExample(RepairExample example) {
        return repairMapper.selectByExample(example);
    }

    @Override
    public Repair selectByPrimaryKey(Integer repairid) {
        return repairMapper.selectByPrimaryKey(repairid);
    }

    @Override
    public int updateByExampleSelective(Repair record, RepairExample example) {
        return repairMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Repair record, RepairExample example) {
        return repairMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Repair record) {
        int i = repairMapper.updateByPrimaryKeySelective(record);
        return i;
    }

    @Override
    public int updateByPrimaryKey(Repair record) {
        return repairMapper.updateByPrimaryKey(record);
    }
}
