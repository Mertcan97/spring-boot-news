package com.sha.dernek.service;

import com.sha.dernek.model.News;

import java.util.List;

public interface INewsService {
    News saveNews(News news);

    void deleteNews(Long id);

    List<News> findAllNews();
}
