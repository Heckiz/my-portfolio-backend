package com.fabo.portfolio.repository;

import com.fabo.portfolio.model.Activity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepository extends CrudRepository<Activity,Long> {
}
