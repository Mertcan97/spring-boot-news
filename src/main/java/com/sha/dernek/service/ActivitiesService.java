package com.sha.dernek.service;

import com.sha.dernek.model.Activities;
import com.sha.dernek.model.Announcement;
import com.sha.dernek.repository.IActivitiesRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ActivitiesService implements IActivitiesService
{
    private final IActivitiesRepository activitiesRepository;

    public ActivitiesService(IActivitiesRepository activitiesRepository)
    {
        this.activitiesRepository = activitiesRepository;
    }

    @Override
    public Activities saveActivities(Activities activities)
    {
        activities.setValidityDate(LocalDateTime.now());
       try{
            activitiesRepository.save(activities);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return activities;
    }

    @Override
    public void deleteActivities(Long id)
    {
        activitiesRepository.deleteById(id);
    }

    @Override
    public List<Activities> findAllActivities()
    {
        return activitiesRepository.findAll();
    }

}
