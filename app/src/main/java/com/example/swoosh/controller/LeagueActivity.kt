package com.example.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.EXTRA_PLAYER
import com.example.swoosh.R
import com.example.swoosh.model.Player
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player= Player("","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view : View){
        womensLeagueBtn.isChecked=false
        coEdLeagueBtn.isChecked=false
        player.league=mensLeagueBtn.text.toString()
    }

    fun onWomensClicked(view : View){
        mensLeagueBtn.isChecked=false
        coEdLeagueBtn.isChecked=false
        player.league=womensLeagueBtn.text.toString()
    }

    fun onCoEdClicked(view : View){
        mensLeagueBtn.isChecked=false
        womensLeagueBtn.isChecked=false
        player.league=coEdLeagueBtn.text.toString()
    }

    fun leagueNextClicked(view : View){
        if( player.league !="") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this,"Please select a league.",Toast.LENGTH_SHORT).show()
        }
    }

}