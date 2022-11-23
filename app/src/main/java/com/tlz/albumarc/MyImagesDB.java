package com.tlz.albumarc;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = MyImages.class, version = 1)
public abstract class MyImagesDB extends RoomDatabase {

    private static MyImagesDB instance;
    public abstract MyImagesDAO myImagesDAO();

    public static synchronized MyImagesDB getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    MyImagesDB.class, "my_images_database")
                    .fallbackToDestructiveMigration()
                    .build();
        }

        return instance;
    }
}
