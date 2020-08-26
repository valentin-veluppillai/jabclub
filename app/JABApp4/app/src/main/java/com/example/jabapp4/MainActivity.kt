package com.example.jabapp4

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.example.jabapp4.fragments.*
import com.example.jabapp4.fragments.fragments.adapters.ViewPagerAdapter
import com.example.jabapp4.ui.main.SectionsPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpTabs()
    }

    private fun setUpTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(HomeFragment(), title = "")
        adapter.addFragment(ProgrammFragment(), title ="")
        adapter.addFragment(PreiseFragment(), title= "")
        adapter.addFragment(GalerieFragment(), title= "")
        adapter.addFragment(KontaktFragment(), title= "")
        adapter.addFragment(PartnerFragment(), title= "")
        viewPager.adapter = adapter

        tabs.setupWithViewPager(viewPager)

        tabs.getTabAt(0)!!.setIcon(R.drawable.ic_home_24dp)
        tabs.getTabAt(1)!!.setIcon(R.drawable.ic_insert_invitation_24dp)
        tabs.getTabAt(2)!!.setIcon(R.drawable.ic_euro_symbol_24dp)
        tabs.getTabAt(3)!!.setIcon(R.drawable.ic_insert_photo_24dp)
        tabs.getTabAt(4)!!.setIcon(R.drawable.ic_perm_contact_calendar_24dp)
        tabs.getTabAt(5)!!.setIcon(R.drawable.ic_group_24dp)


    }
}
