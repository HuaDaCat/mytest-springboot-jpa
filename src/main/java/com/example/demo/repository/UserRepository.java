package com.example.demo.repository;


import com.example.demo.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;

public interface UserRepository extends JpaRepository<User, BigInteger> {

//    User findById(int id);//为什么参数类型不能写BigInteger?
//    User findByUserName(String username);
//    User findByUserNameOrEmail(String username, String email);

    @Transactional(timeout = 10)
    @Modifying
    @Query("update user set username = ?1where id = ?2")
    int modifyById(String username, BigInteger id);

    @Modifying
    @Query("delete from user where id = ?1")
    void deleteById(BigInteger id);

    // User findById(BigInteger id);//BigInteger参数类型问题

    @Modifying
    @Query("select u from user u where u.email = ?1")
//
    User findByEmail(String email);

    @Modifying
    @Query("select u from user u")
    Page<User> findAll(Pageable pageable);

    @Query("select u from user u where u.username = ?1")
    Page<User> findByUsername(String username);
}
