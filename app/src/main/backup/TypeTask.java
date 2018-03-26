package com.example.adiosesr.projecttraining.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "type_task")
public class TypeTask {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "idTypeTask")
    private int idTypeTask;

    @ColumnInfo(name = "descTypeTask")
    private String descTypeTask;

    public TypeTask() {
    }

    public int getIdTypeTask() {
        return idTypeTask;
    }

    public void setIdTypeTask(int idTypeTask) {
        this.idTypeTask = idTypeTask;
    }

    public String getDescTypeTask() {
        return descTypeTask;
    }

    public void setDescTypeTask(String descTypeTask) {
        this.descTypeTask = descTypeTask;
    }
}
