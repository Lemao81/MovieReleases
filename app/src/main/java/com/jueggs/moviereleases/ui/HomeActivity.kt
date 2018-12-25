package com.jueggs.moviereleases.ui

import android.view.View
import androidx.core.view.GravityCompat
import com.jueggs.andutils.base.BaseActivity
import com.jueggs.moviereleases.R
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : BaseActivity() {
    override fun layout(): Int = R.layout.activity_home
    override fun toolbar(): View = toolbar
    override fun toolbarHome() = R.drawable.ic_menu

    override fun onMenuItemSelected(id: Int): Boolean? {
        return when (id) {
            android.R.id.home -> {
                drawerLayout.openDrawer(GravityCompat.START)
                true
            }
            else -> super.onMenuItemSelected(id)
        }
    }
}