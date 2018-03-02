package codes.ulbricht.imanuel.dogbot.activities

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import android.widget.ListView
import codes.ulbricht.imanuel.dogbot.R

class PetsActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pets)
        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        val drawer = findViewById(R.id.drawer_layout) as DrawerLayout
        val toggle = ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer.setDrawerListener(toggle)
        toggle.syncState()

        val navigationView = findViewById(R.id.nav_view) as NavigationView
        navigationView.setNavigationItemSelectedListener(this)

        val list = findViewById(R.id.lv_pets) as ListView
        list.setOnItemClickListener { _, _, _, _ ->
            startActivity(Intent(this, EditPetActivity::class.java))
        }

        val fab = findViewById(R.id.fab_add_pet) as FloatingActionButton
        fab.setOnClickListener {
            startActivity(Intent(this, AddPetActivity::class.java))
        }
        title = "Tiere"
    }


    override fun onBackPressed() {
        val drawer = findViewById(R.id.drawer_layout) as DrawerLayout
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_settings -> startActivity(Intent(this, SettingsActivity::class.java))
            R.id.nav_pets -> startActivity(Intent(this, PetsActivity::class.java))
            R.id.nav_contacts -> startActivity(Intent(this, ContactsActivity::class.java))
            R.id.nav_agb -> startActivity(Intent(this, AgbActivity::class.java))
        }

        val drawer = findViewById(R.id.drawer_layout) as DrawerLayout
        drawer.closeDrawer(GravityCompat.START)
        return true
    }
}
