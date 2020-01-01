package com.through.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.through.entity.User;

/**
 * 
 * <p>Title: UserDao.java</p>
 * @author TAO
 */
@Repository
public interface UserDao extends JpaRepository<User, Long>{

}
