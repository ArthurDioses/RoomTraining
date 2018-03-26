package com.example.adiosesr.projecttraining.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "priority")
public class Priority {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "idPriority")
    private int idPriority;

    @ColumnInfo(name = "descPriority")
    private String descPriority;

    public Priority() {
    }

    public int getIdPriority() {
        return idPriority;
    }

    public void setIdPriority(int idPriority) {
        this.idPriority = idPriority;
    }

    public String getDescPriority() {
        return descPriority;
    }

    public void setDescPriority(String descPriority) {
        this.descPriority = descPriority;
    }
}
