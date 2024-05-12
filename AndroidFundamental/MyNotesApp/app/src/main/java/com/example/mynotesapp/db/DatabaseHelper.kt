package com.example.mynotesapp.db

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.mynotesapp.db.DatabaseContract.NoteColumns.Companion.TABLE_NAME

class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION){
    companion object{
        private const val DATABASE_NAME = "dbnoteapp"

        private const val DATABASE_VERSION = 1

        private const val SQL_CREATE_TABLE_NOTE = "create table $TABLE_NAME" +
                "(${DatabaseContract.NoteColumns._ID} integer primary key autoincrement," +
                "${DatabaseContract.NoteColumns.TITLE} text not null," +
                "${DatabaseContract.NoteColumns.DESCRIPTION} text not null," +
                "${DatabaseContract.NoteColumns.DATE} text not null)"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(SQL_CREATE_TABLE_NOTE)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("drop table if exists $TABLE_NAME")
        onCreate(db)
    }
}