package com.tian.interview.questionmanager.controller;

import com.alibaba.fastjson.JSONObject;
import com.tian.interview.questionmanager.model.QuestionTopic;
import com.tian.interview.questionmanager.service.IQuestionTopicService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/qt")
public class QuestionTopicController {

    @Resource
    private IQuestionTopicService questionTopicService;

    @GetMapping(value = "/add")
    public String intoAddQt(){
        return "addqt";
    }
    @ResponseBody
    @RequestMapping(value = "/insert")
    public String insertQt(){
        QuestionTopic qt = new QuestionTopic();
        qt.setTopicCode("JAVA");
        qt.setTopicName("JAVA");
        qt.setRemark("JAVA面试题");
        questionTopicService.insertQuestionTopic(qt);
        return "success";
    }

    @ResponseBody
    @RequestMapping(value = "/{id}")
    public String findQt(@PathVariable("id") int id){
        QuestionTopic qt = questionTopicService.findQuestionTopicById(id);
        return JSONObject.toJSONString(qt);
    }
}
