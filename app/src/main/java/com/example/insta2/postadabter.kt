package com.example.insta2

import android.content.Context
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import io.github.farshidroohi.AdapterRecyclerView

class postadabter : AdapterRecyclerView<Userpost>(R.layout.post_itemm,0,0,0) {
    override fun onBindView(
        viewHolder: ItemViewHolder,
        position: Int,
        context: Context,
        element: Userpost?
    ) {
        var view=viewHolder.itemView
        var txtusername=view.findViewById<TextView>(R.id.txtusername)
        txtusername.text= element?.username
    }

}


