package com.example.recycler_view_new_profile_activity_kotlin.activity

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.recycler_view_new_profile_activity_kotlin.R
import com.example.recycler_view_new_profile_activity_kotlin.model.Member

class ProfileActivity : AppCompatActivity()  {

    lateinit var tv :TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        initViews()

    }

    private fun initViews() {

        tv = findViewById(R.id.tv_profile)

        var intent = intent.getParcelableExtra<Member>("Object")

        tv.text = intent.toString()


    }
}