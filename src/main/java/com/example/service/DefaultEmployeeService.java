package com.example.service;

import com.example.employees.tables.Employees;
import com.example.employees.tables.records.EmployeesRecord;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kevintan on 02/01/2016.
 */
@Service
public class DefaultEmployeeService implements EmployeeService{
    @Autowired
    DSLContext dsl;


    @Override
    public Result<EmployeesRecord> getEmployees() {
        return dsl.selectFrom(Employees.EMPLOYEES).fetch();
    }
}
