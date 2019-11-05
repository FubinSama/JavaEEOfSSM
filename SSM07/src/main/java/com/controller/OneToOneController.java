package com.controller;

import com.dao.PersonDao;
import com.po.Person;
import com.pojo.SelectPersonById;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class OneToOneController {
    @Autowired
    private PersonDao personDao;

    public void test(){
        Person p1 = personDao.selectPersonById1(1);
        System.out.println(p1);
        System.out.println("====================");
        Person p2 = personDao.selectPersonById2(1);
        System.out.println(p2);
        System.out.println("====================");
        SelectPersonById p3 = personDao.selectPersonById3(1);
        System.out.println(p3);
        System.out.println("====================");
    }
}
