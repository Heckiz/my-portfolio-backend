package com.fabo.portfolio.controller;

import com.fabo.portfolio.model.Study;
import com.fabo.portfolio.service.study.StudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("/api")
public class StudyController {

    @Autowired
    public StudyService studyService;

    @GetMapping("/studies")
    private List<Study> getAllStudies(){
        return studyService.getAllStudies();
    }

    @PostMapping("/studies")
    private String createStudy(@RequestBody Study study){
        studyService.saveStudy(study);
        return "Study created successfully";
    }

    @DeleteMapping("/studies/{id}")
    private String deleteStudy(@PathVariable Long id){
        studyService.deleteStudy(id);
        return "Study deleted successfully";
    }

    @GetMapping("/studies/{id}")
    private Study getStudy(@PathVariable Long id){
        return studyService.getStudy(id);
    }

}
