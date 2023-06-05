package com.avseenkov.tacos.repository;

import com.avseenkov.tacos.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
