package com.jordandeev.repository;

import org.springframework.data.jpa.repository.JpaRepository;  

import com.jordandeev.modal.Project;
import com.jordandeev.modal.User;

import java.util.List;  

public interface ProjectRepository extends JpaRepository<Project, Long> {  
    List<Project> findByOwner(User user);  

    List<Project> findByNameContainingAndTeamContains(String partialName, User user);  

    List<Project> findByTeamContainingOrOwner(User user, User owner);  
}
