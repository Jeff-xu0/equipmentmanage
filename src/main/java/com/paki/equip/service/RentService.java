package com.paki.equip.service;

import com.paki.equip.pojo.Rent;
import com.paki.equip.pojo.RentExample;

import java.util.List;

public interface RentService {

    int insert(Rent record);

    int clearRent(Integer rentmanid);

    List<Rent> selectByExample(RentExample example);

}
