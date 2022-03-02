package com.ibs.training.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibs.training.user.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{


}
