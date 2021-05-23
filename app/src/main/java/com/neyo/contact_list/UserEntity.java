package com.neyo.contact_list;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "users")
public class UserEntity {


    @PrimaryKey(autoGenerate = true)
    Integer id;


    @ColumnInfo(name = "userid")
    String userid;

    @ColumnInfo(name = "password")
    String password;

    @ColumnInfo(name = "name")
    String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

     /*   @Query("SELECT * FROM note")
        fun selectAllNotes():List<NoteEntity>

        @Insert

        fun insertNotes(noteEntity:NoteEntity)

        @Delete
        fun deleteNotes(noteEntity:NoteEntity)

        @Update
        fun updateNotes(noteEntity:NoteEntity)

    }
}*/