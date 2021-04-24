package com.example.shlominaveproject;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

import java.util.ArrayList;

public class Dal extends SQLiteAssetHelper {
    public Dal(Context context) {

        super(context, "shlomiprojects_DB.db", null, 1);
    }

    public void addContact(String description, String deadline) {

String s="select * from tasks";
        SQLiteDatabase db = getWritableDatabase();
        String sql_INSERT = "INSERT INTO tasks (description,deadline) values(?,?)";
        SQLiteStatement statement = db.compileStatement(sql_INSERT);

        statement.bindString(1, description);
        statement.bindString(2, deadline);
        statement.execute();
    }
    public ArrayList<Task> getAllTasks() {
        ArrayList<Task> ary = new ArrayList<>();
        String st = "SELECT * from tasks";
        SQLiteDatabase db = getWritableDatabase();
        Cursor cursor = db.rawQuery(st,null);
        while (cursor.moveToNext()) {
            Task t =new Task();
            t.setDescription(cursor.getString(cursor.getColumnIndex("description")));
            t.setDeadline(cursor.getString(cursor.getColumnIndex("deadline")));
            ary.add(t);
        }

          return ary;

        }


    }

