package com.example.commongateway.register;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tblmuser")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username ;
    private String firstName ;
    private String password;
    private String lastName ;
    private String email ;
    private String address ;
    private String status;

}
