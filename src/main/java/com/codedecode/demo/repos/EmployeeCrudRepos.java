package com.codedecode.demo.repos;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codedecode.demo.entity.Employee;

@Repository
public interface EmployeeCrudRepos extends JpaRepository<Employee, Long>{

}
