package com.example.dndavorionwikibackend.Model.FantayRole;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Set;

@Entity
@Table(name = "FANTASY_ROLE")
public class FantasyRole {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ROLE_ID", nullable = false, unique = true)
    private long roleId;

}
