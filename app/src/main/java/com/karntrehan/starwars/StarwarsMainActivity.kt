package com.karntrehan.starwars

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.karntrehan.starwars.utils.Activities
import com.karntrehan.starwars.utils.intentTo

class StarwarsMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_starwars_main)

        startActivity(intentTo(Activities.Characters))
        finish()
    }
}
