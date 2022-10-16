/*package com.example.activitiescomrecycler.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DAO extends SQLiteOpenHelper
{
    public DAO(Context context)
    {
        super(context, "banco", null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase)
    {
        String sql_usuario = "CREATE TABLE usuarios (usuarios_login PRIMARY KEY, " +
                "usuarios_password TEXT UNIQUE NOT NULL);";
        db.execSQL(sql_usuario);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1)
    {
        String sql_upgrade_usuarios = "DROP TABLE if EXISTS usuarios;";
        db.execSQL(sql_upgrade_usuarios);
        onCreate(db);
    }
}*/