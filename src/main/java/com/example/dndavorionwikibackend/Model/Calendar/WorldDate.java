package com.example.dndavorionwikibackend.Model.Calendar;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

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


}
