package com.dao;

import com.po.Idcard;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("idCardDao")
public interface IdCardDao {
    Idcard selectCodeById(Integer id);
}
