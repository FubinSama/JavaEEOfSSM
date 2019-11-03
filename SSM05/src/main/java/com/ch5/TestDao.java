package com.ch5;

import java.util.List;

public interface TestDao {
    int update(String sql, Object[] param);
    List<MyUser> query(String sql, Object[] param);
}
