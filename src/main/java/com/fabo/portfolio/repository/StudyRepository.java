package com.fabo.portfolio.repository;

import com.fabo.portfolio.model.Study;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudyRepository extends CrudRepository<Study, Long> {
}
