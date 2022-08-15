package com.fabo.portfolio.service.experienceService;

import com.fabo.portfolio.model.Experience;

import java.util.List;
import java.util.Optional;

public interface iExperienceService  {

    public abstract List<Experience> getAllExperiences();

    public abstract Experience getExperience(Long id);

    public  abstract void saveExperience(Experience experience);

    public  abstract void deleteExperience(Long id);
}
