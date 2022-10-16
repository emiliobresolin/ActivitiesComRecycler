package com.example.activitiescomrecycler.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper
{
    public static final String DBNAME = "login.db";

    public DBHelper( Context context) {
        super(context, "login.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase MyDB)
    {
        MyDB.execSQL("create Table users(loginUser TEXT primary key, passwordUser TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase MyDB, int i, int i1)
    {
        MyDB.execSQL("drop table if exists users");
    }

    public boolean insertData(String loginUser, String passwordUser)
    {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("login", loginUser);
        contentValues.put("password", passwordUser);
        long result = MyDB.insert("users", null, contentValues);
        if(result==1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public Boolean checkuserlogin(String loginUser)
    {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("select * from users where loginUser = ?",
                new String[] {loginUser});
        if(cursor.getCount()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean checkuserpassword(String loginUser, String passwordUser)
    {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("select * from users where loginUser = ? and passwordUser = ?",
                new String[] {loginUser, passwordUser});
        if (cursor.getCount()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
