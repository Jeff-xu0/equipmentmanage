package com.paki.equip.dao;

import com.paki.equip.pojo.Equbuy;
import com.paki.equip.pojo.EqubuyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EqubuyMapper {
    int countByExample(EqubuyExample example);

    int deleteByExample(EqubuyExample example);

    int deleteByPrimaryKey(Integer equid);

    int insert(Equbuy record);

    int insertSelective(Equbuy record);

    List<Equbuy> selectByExample(EqubuyExample example);

    Equbuy selectByPrimaryKey(Integer equid);

    int updateByExampleSelective(@Param("record") Equbuy record, @Param("example") EqubuyExample example);

    int updateByExample(@Param("record") Equbuy record, @Param("example") EqubuyExample example);

    int updateByPrimaryKeySelective(Equbuy record);

    int updateByPrimaryKey(Equbuy record);

    Equbuy selectByname(String euqname);
}