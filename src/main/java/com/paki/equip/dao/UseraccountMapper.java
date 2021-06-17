package com.paki.equip.dao;

import com.paki.equip.pojo.Useraccount;
import com.paki.equip.pojo.UseraccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UseraccountMapper {
    int countByExample(UseraccountExample example);

    int deleteByExample(UseraccountExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(Useraccount record);

    int insertSelective(Useraccount record);

    List<Useraccount> selectByExample(UseraccountExample example);

    Useraccount selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") Useraccount record, @Param("example") UseraccountExample example);

    int updateByExample(@Param("record") Useraccount record, @Param("example") UseraccountExample example);

    int updateByPrimaryKeySelective(Useraccount record);

    int updateByPrimaryKey(Useraccount record);

    Useraccount selectByname(Useraccount useraccount);

    int returnEquip(Integer userid);

    Useraccount selectByaccount(Useraccount useraccount);
}