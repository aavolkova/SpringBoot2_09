package com.example.demo.repositories;

import com.example.demo.models.Job;
import org.springframework.data.repository.CrudRepository;

public interface JobRepository extends CrudRepository<Job, Long>{
}
