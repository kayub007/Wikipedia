package com.example.wikipedia.Activities

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import com.example.wikipedia.Activities.Fragment.ExploreFragment
import com.example.wikipedia.Activities.Fragment.FavouritesFragment
import com.example.wikipedia.Activities.Fragment.HistoryFragment
import com.example.wikipedia.R
import kotlinx.android.synthetic.main.activity_article_detail.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_search.*

class MainActivity : AppCompatActivity() {

    private val exploreFragment : ExploreFragment
    private val favouritesFragment : FavouritesFragment
    private val historyFragment : HistoryFragment

    init {
        exploreFragment = ExploreFragment()
        favouritesFragment = FavouritesFragment()
        historyFragment = HistoryFragment()
    }
    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        val transaction = supportFragmentManager.beginTransaction()
        transaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)

        when (item.itemId){
            R.id.navigation_explore -> transaction.replace(R.id.fragment_container, exploreFragment)
            R.id.navigation_favourites -> transaction.replace(R.id.fragment_container, favouritesFragment)
            R.id.navigation_history -> transaction.replace(R.id.fragment_container, historyFragment)
        }
            transaction.commit()
        true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolBar)

        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.fragment_container, exploreFragment)
        transaction.commit()
    }
}
