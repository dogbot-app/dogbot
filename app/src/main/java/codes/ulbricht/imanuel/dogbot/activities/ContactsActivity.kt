package codes.ulbricht.imanuel.dogbot.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import codes.ulbricht.imanuel.dogbot.R

class ContactsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts)

        title = "Kontakte"
    }
}
