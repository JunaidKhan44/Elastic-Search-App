package com.jk.elasticsearch.controller;


import com.jk.elasticsearch.model.Employee;
import com.jk.elasticsearch.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.List;

/**
 * @author Junaid.Khan
 */

@RestController
@RequestMapping("/employees")
@AllArgsConstructor
public class EmployeeController {
    private final EmployeeService service;

    @PostMapping("/saveEmployess")
    public String saveEmployee(@RequestBody List<Employee> list){
        return service.saveEmployee(list);

    }
    @GetMapping("/findAll")
    public Iterator<Employee> findAll(){
        return (Iterator<Employee>) service.findAllEmployee();
    }

    @GetMapping("/findBy/{firstName}")
    public List<Employee> findByFirstName(@PathVariable String firstName){
        return service.findByFirstName(firstName);
    }
}
