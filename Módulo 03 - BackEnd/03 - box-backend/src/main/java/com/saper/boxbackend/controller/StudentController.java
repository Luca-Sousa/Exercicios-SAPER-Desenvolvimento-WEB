package com.saper.boxbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saper.boxbackend.dto.ClientRequestDTO;
import com.saper.boxbackend.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/{id}")
    public Object getOne(@PathVariable(name = "id") Long id) {
        return studentService.findById(id);
    }

    @PostMapping
    public Object save(@RequestBody ClientRequestDTO clientRequestDTO) {
        return studentService.save(clientRequestDTO);
    }

    @PostMapping("/{student_id}/{team_id}")
    public Object enroll(@PathVariable(name = "student_id") Long student_id,
                         @PathVariable(name = "team_id") Long team_id) {
        return studentService.enroll(student_id, team_id);
    }
}
