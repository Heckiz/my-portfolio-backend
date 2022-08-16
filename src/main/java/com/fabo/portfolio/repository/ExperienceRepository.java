package com.fabo.portfolio.repository;

import com.fabo.portfolio.model.Experience;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceRepository extends CrudRepository<Experience, Long> {
}
