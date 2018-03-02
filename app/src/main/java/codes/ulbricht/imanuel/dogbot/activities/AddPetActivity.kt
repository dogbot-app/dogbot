package codes.ulbricht.imanuel.dogbot.activities

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import codes.ulbricht.imanuel.dogbot.R

class AddPetActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        title = "Tier hinzufügen"

        setContentView(R.layout.activity_add_pet)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.activity_pet_editor, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        startActivity(Intent(this, PetsActivity::class.java))

        return true
    }
}
