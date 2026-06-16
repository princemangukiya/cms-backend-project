package com.college.cms.service.impl;

import com.college.cms.entity.Library;
import com.college.cms.repository.LibraryRepository;
import com.college.cms.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryServiceImpl implements LibraryService {
    @Autowired
    private LibraryRepository libraryRepository;

    @Override
    public void saveLibrary(Library library) {
        libraryRepository.save(library);
    }
}