package com.example.dndavorionwikibackend.Model.Groups;

import com.example.dndavorionwikibackend.Model.Gods.Gods;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.Set;

@Entity
@Table(name = "Cults")
public class Cults extends GroupSuper{

    @OneToMany
    @JoinColumn(name = "CULTS_ID")
    private Set<Gods> cultGods;
}
