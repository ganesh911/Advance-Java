package com.spring.Hospital_Crud_SpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.Hospital_Crud_SpringBoot.dto.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Integer>{

}
