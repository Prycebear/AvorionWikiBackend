package com.example.dndavorionwikibackend.Model.User;

import com.example.dndavorionwikibackend.Model.Characters.PlayerCharacter;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.Set;

@Entity
@Table(name = "APPLICATION_USER")
public class ApplicationUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "APPLICATION_USER_ID", nullable = false, unique = true)
    private long applicationUserId;

    private String username;

    private String password;

    private String userRole;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "USER_TO_CHARACTER", referencedColumnName = "")
    private Set<PlayerCharacter> characters;
}
