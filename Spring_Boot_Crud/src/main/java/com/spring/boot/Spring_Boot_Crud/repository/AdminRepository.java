package com.spring.boot.Spring_Boot_Crud.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.boot.Spring_Boot_Crud.dto.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer>{

}
