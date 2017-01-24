package com.wanghao.jnshu.dao;
import com.wanghao.jnshu.model.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.List;


/**
 * Created by WangHao on 2017/1/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring的配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class PhotosDaoTest {
    @Autowired
    private StudentDao studentDao;
    @Test
    public void select() throws Exception {
        List<Student> photosList=studentDao.select();
        for (int i=0;i<4;i++){
            System.out.println(photosList.get(i));
        }
    }

}