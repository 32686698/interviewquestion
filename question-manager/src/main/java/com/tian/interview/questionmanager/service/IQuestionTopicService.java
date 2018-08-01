package com.tian.interview.questionmanager.service;

import com.tian.interview.questionmanager.model.QuestionTopic;

public interface IQuestionTopicService {

    void insertQuestionTopic(QuestionTopic qt);

    QuestionTopic findQuestionTopicById(String id);
}
