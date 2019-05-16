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
@Table(name = "role")
@Data
public class Role implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private BigInteger id;

    @Column(name = "create_time")
    private Date create_time;

    @Column(name = "name")
    private String name;

    @Column(name = "remark")
    private String remark;

}
