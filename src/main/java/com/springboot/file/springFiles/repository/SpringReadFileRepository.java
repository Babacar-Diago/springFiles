package com.springboot.file.springFiles.repository;

import com.springboot.file.springFiles.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringReadFileRepository extends JpaRepository<User, Long> {

}
