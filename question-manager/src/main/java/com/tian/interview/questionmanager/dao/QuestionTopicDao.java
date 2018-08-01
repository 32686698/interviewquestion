package com.tian.interview.questionmanager.dao;

import com.tian.interview.questionmanager.model.QuestionTopic;

public interface QuestionTopicDao {

    void insertQuestionTopic(QuestionTopic qt);

    QuestionTopic findQuestionTopicById(String id);
}
