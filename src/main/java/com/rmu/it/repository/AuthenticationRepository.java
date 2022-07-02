package com.rmu.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rmu.it.entity.UserEntity;


@Repository
public interface AuthenticationRepository extends JpaRepository<UserEntity,Long>{

}
