package com.example.todolistapp.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class TaskDbHelper extends SQLiteOpenHelper {

    public TaskDbHelper(Context context) {
        super(context, com.example.todolistapp.db.TaskContract.DB_NAME, null, com.example.todolistapp.db.TaskContract.DB_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + com.example.todolistapp.db.TaskContract.TaskEntry.TABLE + " ( " +
                com.example.todolistapp.db.TaskContract.TaskEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                com.example.todolistapp.db.TaskContract.TaskEntry.COL_TASK_TITLE + " TEXT NOT NULL);";

        db.execSQL(createTable);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //db.execSQL("DROP TABLE IF EXISTS " + TaskContract.TaskEntry.TABLE);
        //onCreate(db);
    }
}
