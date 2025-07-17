package com.vasu.electronic.store.repositories;

import com.vasu.electronic.store.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,String> {

    //It is a Data Access Layer (DAL) interface used to interact with the User entity in the database.

    //By extending JpaRepository<User, String>, you get built-in CRUD methods like:
    //findById(String id)

    //findAll()

    //save(User user)

    //delete(User user)

    //deleteById(String id)
        Optional<User> findByEmail(String email);
        Optional<User> findByEmailAndPassword(String email, String password);
        List<User> findByNameContaining(String keywords);

}

