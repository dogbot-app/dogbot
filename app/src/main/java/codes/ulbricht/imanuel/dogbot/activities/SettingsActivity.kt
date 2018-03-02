package codes.ulbricht.imanuel.dogbot.activities

import android.os.Bundle
import codes.ulbricht.imanuel.dogbot.R
import android.support.v7.app.AppCompatActivity

class SettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Einstellungen"
        setContentView(R.layout.activity_settings)
    }
}
