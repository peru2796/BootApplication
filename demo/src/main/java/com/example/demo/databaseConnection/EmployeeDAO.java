package com.example.demo.databaseConnection;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDAO extends CrudRepository<unit, Integer> {


}
