package com.npksahakari.system.repository;

import com.npksahakari.system.enumconstants.ERole;
import com.npksahakari.system.models.security.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByName(ERole name);
}
