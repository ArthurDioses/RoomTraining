package com.example.adiosesr.projecttraining.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.adiosesr.projecttraining.entity.Task;
import com.example.adiosesr.projecttraining.util.Constants;

import java.util.List;

@Dao
public interface TaskDao {
    @Query("SELECT * FROM " + Constants.TABLE_NAME_TASK +" ORDER BY title ASC")
    List<Task> getAllTask();

//    @Query("SELECT * FROM "+Constants.TABLE_NAME_TASK+" WHERE descTask LIKE:descTask")
//    Task findByDesTask(String descTask);

    @Insert
    void addTask(Task task);

    @Update
    void updateTask(Task task);

    @Delete
    void deleteTask(Task task);

    @Query("DELETE FROM "+Constants.TABLE_NAME_TASK)
    void deleteAllTask();
}
