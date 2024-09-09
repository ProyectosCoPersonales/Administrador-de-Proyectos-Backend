package com.jordandeev.repository;


import com.jordandeev.modal.Chat;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ChatRepository extends JpaRepository<Chat, Long>{

    
}
