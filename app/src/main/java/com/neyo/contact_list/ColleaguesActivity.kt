package com.neyo.contact_list

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neyo.contact_list.databinding.ActivityColleaguesBinding
import com.neyo.contact_list.databinding.ActivityFriendsBinding

class ColleaguesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityColleaguesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityColleaguesBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        this.setTitle("Colleagues")

        binding.colleaguesBt.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            this.setTitle("Colleagues")
        }

    }
}