package com.example.adiosesr.projecttraining.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.adiosesr.projecttraining.entity.Attachment;
import com.example.adiosesr.projecttraining.entity.Task;
import com.example.adiosesr.projecttraining.util.Constants;

import java.util.List;

@Dao
public interface AttachmentDao {
    @Query("SELECT * FROM " + Constants.TABLE_NAME_ATTACHMENT + " ORDER BY typeAttachment  ASC")
    List<Task> getAllTypeTask();

//    @Query("SELECT * FROM " + Constants.TABLE_NAME_ATTACHMENT + " WHERE typeAttachment LIKE:typeAttachment")
//    Task findByTypeAttachment(String typeAttachment);

    @Insert
    void addAttachment(Attachment attachment);

    @Update
    void updateAttachment(Attachment attachment);

    @Delete
    void deleteAttachment(Attachment attachment);

    @Query("DELETE FROM " + Constants.TABLE_NAME_ATTACHMENT)
    void deleteAllAttachment();
}
