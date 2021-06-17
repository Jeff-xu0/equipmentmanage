package com.paki.equip.service;

import com.paki.equip.pojo.Damage;
import com.paki.equip.pojo.DamageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DamageService {
    int countByExample(DamageExample example);

    int deleteByExample(DamageExample example);

    int deleteByPrimaryKey(Integer damageid);

    int insert(Damage record);

    int insertSelective(Damage record);

    List<Damage> selectByExample(DamageExample example);

    Damage selectByPrimaryKey(Integer damageid);

    int updateByExampleSelective(@Param("record") Damage record, @Param("example") DamageExample example);

    int updateByExample(@Param("record") Damage record, @Param("example") DamageExample example);

    int updateByPrimaryKeySelective(Damage record);

    int updateByPrimaryKey(Damage record);
}
