package com.sha.dernek.repository;

import com.sha.dernek.model.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface INewsRepository extends JpaRepository<News, Long>
{
}
