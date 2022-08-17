package com.dailycodebuffer.springboot.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dailycodebuffer.springboot.tutorial.model.JobTitle;

@Repository
public interface JobTitleRepository extends JpaRepository<JobTitle, Integer> {

}
