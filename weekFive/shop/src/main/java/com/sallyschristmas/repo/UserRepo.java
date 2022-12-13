package com.sallyschristmas.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sallyschristmas.entity.Sapp;

@Repository
public interface UserRepo extends JpaRepository<Sapp, Integer> {
   
    @Query(value="select * from sapp where username=?1 and password=?2", nativeQuery = true)
    public Sapp findByEmailAndPassword(String username, String password);
}
