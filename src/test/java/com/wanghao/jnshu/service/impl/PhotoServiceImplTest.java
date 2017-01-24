package com.wanghao.jnshu.service.impl;

import com.wanghao.jnshu.dao.PhotosDao;
import com.wanghao.jnshu.model.Links;
import com.wanghao.jnshu.model.Photos;
import com.wanghao.jnshu.model.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by WangHao on 2017/1/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring的配置文件
@ContextConfiguration({"classpath:spring/spring-service.xml","classpath:spring/spring-dao.xml"})
public class PhotoServiceImplTest {
    @Autowired
    private LinksServiceImpl linksService;
    @Test
    public void select() throws Exception {
        List<Links> photosList=linksService.select();
        for (int i=0;i<20;i++){
            System.out.println(photosList.get(i));
        }
    }
}