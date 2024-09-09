package com.jordandeev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jordandeev.modal.Message;
import java.util.List;

public interface MessageRepository extends JpaRepository<Message,Long>{
    
    List<Message> findByChatIdOrderByCreatedAtAsc(Long chatId);

}
