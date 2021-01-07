package com.example.wokers_machines_lab2.controllers;

import com.example.wokers_machines_lab2.entity.Worker;
import com.example.wokers_machines_lab2.repository.WorkerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WorkersMachinesController {

    @Autowired
    private WorkerRepository workerRepository;

    @GetMapping("/tables")
    public String tableMain(Model model) {
        Iterable<Worker> workers = workerRepository.findAll();
            model.addAttribute("workers", workers);
            return "tables-main";
        }
}
