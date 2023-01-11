package com.sha.dernek.service;

import com.sha.dernek.model.Activities;
import com.sha.dernek.model.Announcement;

import java.util.List;

public interface IActivitiesService {
    Activities saveActivities(Activities Activities);

    void deleteActivities(Long id);

    List<Activities> findAllActivities();

}
