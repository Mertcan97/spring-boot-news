package com.sha.dernek.controller;

import com.sha.dernek.model.News;
import com.sha.dernek.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/news")//pre-path
public class NewsController
{
    @Autowired
    private INewsService newsService;

    @PostMapping
    public ResponseEntity<?> saveNews(@RequestBody News news)
    {
        return new ResponseEntity<>(newsService.saveNews(news), HttpStatus.CREATED);
    }

    @DeleteMapping("{newsId}")
    public ResponseEntity<?> deleteNews(@PathVariable Long newsId)
    {
        newsService.deleteNews(newsId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllNews()
    {
        return new ResponseEntity<>(newsService.findAllNews(), HttpStatus.OK);
    }
}
