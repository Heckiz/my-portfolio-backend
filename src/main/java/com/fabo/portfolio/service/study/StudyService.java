package com.fabo.portfolio.service.study;

import com.fabo.portfolio.model.Study;
import com.fabo.portfolio.repository.StudyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudyService implements iStudyService{

    @Autowired
    public StudyRepository studyRepo;

    @Override
    public List<Study> getAllStudies() {
        return (List<Study>) studyRepo.findAll();
    }

    @Override
    public Study getStudy(Long id) {
        return studyRepo.findById(id).orElse(null);
    }

    @Override
    public void saveStudy(Study study) {
        studyRepo.save(study);
    }

    @Override
    public void deleteStudy(Long id) {
        studyRepo.deleteById(id);
    }
}
