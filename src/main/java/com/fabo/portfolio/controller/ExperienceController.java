package com.fabo.portfolio.controller;

import com.fabo.portfolio.model.Experience;
import com.fabo.portfolio.service.experienceService.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExperienceController {

    @Autowired
    public ExperienceService experienceService;

    @GetMapping("/experiences")
    private List<Experience> getAllExperiences(){
        return experienceService.getAllExperiences();
    }

    @GetMapping("/experiences/{id}")
    private Experience getExperience(@PathVariable Long id){
        return experienceService.getExperience(id);
    }

    @PostMapping("/experiences")
    private String createExperience(@RequestBody Experience experience){
        experienceService.saveExperience(experience);
        return "Experience created successfully";
    }

    @DeleteMapping("/experiences/{id}")
    private String deleteExperience(@PathVariable Long id){
        experienceService.deleteExperience(id);
        return "Experience deleted successfully";
    }

    @PutMapping ("/experiences/{id}")
    private String updateExperience(@RequestBody Experience experience){
        experienceService.saveExperience(experience);
        return "Experience updated successfully";
    }
}
