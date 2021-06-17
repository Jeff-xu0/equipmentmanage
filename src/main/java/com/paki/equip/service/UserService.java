package com.paki.equip.service;

import com.paki.equip.pojo.Useraccount;
import com.paki.equip.pojo.UseraccountExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    Useraccount selectByaccount(Useraccount useraccount);

    int updateByExampleSelective(@Param("record") Useraccount record, @Param("example") UseraccountExample example);

    List<Useraccount> selectByExample(UseraccountExample example);

    int insert(Useraccount record);

    Useraccount selectByname(Useraccount useraccount);

    Useraccount selectByPrimaryKey(Integer userid);

    int deleteByPrimaryKey(Integer userid);

    int returnEquip(Integer userid);
}
