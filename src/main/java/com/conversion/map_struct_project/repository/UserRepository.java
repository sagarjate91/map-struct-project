package com.conversion.map_struct_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.conversion.map_struct_project.model.User;


public interface UserRepository extends JpaRepository<User, Long> {

   

}
