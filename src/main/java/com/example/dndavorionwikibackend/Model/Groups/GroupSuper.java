package com.example.dndavorionwikibackend.Model.Groups;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class GroupSuper {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GROUP_ID", nullable = false, unique = true)
    private long groupId;

    private String groupName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CHARACTER_ID", referencedColumnName = "")
    private Character groupLeader;
}
