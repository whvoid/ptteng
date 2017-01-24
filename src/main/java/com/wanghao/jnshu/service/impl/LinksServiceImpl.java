package com.wanghao.jnshu.service.impl;

import com.wanghao.jnshu.dao.LinksDao;
import com.wanghao.jnshu.model.Links;
import com.wanghao.jnshu.service.LinksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by WangHao on 2017/1/24.
 */
@Service
public class LinksServiceImpl implements LinksService{
    @Autowired
    private LinksDao linksDao;
    public List<Links> select(){
        return linksDao.select();
    }
}
