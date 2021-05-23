package com.neyo.contact_list

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neyo.contact_list.databinding.ActivityCardViewBinding
import com.neyo.contact_list.databinding.ActivityFamilyBinding

class FamilyActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFamilyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFamilyBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        this.setTitle("Family")


        binding.familyBt.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            this.setTitle("Family")
        }

    }
}