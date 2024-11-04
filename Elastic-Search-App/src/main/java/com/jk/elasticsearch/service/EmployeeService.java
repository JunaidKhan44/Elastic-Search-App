package com.jk.elasticsearch.service;


import com.jk.elasticsearch.model.Employee;
import com.jk.elasticsearch.repo.EmployeeRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

**
 * @author Junaid.Khan
 */

@Service
@AllArgsConstructor
public class EmployeeService {

    private final EmployeeRepo repo;

    public String saveEmployee(List<Employee> list){
        repo.saveAll(list);
        return  String.format("Number of Employee saved : %d",list.size());
    }
    public Iterator<Employee> findAllEmployee(){
       return repo.findAll().iterator();

    }

    public List<Employee> findByFirstName(String firstName) {
        return  repo.findByFirstName(firstName);
    }
}
