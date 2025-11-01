package com.recurringfuture.repository;

import com.recurringfuture.entity.PracticeSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PracticeSetRepo extends JpaRepository<PracticeSet,Integer> {
}
