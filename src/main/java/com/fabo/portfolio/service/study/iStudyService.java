package com.fabo.portfolio.service.study;

import com.fabo.portfolio.model.Study;

import java.util.List;

public interface iStudyService {

    public abstract List<Study> getAllStudies();

    public abstract Study getStudy(Long id);

    public  abstract void saveStudy(Study study);

    public  abstract void deleteStudy(Long id);
}
