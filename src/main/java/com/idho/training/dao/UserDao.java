package com.idho.training.dao;

import com.idho.training.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Idho
 */

public interface UserDao extends JpaRepository<User,Long> {

}
