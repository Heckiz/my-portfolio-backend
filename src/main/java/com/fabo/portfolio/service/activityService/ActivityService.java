package com.fabo.portfolio.service.activityService;

import com.fabo.portfolio.model.Activity;
import com.fabo.portfolio.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityService implements iActivityService{

    @Autowired
    public ActivityRepository activityRepo;

    @Override
    public List<Activity> getAllActivities() {
        return (List<Activity>) activityRepo.findAll();
    }

    @Override
    public Activity getActivity(Long id) {
        return activityRepo.findById(id).orElse(null);
    }

    @Override
    public void saveActivity(Activity activity) {
        activityRepo.save(activity);
    }

    @Override
    public void deleteActivity(Long id) {
        activityRepo.deleteById(id);
    }
}
