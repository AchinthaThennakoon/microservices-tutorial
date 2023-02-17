package com.achintha.departmentservice.service;

import com.achintha.departmentservice.entity.Department;
import com.achintha.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("inside department service, save method");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("inside department service, find by id method");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
