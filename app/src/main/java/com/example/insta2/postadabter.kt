package com.example.insta2

import android.content.Context
import android.widget.GridView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
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
        var postmedia=view.findViewById<ImageView>(R.id.imageView2)
        var like = view.findViewById<TextView>(R.id.userlike)
        var comment =view.findViewById<TextView>(R.id.usercomment)
        var Description = view.findViewById<TextView>(R.id.textView30)


        txtusername.text= element?.username
        like.text=element?.userid
        comment.text=element?.duration
        Description.text=element?.title

        Glide.with(context)
            .load(element?.username)
            .placeholder(R.drawable.baseline_download_24)
            .into(postmedia)

    }

}


