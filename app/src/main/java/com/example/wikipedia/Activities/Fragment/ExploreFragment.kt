package com.example.wikipedia.Activities.Fragment


import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.CardView
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wikipedia.Activities.Adapter.ArticleCardRecyclerAdapter
import com.example.wikipedia.Activities.SearchActivity

import com.example.wikipedia.R
import kotlinx.android.synthetic.main.fragment_explor.*

/**
 * A simple [Fragment] subclass.
 *
 */
class ExploreFragment : Fragment() {

    var searchCardView : CardView? = null
    var exploreRecycler : RecyclerView? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //inflate the layout for this fragment
        var view = inflater!!.inflate(R.layout.fragment_explor, container,false)

        searchCardView = view.findViewById<CardView>(R.id.search_card_view)
        exploreRecycler = view.findViewById<RecyclerView>(R.id.explor_article_recycler)

        searchCardView!!.setOnClickListener {
            val searchIntent = Intent(context, SearchActivity::class.java)
            context!!.startActivity(searchIntent)
        }

        exploreRecycler!!.layoutManager = LinearLayoutManager(context)
        exploreRecycler!!.adapter = ArticleCardRecyclerAdapter()

        return view
    }

}
