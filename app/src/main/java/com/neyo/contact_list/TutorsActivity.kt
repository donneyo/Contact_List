package com.neyo.contact_list

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neyo.contact_list.databinding.ActivityFriendsBinding
import com.neyo.contact_list.databinding.ActivityTutorsBinding

class TutorsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTutorsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTutorsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        this.setTitle("Tutors")

        binding.TutorsBt.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            this.setTitle("Tutors")
        }

    }
}