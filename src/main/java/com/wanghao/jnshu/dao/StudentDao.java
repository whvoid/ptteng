package com.wanghao.jnshu.dao;

import com.wanghao.jnshu.model.Student;

import java.util.List;

/**
 * Created by WangHao on 2017/1/24.
 */
public interface StudentDao {
    public List<Student> select();
}
