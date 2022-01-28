package com.example.swoosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.swoosh.EXTRA_PLAYER
import com.example.swoosh.R
import com.example.swoosh.model.Player
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        intent.getParcelableExtra<Player>(EXTRA_PLAYER).also{
            if(it !=null && it.league !="" && it.skill!="")
            searchLaguesText.text="Looking for ${it.league} ${it.skill} league near you"
        }

    }
}