package com.steadwin.repository;
import com.steadwin.entity.UserData;

import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<UserData,Long >{

   
}
