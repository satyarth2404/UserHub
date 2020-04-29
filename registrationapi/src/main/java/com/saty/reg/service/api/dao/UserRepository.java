package com.saty.reg.service.api.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saty.reg.service.api.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	List<User> findByEmail(String email);

}
