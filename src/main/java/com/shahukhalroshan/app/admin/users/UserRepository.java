package com.shahukhalroshan.app.admin.users;

import org.springframework.data.repository.CrudRepository;

import com.shahukhalroshan.app.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
