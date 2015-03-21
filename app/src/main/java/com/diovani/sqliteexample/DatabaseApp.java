package com.diovani.sqliteexample;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by diovani on 3/21/15.
 */
public class DatabaseApp extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "TravelDiary";
    public static final int DATABASE_VERSION = 1;

    public DatabaseApp(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i2) {

    }
}
