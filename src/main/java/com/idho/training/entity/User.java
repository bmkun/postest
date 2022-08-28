package com.idho.training.entity;

import javax.persistence.*;

/**
 * @author Idho
 */
@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;
    private String USERNAME;
    private String PASSWORD;
    private int IS_ACTIVE;
}
