package com.fabo.portfolio.repository;

import com.fabo.portfolio.model.Activity;
import org.springframework.data.repository.CrudRepository;

public interface ActivityRepository extends CrudRepository<Activity,Long> {
}
