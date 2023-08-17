package com.example.dndavorionwikibackend.Model.Campaign;

import com.example.dndavorionwikibackend.Model.Characters.NonPlayerCharacter;
import com.example.dndavorionwikibackend.Model.Characters.PlayerCharacter;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.Set;

@Entity
@Table(name = "SESSION")
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SESSION_ID", nullable = false, unique = true)
    private long sessionId;

    private String sessionTitle;

    private String shortSessionDescription;

    @ManyToOne
    @JoinColumn(name="CAMPAIGN_ID", nullable=false)
    private Campaign campaign;

    @ManyToMany
    @JoinTable(
            name = "NPC_IN_SESSION",
            joinColumns = @JoinColumn(name = "CHARACTER_ID"),
            inverseJoinColumns = @JoinColumn(name = "SESSION_ID"))
    private Set<NonPlayerCharacter> nonPlayerCharacters;
}
