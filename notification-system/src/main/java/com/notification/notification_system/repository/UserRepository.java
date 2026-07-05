package com.notification.notification_system.repository;

import com.notification.notification_system.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> { // <-- Must specify <User, Long>
    Optional<User> findByEmail(String email);
}