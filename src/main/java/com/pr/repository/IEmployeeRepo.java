package com.pr.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pr.document.Employee;

public interface IEmployeeRepo extends MongoRepository<Employee, String> {

}
