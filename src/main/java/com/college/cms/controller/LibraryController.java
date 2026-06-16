package com.college.cms.controller;

import com.college.cms.entity.Library;
import com.college.cms.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/library")
@CrossOrigin(origins = "http://localhost:5173", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.OPTIONS}, allowedHeaders = "*")
public class LibraryController {

    @Autowired
    private LibraryService libraryService;

    @PostMapping("/save")
    public ResponseEntity<String> saveLibrary(@RequestBody Library library) {
        try {
            libraryService.saveLibrary(library);
            return ResponseEntity.ok("Book Details Saved Successfully!");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error: " + e.getMessage());
        }
    }
}