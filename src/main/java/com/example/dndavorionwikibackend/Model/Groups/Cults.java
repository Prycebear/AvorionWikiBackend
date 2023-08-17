package com.example.dndavorionwikibackend.Model.Groups;

import com.example.dndavorionwikibackend.Model.Characters.PlayerCharacter;
import com.example.dndavorionwikibackend.Model.Gods.Gods;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.Set;

@Entity
@Table(name = "Cults")
public class Cults extends GroupSuper{

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "CULTS_ID")
    private Set<Gods> cultGods;
}
