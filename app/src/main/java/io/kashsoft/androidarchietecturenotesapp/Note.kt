package io.kashsoft.androidarchietecturenotesapp

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes_table")
class Note (@ColumnInfo(name ="text")val text:String)
{        // coloums are made here
    @PrimaryKey(autoGenerate = true) var id = 0



}