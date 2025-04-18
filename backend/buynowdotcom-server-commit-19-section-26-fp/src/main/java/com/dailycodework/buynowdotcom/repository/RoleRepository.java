package com.dailycodework.buynowdotcom.repository;

import com.dailycodework.buynowdotcom.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String userRole);
}
