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

    public void addContact(String description, String Deadline) {

String s="select * from tasks";
        SQLiteDatabase db = getWritableDatabase();
        String sql_INSERT = "INSERT INTO contacts (description,Deadline) values(?,?)";
        SQLiteStatement statement = db.compileStatement(sql_INSERT);

        statement.bindString(1, description);
        statement.bindString(2, Deadline);
        statement.execute();
    }
    public ArrayList<Task> getAllTasks() {
        ArrayList<Task> ary = new ArrayList<>();
        String st = "SELECT * from tasks";
        SQLiteDatabase db = getWritableDatabase();
        Cursor cursor = db.rawQuery(st, null);
        while (cursor.moveToNext()) {
            Task t =new Task();
            t.setDescription(cursor.getString(cursor.getColumnIndex("description")));
            t.setDeadline(cursor.getString(cursor.getColumnIndex("deadline")));
            ary.add(t);
        }
        if(ary.size()==0) {
            Task T=new Task();
            T.setDescription("damn");
            T.setDeadline("it");
            ary.add(T);
            return ary;
        }
      else   return ary;

    }
}
