package com.sha.dernek.repository;

import com.sha.dernek.model.Activities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IActivitiesRepository extends JpaRepository<Activities, Long>
{
}
