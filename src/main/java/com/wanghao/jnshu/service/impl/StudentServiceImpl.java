package com.wanghao.jnshu.service.impl;

import com.wanghao.jnshu.dao.StudentDao;
import com.wanghao.jnshu.model.Student;
import com.wanghao.jnshu.service.StudengService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by WangHao on 2017/1/24.
 */
@Service
public class StudentServiceImpl implements StudengService{
    @Autowired
    private StudentDao studentDao;
    public List<Student> select(){
        return studentDao.select();
    }
}
