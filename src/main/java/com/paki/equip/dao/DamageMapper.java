package com.paki.equip.dao;

import com.paki.equip.pojo.Damage;
import com.paki.equip.pojo.DamageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DamageMapper {
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