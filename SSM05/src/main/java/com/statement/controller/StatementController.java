package com.statement.controller;

import com.statement.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("statementController")
public class StatementController {
    @Autowired
    private TestService testService;

    public String test(){
        String message = "执行成功，没有事务回滚！";
        String deleteSql = "delete from user";
        String saveSql = "insert into user values(?, ?, ?)";
        Object[] param = {1, "wfb", "男"};
        try {
            testService.delete(deleteSql, null);
            testService.save(saveSql, param);
            testService.save(saveSql, param);
        } catch (Exception e) {
            message = "主键重复， 事务回滚！";
            e.printStackTrace();
        }
        return message;
    }
}
