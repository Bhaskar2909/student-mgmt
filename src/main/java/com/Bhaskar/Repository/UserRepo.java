package com.Bhaskar.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Bhaskar.Entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	
	public User findByEmail(String email);
	
    public User findByEmailAndPwd(String email,String pwd);

}

