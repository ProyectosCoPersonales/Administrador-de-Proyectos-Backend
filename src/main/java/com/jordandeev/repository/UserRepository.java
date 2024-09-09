package com.jordandeev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jordandeev.modal.User;

public interface UserRepository extends JpaRepository<User,Long>{
    User findByEmail(String email);    
}
