package com.example.wikipedia.Activities.Adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.wikipedia.Activities.Holders.CardHolder
import com.example.wikipedia.Activities.Holders.ListItemHolder
import com.example.wikipedia.R

class ArticleListitemRecyclerAdapter() : RecyclerView.Adapter<ListItemHolder>() {

    override fun getItemCount(): Int {
        return 15// temporary
    }

    override fun onBindViewHolder(holder: ListItemHolder, position: Int) {
        //this is where we will update our view
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemHolder {
        var cardItem = LayoutInflater.from(parent?.context).inflate(R.layout.article_list_item, parent, false)
        return ListItemHolder(cardItem)
    }
}