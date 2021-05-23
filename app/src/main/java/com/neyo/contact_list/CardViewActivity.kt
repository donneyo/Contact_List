package com.neyo.contact_list

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neyo.contact_list.databinding.ActivityCardViewBinding

class CardViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCardViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCardViewBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.tvFamily.setOnClickListener {
            startActivity(Intent(this, FamilyActivity::class.java))
            this.setTitle("Family")
        }

        binding.tvColleages.setOnClickListener {
            startActivity(Intent(this, ColleaguesActivity::class.java))
            this.setTitle("Colleages")
        }

        binding.tvFriends.setOnClickListener {
            startActivity(Intent(this, FriendsActivity::class.java))
            this.setTitle("Friends")
        }

        binding.tvTutors.setOnClickListener {
            startActivity(Intent(this, TutorsActivity::class.java))
            this.setTitle("Tutors")
        }
    }
}