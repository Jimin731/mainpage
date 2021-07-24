package com.example.mainpage

import android.app.TabActivity
import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.TabHost
import android.widget.TabHost.TabSpec
import com.example.mainpage.R
import kotlinx.android.synthetic.main.activity_main.*

@Suppress("deprecation")
class MainActivity : TabActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabHost = this.tabHost

        val tabSpecHome = tabHost.newTabSpec("HOME").setIndicator("메인")
        tabSpecHome.setContent(R.id.tabHome)
        tabHost.addTab(tabSpecHome)

        val tabSpecBoard = tabHost.newTabSpec("BOARD").setIndicator("게시판")
        tabSpecBoard.setContent(R.id.tabBoard)
        tabHost.addTab(tabSpecBoard)

        val tabSpecCalendar = tabHost.newTabSpec("CALENDAR").setIndicator("달력")
        tabSpecCalendar.setContent(R.id.tabCalendar)
        tabHost.addTab(tabSpecCalendar)

        val tabSpecAlbum = tabHost.newTabSpec("ALBUM").setIndicator("앨범")
        tabSpecAlbum.setContent(R.id.tabAlbum)
        tabHost.addTab(tabSpecAlbum)

        tabHost.currentTab = 0

        btnMain1.setOnClickListener {
            LinearMainpage.visibility = View.GONE
            LinearMain1.visibility = View.VISIBLE
            LinearMain2.visibility = View.GONE
            LinearMain3.visibility = View.GONE
            LinearMain4.visibility = View.GONE
            btnMain1.setTextColor(Color.WHITE)
        }
        btnMain2.setOnClickListener {
            LinearMainpage.visibility = View.GONE
            LinearMain1.visibility = View.GONE
            LinearMain2.visibility = View.VISIBLE
            LinearMain3.visibility = View.GONE
            LinearMain4.visibility = View.GONE
            btnMain1.setTextColor(Color.WHITE)
        }
        btnMain3.setOnClickListener {
            LinearMainpage.visibility = View.GONE
            LinearMain1.visibility = View.GONE
            LinearMain2.visibility = View.GONE
            LinearMain3.visibility = View.VISIBLE
            LinearMain4.visibility = View.GONE
            btnMain1.setTextColor(Color.WHITE)
        }
        btnMain4.setOnClickListener {
            LinearMainpage.visibility = View.GONE
            LinearMain1.visibility = View.GONE
            LinearMain2.visibility = View.GONE
            LinearMain3.visibility = View.GONE
            LinearMain4.visibility = View.VISIBLE
            btnMain1.setTextColor(Color.WHITE)
        }

    }
}



