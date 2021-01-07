package com.example.wokers_machines_lab2.repository;

import com.example.wokers_machines_lab2.entity.Worker;
import org.springframework.data.repository.CrudRepository;

public interface WorkerRepository extends CrudRepository<Worker, Integer> {
}
