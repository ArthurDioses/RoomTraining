package com.example.adiosesr.projecttraining.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.example.adiosesr.projecttraining.dao.PriorityDao;
import com.example.adiosesr.projecttraining.dao.StatusDao;

import com.example.adiosesr.projecttraining.entity.Priority;
import com.example.adiosesr.projecttraining.entity.Status;

import com.example.adiosesr.projecttraining.util.Constants;

@Database(entities = { Priority.class, Status.class,}, version = 1)
public abstract class AppDataBase extends RoomDatabase {
    private static AppDataBase INSTANCE;

//    public abstract TaskDao taskDao();
    public abstract PriorityDao priorityDao();
    public abstract StatusDao statusDao();
    //public abstract TypeTaskDao typeTaskDao();

    public static AppDataBase getAppDataBase(Context context) {
        if (null == INSTANCE) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(), AppDataBase.class, Constants.DB_NAME).
                    allowMainThreadQueries().build();
        }
        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }
}
