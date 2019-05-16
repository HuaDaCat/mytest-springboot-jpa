package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

/**
 * @author: hyh
 */
@Entity
@Table(name = "user")
@Data
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private BigInteger id;

    @Column(name = "avatar")
    private String avatar;

    @Column(name = "create_time")
    private Date create_time;

    @Column(name = "email")
    private String email;

    @Column(name = "enabled")
    private BigInteger enabled;

    @Column(name = "password")
    private String password;

    @Column(name = "username")
    private String username;

    @Column(name = "last_password_reset_time")
    private Date last_password_reset_time;

}
