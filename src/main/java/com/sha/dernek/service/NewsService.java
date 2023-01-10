package com.sha.dernek.service;

import com.sha.dernek.model.News;
import com.sha.dernek.repository.INewsRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class NewsService implements INewsService
{
    private final INewsRepository newsRepository;

    public NewsService(INewsRepository newsRepository)
    {
        this.newsRepository = newsRepository;
    }

    @Override
    public News saveNews(News news)
    {
        news.setCreateTime(LocalDateTime.now());
        return newsRepository.save(news);
    }

    @Override
    public void deleteNews(Long id)
    {
        newsRepository.deleteById(id);
    }

    @Override
    public List<News> findAllNews()
    {
        return newsRepository.findAll();
    }
}
