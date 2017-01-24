package com.wanghao.jnshu.controller;

import com.wanghao.jnshu.model.*;
import com.wanghao.jnshu.service.PhotoService;
import com.wanghao.jnshu.service.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by WangHao on 2017/1/24.
 */
@Controller
@RequestMapping//url:模块/资源/{}/细分

public class PttengController {
    @Autowired
    private PhotoServiceImpl photoService;
    @Autowired
    private CooperateServiceImpl cooperateService;
    @Autowired
    private LinksServiceImpl linksService;
    @Autowired
    StatisticsServiceImpl statisticsService;
    @Autowired
    StudentServiceImpl studentService;
    @Autowired
    OccupationServiceImpl occupationService;
    @RequestMapping(value = "/index.html",method = RequestMethod.GET)
    public String index(Model model)
    {
        List<Photos> photosList=photoService.select();
        List<Cooperate> cooperateList=cooperateService.select();
        List<Links> linksList=linksService.select();
        Statistics statistics=statisticsService.select();
        List<Student> studentList=studentService.select();
        //list.jsp+mode=ModelAndView
        model.addAttribute("photosList",photosList);
        model.addAttribute("cooperateList",cooperateList);
        model.addAttribute("linksList",linksList);
        model.addAttribute("statistics",statistics);
        model.addAttribute("studentList",studentList);
        return "index";
    }
    @RequestMapping(value = "/occupation.html",method = RequestMethod.GET)
    public String occupation(Model model)
    {
        List<Occupation> occupationList=occupationService.select();
        model.addAttribute("occupationList",occupationList);
        return "occupation";
    }
}
