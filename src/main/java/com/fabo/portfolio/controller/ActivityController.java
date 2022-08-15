package com.fabo.portfolio.controller;

import com.fabo.portfolio.model.Activity;
import com.fabo.portfolio.service.activityService.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ActivityController {

    @Autowired
    public ActivityService activityService;

    @GetMapping("/activities")
    private List<Activity> getAllActivities(){
        return activityService.getAllActivities();
    }

    @PostMapping("/activities")
    private String createActivity(@RequestBody Activity activity){
        activityService.saveActivity(activity);
        return "Activity created successfully";
    }

    @DeleteMapping("/activities/{id}")
    private String deleteActivity(@PathVariable Long id){
        activityService.deleteActivity(id);
        return "Activity deleted successfully";
    }

    @GetMapping("/activities/{id}")
    private Activity getActivity(@PathVariable Long id){
        return activityService.getActivity(id);
    }

}
