
package com.notification.notification_system.Rrepository;

import com.notification.notification_system.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository<User> extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}
