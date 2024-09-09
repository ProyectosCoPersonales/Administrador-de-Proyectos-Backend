package com.jordandeev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jordandeev.modal.Issue;
import java.util.List;


public interface IssueRepository extends JpaRepository<Issue, Long> {
    public List<Issue> findByProjectID(Long id);
}
