package com.tian.interview.questionmanager.service.impl;

import com.tian.interview.questionmanager.dao.QuestionTopicDao;
import com.tian.interview.questionmanager.model.QuestionTopic;
import com.tian.interview.questionmanager.service.IQuestionTopicService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "questionTopicService")
public class QuestionTopicServiceImpl implements IQuestionTopicService {

    @Resource
    private QuestionTopicDao quertionTopicDao;

    public void insertQuestionTopic(QuestionTopic qt){
        quertionTopicDao.insertQuestionTopic(qt);
    }

    public QuestionTopic findQuestionTopicById(int id){
        return quertionTopicDao.findQuestionTopicById(id);
    }
}
