package com.example.dndavorionwikibackend.DTO.GodsDTO;

import com.example.dndavorionwikibackend.Model.Characters.PlayerCharacter;
import com.example.dndavorionwikibackend.Model.Groups.Cults;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.Set;

public class GodsDTO {

    private Long godsId;

    private String godsName;

    private String godsDescription;

    private String godsDomain;

    private String godLevel;

    private Set<PlayerCharacter> characterGod;

    private Cults cults;
}
