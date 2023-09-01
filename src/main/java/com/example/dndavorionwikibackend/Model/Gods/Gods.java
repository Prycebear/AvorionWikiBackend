package com.example.dndavorionwikibackend.Model.Gods;

import com.example.dndavorionwikibackend.Model.Characters.PlayerCharacter;
import com.example.dndavorionwikibackend.Model.Groups.Cults;
import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @JsonIgnore
    @OneToMany
    @JoinColumn(name = "GODS_ID")
    private Set<PlayerCharacter> characterGod;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="CULTS_ID", nullable=false)
    private Cults cults;

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getGodsName() {
        return godsName;
    }

    public void setGodsName(String godsName) {
        this.godsName = godsName;
    }

    public String getGodsDescription() {
        return godsDescription;
    }

    public void setGodsDescription(String godsDescription) {
        this.godsDescription = godsDescription;
    }

    public String getGodsDomain() {
        return godsDomain;
    }

    public void setGodsDomain(String godsDomain) {
        this.godsDomain = godsDomain;
    }

    public String getGodLevel() {
        return godLevel;
    }

    public void setGodLevel(String godLevel) {
        this.godLevel = godLevel;
    }

    public Set<PlayerCharacter> getCharacterGod() {
        return characterGod;
    }

    public void setCharacterGod(Set<PlayerCharacter> characterGod) {
        this.characterGod = characterGod;
    }

    public Cults getCults() {
        return cults;
    }

    public void setCults(Cults cults) {
        this.cults = cults;
    }
}
