package com.example.adiosesr.projecttraining.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity(tableName = "attachment",
        foreignKeys = @ForeignKey(entity = Task.class,
                parentColumns = "idTask",
                childColumns = "idTask",
                onDelete = CASCADE))
public class Attachment {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "idAttachment")
    private int idAttachment;

    @ColumnInfo(name = "uri")
    private String uri;
    @ColumnInfo(name = "typeAttachment")
    private String type;
    @ColumnInfo(name = "idTask")
    private int idTask;

    public Attachment() {
    }

    public int getIdAttachment() {
        return idAttachment;
    }

    public void setIdAttachment(int idAttachment) {
        this.idAttachment = idAttachment;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getIdTask() {
        return idTask;
    }

    public void setIdTask(int idTask) {
        this.idTask = idTask;
    }
}
