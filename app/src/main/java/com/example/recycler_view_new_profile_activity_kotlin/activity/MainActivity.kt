package com.example.recycler_view_new_profile_activity_kotlin.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycler_view_new_profile_activity_kotlin.R
import com.example.recycler_view_new_profile_activity_kotlin.adapter.MemberAdapter
import com.example.recycler_view_new_profile_activity_kotlin.model.Member

class MainActivity : AppCompatActivity() {
    lateinit var recryclerView: RecyclerView
    lateinit var item_layout:LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            initViews()
    }

    private fun initViews() {
        recryclerView = findViewById(R.id.recycler_view)
        recryclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        refreshAdapter(getMembers())

    }

    public fun openProfileActivity(member: Member) {
        val intent = Intent(this,ProfileActivity::class.java)
       intent.putExtra("Object",member)
        startActivity(intent)
    }

    private fun refreshAdapter(members: ArrayList<Member>) {
        val adapter = MemberAdapter(this,members)
        recryclerView.adapter = adapter
    }

    private fun getMembers(): ArrayList<Member> {
        var members:ArrayList<Member> = ArrayList()
        for (i in 0..30){
            members.add(Member("Sarvar $i",10+i,'M'))
        }
        return members
    }
}