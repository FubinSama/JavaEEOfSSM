package com.dao;

import com.po.Person;
import com.pojo.SelectPersonById;

public interface PersonDao {
    Person selectPersonById1(Integer id);
    Person selectPersonById2(Integer id);
    SelectPersonById selectPersonById3(Integer id);
}
