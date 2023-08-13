package com.example.dndavorionwikibackend.Model.FantayRole;

import com.example.dndavorionwikibackend.Model.Characters.NonPlayerCharacter;
import com.example.dndavorionwikibackend.Model.Characters.PlayerCharacter;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.util.Set;

@Entity
@Table(name = "FANTASY_ROLE")
public class FantasyRole {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ROLE_ID", nullable = false, unique = true)
    private long roleId;

    @OneToMany
    @JoinColumn(name = "CHARACTER_ROLE")
    private Set<PlayerCharacter> characterRole;

    @OneToMany
    private Set<NonPlayerCharacter> npcharacterRole;

    private String roleName;

    @Column(columnDefinition = "TEXT")
    private String roleDescription;

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public Set<PlayerCharacter> getCharacterRole() {
        return characterRole;
    }

    public void setCharacterRole(Set<PlayerCharacter> characterRole) {
        this.characterRole = characterRole;
    }

    public Set<NonPlayerCharacter> getNpcharacterRole() {
        return npcharacterRole;
    }

    public void setNpcharacterRole(Set<NonPlayerCharacter> npcharacterRole) {
        this.npcharacterRole = npcharacterRole;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }
}
