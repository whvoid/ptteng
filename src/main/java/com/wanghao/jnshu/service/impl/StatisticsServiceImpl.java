package com.wanghao.jnshu.service.impl;

import com.wanghao.jnshu.dao.StatisticsDao;
import com.wanghao.jnshu.model.Statistics;
import com.wanghao.jnshu.service.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by WangHao on 2017/1/24.
 */
@Service
public class StatisticsServiceImpl implements StatisticsService {
    @Autowired
    private StatisticsDao statisticsDao;
    public Statistics select(){
        return  statisticsDao.select();
    }
}
