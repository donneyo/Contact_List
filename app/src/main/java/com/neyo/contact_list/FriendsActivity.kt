package com.neyo.contact_list

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neyo.contact_list.databinding.ActivityFamilyBinding
import com.neyo.contact_list.databinding.ActivityFriendsBinding

class FriendsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFriendsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFriendsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        this.setTitle("Friends")


        binding.friendsBt.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            this.setTitle("Friends")
        }

    }
}