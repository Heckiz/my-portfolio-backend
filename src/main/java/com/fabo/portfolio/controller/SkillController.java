package com.fabo.portfolio.controller;

import com.fabo.portfolio.model.Skill;
import com.fabo.portfolio.service.skillService.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SkillController {
    @Autowired
    public SkillService skillService;

    @GetMapping("/skills")
    private List<Skill> getAllSkills(){
        return skillService.getAllSkills();
    }
    @GetMapping("/skills/{id}")
    private Skill getSkill(@PathVariable Long id){
        return skillService.getSkill(id);
    }

    @PostMapping("/skills")
    private String createSkill(@RequestBody Skill skill){
        skillService.saveSkill(skill);
        return "Skill created successfully";
    }

    @DeleteMapping("/skills/{id}")
    private String deleteSkill(@PathVariable Long id){
        skillService.deleteSkill(id);
        return "Skill deleted successfully";
    }

    @PutMapping("/skills/{id}")
    private String updateSkill(@RequestBody Skill skill){
        skillService.saveSkill(skill);
        return "Skill updated successfully";
    }
}
