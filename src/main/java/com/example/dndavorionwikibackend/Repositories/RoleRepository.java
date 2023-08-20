package com.example.dndavorionwikibackend.Repositories;

import com.example.dndavorionwikibackend.Model.User.Role;
import com.example.dndavorionwikibackend.Model.User.ERole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(ERole name);
}
