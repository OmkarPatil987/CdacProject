package com.project.payroll_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.payroll_management_system.model.Month;

@Repository
public interface MonthRepository extends JpaRepository<Month, Long> {

}
