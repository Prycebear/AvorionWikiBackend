package com.example.dndavorionwikibackend.Model.Gods;

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
@Table(name = "GODS")
public class Gods {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GODS_ID", nullable = false, unique = true)
    private long groupId;

    private String godsName;

    @Column(columnDefinition = "TEXT")
    private String godsDescription;

    private String godsDomain;

    private String godLevel;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "CHARACTER_ID")
    private Set<PlayerCharacter> characterGod;

}
