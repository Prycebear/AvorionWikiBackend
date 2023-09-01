package com.example.dndavorionwikibackend.Model.Calendar;

import com.example.dndavorionwikibackend.Model.History.History;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.Set;

@Entity
@Table(name = "WORLD_DATE")
public class WorldDate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "WORLD_DATE_ID", nullable = false, unique = true)
    private long worldDateId;

    @Column(name = "DAY_DATE")
    private int dayDate;

    @Column(name = "MONTH_DATE")
    private String monthDate;

    @Column(name = "WORLD_YEAR")
    private int worldYear;

    @ManyToMany
    @JoinTable(
            name = "DATE_OF_HISTORY",
            joinColumns = @JoinColumn(name = "HISTORY_ID"),
            inverseJoinColumns = @JoinColumn(name = "WORLD_DATE_ID"))
    private Set<History> histories;


}
