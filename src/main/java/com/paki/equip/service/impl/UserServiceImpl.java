package com.paki.equip.service.impl;

import com.paki.equip.dao.UseraccountMapper;
import com.paki.equip.pojo.Useraccount;
import com.paki.equip.pojo.UseraccountExample;
import com.paki.equip.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UseraccountMapper useraccountMapper;

    @Override
    public Useraccount selectByaccount(Useraccount useraccount) {
        return useraccountMapper.selectByaccount(useraccount);
    }

    @Override
    public int updateByExampleSelective(Useraccount record, UseraccountExample example) {
        return useraccountMapper.updateByExampleSelective(record,example);
    }

    @Override
    public List<Useraccount> selectByExample(UseraccountExample example) {
        return useraccountMapper.selectByExample(example);
    }

    @Override
    public int insert(Useraccount record) {
        return useraccountMapper.insert(record);
    }

    @Override
    public Useraccount selectByname(Useraccount useraccount) {
        return useraccountMapper.selectByname(useraccount);
    }

    @Override
    public Useraccount selectByPrimaryKey(Integer userid) {
        return useraccountMapper.selectByPrimaryKey(userid);
    }

    @Override
    public int deleteByPrimaryKey(Integer userid) {
        return useraccountMapper.deleteByPrimaryKey(userid);
    }

    @Override
    public int returnEquip(Integer userid) {
        return useraccountMapper.returnEquip(userid);
    }
}
