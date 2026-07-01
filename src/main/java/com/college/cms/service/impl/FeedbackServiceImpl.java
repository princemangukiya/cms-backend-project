package com.college.cms.service.impl;

import com.college.cms.entity.Feedback;
import com.college.cms.repository.FeedbackRepository;
import com.college.cms.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @Override
    public Feedback saveFeedback(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }

    @Override
    public List<Feedback> getAllFeedback() {
        return feedbackRepository.findAll();
    }

    @Override
    public Feedback getFeedbackById(Integer id) {
        return feedbackRepository.findById(id).orElse(null);
    }

    @Override
    public Feedback updateFeedback(Integer id, Feedback feedback) {

        Feedback oldFeedback = feedbackRepository.findById(id).orElse(null);

        if (oldFeedback != null) {

            oldFeedback.setFeedbackFrom(feedback.getFeedbackFrom());
            oldFeedback.setFeedbackTo(feedback.getFeedbackTo());
            oldFeedback.setRating(feedback.getRating());
            oldFeedback.setFeedbackMessage(feedback.getFeedbackMessage());

            return feedbackRepository.save(oldFeedback);
        }

        return null;
    }

    @Override
    public void deleteFeedback(Integer id) {
        feedbackRepository.deleteById(id);
    }
}