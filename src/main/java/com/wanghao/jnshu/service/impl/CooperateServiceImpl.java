package com.wanghao.jnshu.service.impl;

import com.wanghao.jnshu.dao.CooperateDao;
import com.wanghao.jnshu.model.Cooperate;
import com.wanghao.jnshu.service.CooperateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by WangHao on 2017/1/24.
 */
@Service
public class CooperateServiceImpl implements CooperateService{
    @Autowired
    private CooperateDao cooperateDao;
    public List<Cooperate> select(){
        return  cooperateDao.select();
    }
}
