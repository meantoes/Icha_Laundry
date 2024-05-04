package com.example.ichalaundry;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.ichalaundry.LaundryDao;
import com.example.ichalaundry.ModelLaundry;

@Database(entities = {ModelLaundry.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract LaundryDao laundryDao();
}