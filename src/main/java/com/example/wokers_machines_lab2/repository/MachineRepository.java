package com.example.wokers_machines_lab2.repository;

import com.example.wokers_machines_lab2.entity.Machine;
import org.springframework.data.repository.CrudRepository;

public interface MachineRepository extends CrudRepository<Machine, Long> {
}
