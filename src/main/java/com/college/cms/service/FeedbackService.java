package com.college.cms.service;

import com.college.cms.entity.Feedback;

import java.util.List;

public interface FeedbackService {

    Feedback saveFeedback(Feedback feedback);

    List<Feedback> getAllFeedback();

    Feedback getFeedbackById(Integer id);

    Feedback updateFeedback(Integer id, Feedback feedback);

    void deleteFeedback(Integer id);

}