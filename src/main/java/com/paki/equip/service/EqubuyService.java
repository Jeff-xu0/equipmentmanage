package com.paki.equip.service;

import com.paki.equip.pojo.Equbuy;
import com.paki.equip.pojo.EqubuyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EqubuyService {

    List<Equbuy> selectByExample(EqubuyExample example);
    Equbuy selectByPrimaryKey(Integer equid);
    int updateByExampleSelective(@Param("record") Equbuy record, @Param("example") EqubuyExample example);
    int deleteByPrimaryKey(Integer equid);
    int insert(Equbuy record);
    Equbuy selectByname(String euqname);

}
