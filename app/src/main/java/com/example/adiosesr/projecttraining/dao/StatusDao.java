package com.example.adiosesr.projecttraining.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.adiosesr.projecttraining.entity.Status;
import com.example.adiosesr.projecttraining.util.Constants;

import java.util.List;

@Dao
public interface StatusDao {

    @Query("SELECT * FROM " + Constants.TABLE_NAME_STATUS)
    List<Status> getAllStatus();

    @Insert
    void addStatus(Status status);

    @Update
    void updateStatus(Status status);

    @Delete
    void deleteStatus(Status status);

    @Query("DELETE FROM " + Constants.TABLE_NAME_STATUS)
    void deleteAllStatus();
}
