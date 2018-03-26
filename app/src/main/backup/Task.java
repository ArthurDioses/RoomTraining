package com.example.adiosesr.projecttraining.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity(tableName = "task",
        foreignKeys = {@ForeignKey(entity = TypeTask.class,
                parentColumns = "idTypeTask",
                childColumns = "idTypeTask",
                onDelete = CASCADE),
                @ForeignKey(entity = Priority.class,
                        parentColumns = "idPriority",
                        childColumns = "idPriority",
                        onDelete = CASCADE),
                @ForeignKey(entity = Status.class,
                        parentColumns = "idStatus",
                        childColumns = "idPriority",
                        onDelete = CASCADE)})

public class Task {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "idTask")
    private int idTask;

    @ColumnInfo(name = "title")
    private String title;

    @ColumnInfo(name = "descTask")
    private String descTask;

    @ColumnInfo(name = "dateEnd")
    private long dateEnd;
    @ColumnInfo(name = "idTypeTask")
    private int idTypeTask;
    @ColumnInfo(name = "idPriority")
    private int idPriority;
    @ColumnInfo(name = "idStatus")
    private int idStatus;

    public Task() {
    }

    public int getIdTask() {
        return idTask;
    }

    public void setIdTask(int idTask) {
        this.idTask = idTask;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescTask() {
        return descTask;
    }

    public void setDescTask(String descTask) {
        this.descTask = descTask;
    }

    public long getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(long dateEnd) {
        this.dateEnd = dateEnd;
    }

    public int getIdTypeTask() {
        return idTypeTask;
    }

    public void setIdTypeTask(int idTypeTask) {
        this.idTypeTask = idTypeTask;
    }

    public int getIdPriority() {
        return idPriority;
    }

    public void setIdPriority(int idPriority) {
        this.idPriority = idPriority;
    }

    public int getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(int idStatus) {
        this.idStatus = idStatus;
    }
}
