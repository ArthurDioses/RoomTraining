package com.example.adiosesr.projecttraining.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "status")
public class Status {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "idStatus")
    private int idStatus;

    @ColumnInfo(name = "descStatus")
    private String descStatus;

    public Status() {
    }

    public int getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(int idStatus) {
        this.idStatus = idStatus;
    }

    public String getDescStatus() {
        return descStatus;
    }

    public void setDescStatus(String descStatus) {
        this.descStatus = descStatus;
    }
}
