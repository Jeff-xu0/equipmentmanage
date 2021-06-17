package com.paki.equip.service;

import com.paki.equip.pojo.Repair;
import com.paki.equip.pojo.RepairExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RepairService {
    int countByExample(RepairExample example);

    int deleteByExample(RepairExample example);

    int deleteByPrimaryKey(Integer repairid);

    int insert(Repair record);

    int insertSelective(Repair record);

    List<Repair> selectByExample(RepairExample example);

    Repair selectByPrimaryKey(Integer repairid);

    int updateByExampleSelective(@Param("record") Repair record, @Param("example") RepairExample example);

    int updateByExample(@Param("record") Repair record, @Param("example") RepairExample example);

    int updateByPrimaryKeySelective(Repair record);

    int updateByPrimaryKey(Repair record);
}
