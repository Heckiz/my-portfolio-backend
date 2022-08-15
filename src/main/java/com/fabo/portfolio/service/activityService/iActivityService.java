package com.fabo.portfolio.service.activityService;

import com.fabo.portfolio.model.Activity;

import java.util.List;

public interface iActivityService {

    public abstract List<Activity> getAllActivities();

    public abstract Activity getActivity(Long id);

    public  abstract void saveActivity(Activity activity);

    public  abstract void deleteActivity(Long id);
}
