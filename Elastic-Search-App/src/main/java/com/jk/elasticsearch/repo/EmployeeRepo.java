package com.jk.elasticsearch.repo;

import com.jk.elasticsearch.model.Employee;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface EmployeeRepo extends ElasticsearchRepository<Employee,String> {
    List<Employee> findByFirstName(String firstName);
}
