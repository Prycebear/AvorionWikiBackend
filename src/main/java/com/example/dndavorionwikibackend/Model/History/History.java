package com.example.dndavorionwikibackend.Model.History;

import com.example.dndavorionwikibackend.Model.Calendar.WorldDate;
import com.example.dndavorionwikibackend.Model.Campaign.Session;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.Set;

@Entity
@Table(name = "HISTORY")
public class History {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HISTORY_ID", nullable = false, unique = true)
    private long historyId;

    @ManyToMany(mappedBy = "histories")
    private Set<WorldDate> worldDates;
}
