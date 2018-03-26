package com.example.adiosesr.projecttraining.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.adiosesr.projecttraining.entity.Task;
import com.example.adiosesr.projecttraining.entity.TypeTask;
import com.example.adiosesr.projecttraining.util.Constants;

import java.util.List;

@Dao
public interface TypeTaskDao {

    @Query("SELECT * FROM " + Constants.TABLE_NAME_TYPE_TASK)
    List<TypeTaskDao> getAllTypeTask();

//    @Query("SELECT * FROM " + Constants.TABLE_NAME_TYPE_TASK + " WHERE descTypeTask LIKE:descTypeTask")
//    Task findByDescTypeTask(String descTypeTask);

    @Insert
    void addTask(TypeTask typeTask);

    @Update
    void updateTask(TypeTask typeTask);

    @Delete
    void deleteTask(TypeTask typeTask);

    @Query("DELETE FROM " + Constants.TABLE_NAME_TYPE_TASK)
    void deleteAllTypeTask();
}
