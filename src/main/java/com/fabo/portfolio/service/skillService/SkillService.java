package com.fabo.portfolio.service.skillService;


import com.fabo.portfolio.model.Skill;
import com.fabo.portfolio.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService implements iSkillService {

    @Autowired
    public SkillRepository skillRepo;

    @Override
    public List<Skill> getAllSkills() {
        return (List<Skill>) skillRepo.findAll();
    }

    @Override
    public Skill getSkill(Long id) {
        return skillRepo.findById(id).orElse(null);
    }

    @Override
    public void saveSkill(Skill skill) {
        skillRepo.save(skill);
    }

    @Override
    public void deleteSkill(Long id) {
        skillRepo.deleteById(id);
    }
}
