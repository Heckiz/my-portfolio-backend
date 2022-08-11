package com.fabo.portfolio.service.skillService;

import com.fabo.portfolio.model.Skill;

import java.util.List;

public interface iSkillService {

    public abstract List<Skill> getAllSkills();

    public abstract Skill getSkill(Long id);

    public  abstract void saveSkill(Skill skill);

    public  abstract void deleteSkill(Long id);
}
