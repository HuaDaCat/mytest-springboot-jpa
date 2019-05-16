package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigInteger;

/**
 * @author: hyh
 */

@Entity
@Table(name = "user_roles")
@Data
public class User_roles {

    @Column(name = "user_id")
    private BigInteger user_id;

    @Column(name = "role_id")
    private BigInteger role_id;

}
