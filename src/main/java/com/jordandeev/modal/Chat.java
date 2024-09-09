package com.jordandeev.modal;

import jakarta.persistence.*;  
import lombok.AllArgsConstructor;  
import lombok.Data;  
import lombok.NoArgsConstructor;
import java.util.List;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity  
@Data  
@NoArgsConstructor  
@AllArgsConstructor  
public class Chat {  
    @Id  
    @GeneratedValue(strategy = GenerationType.AUTO)  
    private Long id;  

    private String name;  

    @OneToOne  
    private Project project;

    @JsonIgnore
    @OneToMany(mappedBy="chat",cascade=CascadeType.ALL,orphanRemoval = true)
    private List<Message> messages;
    
    @ManyToMany
    private List<User> users = new ArrayList<>();
}
