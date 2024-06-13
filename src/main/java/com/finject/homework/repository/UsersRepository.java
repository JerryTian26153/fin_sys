package com.finject.homework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finject.homework.entity.Users;
@Repository
public interface UsersRepository extends JpaRepository<Users, String> {

}
