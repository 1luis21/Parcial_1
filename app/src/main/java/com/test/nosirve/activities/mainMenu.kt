package com.test.nosirve.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.test.nosirve.adapters.ViewPagerAdapter
import com.test.nosirve.fragments.CharactersFragment
import com.test.nosirve.fragments.PhrasesFragment
import com.test.nosirve.fragments.SettingsFragment

class mainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setUpTabs()
    }

    private fun setUpTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(CharactersFragment(), "Characters")
        adapter.addFragment(PhrasesFragment(), "Phrases")
        adapter.addFragment(SettingsFragment(), "Settings")
        viewPager.adapter = adapter
    }
}