package com.paki.equip.dao;

import com.paki.equip.pojo.Rent;
import com.paki.equip.pojo.RentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RentMapper {
    int countByExample(RentExample example);

    int deleteByExample(RentExample example);

    int insert(Rent record);

    int insertSelective(Rent record);

    List<Rent> selectByExample(RentExample example);

    int updateByExampleSelective(@Param("record") Rent record, @Param("example") RentExample example);

    int updateByExample(@Param("record") Rent record, @Param("example") RentExample example);

    int clearRent(Integer rentmanid);
}