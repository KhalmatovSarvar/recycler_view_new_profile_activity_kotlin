package com.example.recycler_view_new_profile_activity_kotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycler_view_new_profile_activity_kotlin.R
import com.example.recycler_view_new_profile_activity_kotlin.activity.MainActivity
import com.example.recycler_view_new_profile_activity_kotlin.model.Member

class MemberAdapter(var activity: MainActivity,var members:ArrayList<Member>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false)
        return MemberViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var member = members[position]
        if (holder is MemberViewHolder){
            var lay_click =holder.lay_click
            var tv_name = holder.tv_name

            tv_name.text = member.toString()

            lay_click.setOnClickListener {
                    activity.openProfileActivity(member)
            }


        }
    }

    override fun getItemCount(): Int {
        return members.size
    }
}

class MemberViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    var tv_name: TextView
    var lay_click:LinearLayout

    init {
        tv_name = view.findViewById(R.id.tv_name)
        lay_click = view.findViewById(R.id.item_id)
    }


}
