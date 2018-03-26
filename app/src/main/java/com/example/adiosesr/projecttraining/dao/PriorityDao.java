package com.example.adiosesr.projecttraining.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.adiosesr.projecttraining.entity.Priority;
import com.example.adiosesr.projecttraining.util.Constants;

import java.util.List;

@Dao
public interface PriorityDao {
    @Query("SELECT * FROM "+ Constants.TABLE_NAME_PRIORITY)
    List<Priority> getAllPriority();
//
//    @Query("SELECT descPriority FROM " + Constants.TABLE_NAME_PRIORITY + " WHERE descPriority LIKE:descPriority")
//    Task findByDescPriority(String descPriority);

    @Insert
    void addPriority(Priority priority);

    @Update
    void updatePriority(Priority priority);

    @Delete
    void deletePriority(Priority priority);

    @Query("DELETE FROM " + Constants.TABLE_NAME_PRIORITY)
    void deleteAllPriority();

}
