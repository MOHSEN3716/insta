package com.example.insta2

import android.content.Context
import android.media.Image
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import io.github.farshidroohi.AdapterRecyclerView

class storyadapter:AdapterRecyclerView<Userpost>(R.layout.story_itemm,0,0,0) {
    override fun onBindView(
        viewHolder: ItemViewHolder,
        position: Int,
        context: Context,
        element: Userpost?
    ) {
        var view=viewHolder.itemView
        var story = view.findViewById<TextView>(R.id.textViewstory)
        story.text=element?.sdate





    }
}
