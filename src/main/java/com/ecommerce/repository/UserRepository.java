package com.ecommerce.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ecommerce.entity.User;

public class UserRepository extends JpaRepository<User, Long> {
    public Optional<User> findByUsername(String username);
    public Optional<User> findByEmail(String email);
    public boolean existsByUsername(String username);
    public boolean existsByEmail(String email);
    @Query("SELECT u FROM User u WHERE u.username = ?1 OR u.email = ?2")
    public Optional<User> findByUsernameOrEmail(String username, String email);
    // @Query("SELECT u FROM User u WHERE u.username = :username OR u.email = :email")
    // Optional<User> findByUsernameOrEmail(@Param("username") String username, @Param("email")String email);

}
