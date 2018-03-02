package codes.ulbricht.imanuel.dogbot.activities

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import codes.ulbricht.imanuel.dogbot.R

class EditPetActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_pet)

        title = "Tier bearbeiten"

        val fab = findViewById(R.id.fab_pet_detail) as FloatingActionButton
        fab.setOnClickListener({ startActivity(Intent(this, PetDetailActivity::class.java)) })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.activity_pet_editor, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        startActivity(Intent(this, PetsActivity::class.java))

        return super.onOptionsItemSelected(item)
    }
}
