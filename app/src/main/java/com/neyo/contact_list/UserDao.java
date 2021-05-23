package com.neyo.contact_list;


import androidx.room.Dao;
import androidx.room.Insert;

import com.neyo.contact_list.UserEntity;

@Dao
public interface UserDao {

    @Insert
    void registerUser(UserEntity userEntity);

}
