package com.wanghao.jnshu.service.impl;

import com.wanghao.jnshu.dao.OccupationDao;
import com.wanghao.jnshu.model.Occupation;
import com.wanghao.jnshu.service.OccupationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by WangHao on 2017/1/24.
 */
@Service
public class OccupationServiceImpl implements OccupationService {
    @Autowired
    private OccupationDao occupationDao;
    public List<Occupation> select(){
        return occupationDao.select();
    }
}
