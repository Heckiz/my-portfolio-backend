package com.fabo.portfolio.controller;

import com.fabo.portfolio.model.Skill;
import com.fabo.portfolio.service.skillService.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SkillController {
    @Autowired
    public SkillService skillService;

    @GetMapping("/skills")
    private List<Skill> getAllSkills(){
        return skillService.getAllSkills();
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

    @GetMapping("/skills/{id}")
    private Skill getSkill(@PathVariable Long id){
        return skillService.getSkill(id);
    }

}
