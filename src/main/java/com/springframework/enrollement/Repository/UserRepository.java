package com.springframework.enrollement.Repository;

import com.springframework.enrollement.Entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
