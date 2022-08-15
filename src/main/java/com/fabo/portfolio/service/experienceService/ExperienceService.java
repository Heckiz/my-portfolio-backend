package com.fabo.portfolio.service.experienceService;

import com.fabo.portfolio.model.Experience;
import com.fabo.portfolio.repository.ExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ExperienceService implements iExperienceService{

    @Autowired
    public ExperienceRepository experienceRepo;

    @Override
    public List<Experience> getAllExperiences() {
        return (List<Experience>) experienceRepo.findAll();
    }

    @Override
    public Experience getExperience(Long id) {
        return experienceRepo.findById(id).orElse(null);
    }

    @Override
    public void saveExperience(Experience experience) {
            experienceRepo.save(experience);
    }

    @Override
    public void deleteExperience(Long id) {
            experienceRepo.deleteById(id);
    }
}
