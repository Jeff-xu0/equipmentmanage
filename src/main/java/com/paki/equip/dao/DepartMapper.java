package com.paki.equip.dao;

import com.paki.equip.pojo.Depart;
import com.paki.equip.pojo.DepartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartMapper {
    int countByExample(DepartExample example);

    int deleteByExample(DepartExample example);

    int deleteByPrimaryKey(Integer depid);

    int insert(Depart record);

    int insertSelective(Depart record);

    List<Depart> selectByExample(DepartExample example);

    Depart selectByPrimaryKey(Integer depid);

    int updateByExampleSelective(@Param("record") Depart record, @Param("example") DepartExample example);

    int updateByExample(@Param("record") Depart record, @Param("example") DepartExample example);

    int updateByPrimaryKeySelective(Depart record);

    int updateByPrimaryKey(Depart record);
}