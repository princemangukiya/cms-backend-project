package com.college.cms.service.impl;

import com.college.cms.entity.BookIssue;
import com.college.cms.repository.BookIssueRepository;
import com.college.cms.service.BookIssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookIssueServiceImpl implements BookIssueService {
    @Autowired
    private BookIssueRepository repository;

    @Override
    public void saveBookIssue(BookIssue bookIssue) {
        repository.save(bookIssue);
    }
}