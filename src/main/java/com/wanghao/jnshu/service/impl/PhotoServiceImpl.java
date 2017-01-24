package com.wanghao.jnshu.service.impl;

import com.wanghao.jnshu.dao.PhotosDao;
import com.wanghao.jnshu.model.Photos;
import com.wanghao.jnshu.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * Created by WangHao on 2017/1/24.
 */
@Service
public class PhotoServiceImpl implements PhotoService{
    //注入Service依赖
    @Autowired
    private PhotosDao photosDao;
    public List<Photos> select(){
        return photosDao.select();
    }
}
