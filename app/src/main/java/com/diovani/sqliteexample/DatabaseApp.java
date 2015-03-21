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
    public void onCreate(SQLiteDatabase db) {
        StringBuilder cmd = new StringBuilder();
        cmd.append(" CREATE TABLE locations ( ");
        cmd.append("    id INTEGER NOT NULL, ");
        cmd.append("    description VARCHAR(120) NOT NULL, ");
        cmd.append("    date TIMESTAMP, ");
        cmd.append("    notes VARCHAR, ");
        cmd.append("    photo BYTES, ");

        cmd.append("    PRIMARY KEY (id) ");
        cmd.append(" ); ");

        db.execSQL(cmd.toString());
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i2) {

    }
}
