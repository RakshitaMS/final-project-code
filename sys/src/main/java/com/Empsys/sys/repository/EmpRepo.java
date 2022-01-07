package com.Empsys.sys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Empsys.sys.entity.Employee;
@Repository
public interface EmpRepo extends JpaRepository<Employee,Integer> {

}
