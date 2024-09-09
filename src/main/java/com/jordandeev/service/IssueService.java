package com.jordandeev.service;

import java.util.List;

import com.jordandeev.modal.Issue;
import com.jordandeev.modal.User;
import com.jordandeev.request.IssueRequest;

public interface IssueService {
    Issue getIssueById(Long issueId) throws Exception;

    List<Issue> getIssueByProjectId(Long projectId) throws Exception;

    Issue createIssue(IssueRequest issue, User userid) throws Exception;

    void deleteIssue(Long issueId, Long userid) throws Exception;

    Issue addUserToIssue(Long issueId, Long userId) throws Exception;

    Issue updateStatus(Long issueId, String status) throws Exception;
}

    
