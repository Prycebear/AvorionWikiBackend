package com.example.dndavorionwikibackend.Model.Groups;

import com.example.dndavorionwikibackend.Model.Characters.NonPlayerCharacter;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToOne;

@MappedSuperclass
public class GroupSuper {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GROUP_ID", nullable = false, unique = true)
    private long groupId;

    @Column(name = "GROUP_NAME")
    private String groupName;

    @OneToOne
    @JoinColumn(name = "CULT_LEADER_ID", referencedColumnName = "")
    private NonPlayerCharacter groupLeader;

    @Column(name = "SHORT_GROUP_DESCRIPTION")
    private String shortGroupDescription;

    @Column(name = "GROUP_DESCRIPTION", columnDefinition = "TEXT")
    private String groupDescription;
}
