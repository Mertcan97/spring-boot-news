package com.sha.dernek.controller;

import com.sha.dernek.model.Activities;
import com.sha.dernek.model.Announcement;
import com.sha.dernek.service.IActivitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/news")//pre-path
public class NewsController
{
    @Autowired
    private IActivitiesService newsService;

    @PostMapping
    public ResponseEntity<?> saveNews(@RequestBody Activities activities)
    {
        return new ResponseEntity<>(newsService.saveActivities(activities), HttpStatus.CREATED);
    }

    @DeleteMapping("{newsId}")
    public ResponseEntity<?> deleteNews(@PathVariable Long newsId)
    {
        newsService.deleteActivities(newsId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllNews()
    {
        return new ResponseEntity<>(newsService.findAllActivities(), HttpStatus.OK);
    }
}
