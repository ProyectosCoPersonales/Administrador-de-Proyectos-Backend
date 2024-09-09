package com.jordandeev.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.jordandeev.modal.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{
    List<Comment> findByIssueId(Long issueId);
}
