package com.example.dndavorionwikibackend.Model.Gods;

import com.example.dndavorionwikibackend.Model.Campaign.Campaign;
import com.example.dndavorionwikibackend.Model.Characters.PlayerCharacter;
import com.example.dndavorionwikibackend.Model.Groups.Cults;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.Set;

@Entity
@Table(name = "GODS")
public class Gods {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GODS_ID", nullable = false, unique = true)
    private Long groupId;

    @Column(name = "GODS_NAME")
    private String godsName;

    @Column(columnDefinition = "TEXT", name = "GODS_DESCRIPTION")
    private String godsDescription;

    @Column(name = "GODS_DOMAIN")
    private String godsDomain;

    @Column(name = "GODS_LEVEL")
    private String godLevel;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "GODS_ID")
    private Set<PlayerCharacter> characterGod;

    @ManyToOne
    @JoinColumn(name="CULTS_ID", nullable=false)
    private Cults cults;

}
