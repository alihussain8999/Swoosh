package com.example.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.EXTRA_LEAGUE
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view : View){
        womensLeagueBtn.isChecked=false
        coEdLeagueBtn.isChecked=false
        selectedLeague=mensLeagueBtn.text.toString()
    }

    fun onWomensClicked(view : View){
        mensLeagueBtn.isChecked=false
        coEdLeagueBtn.isChecked=false
        selectedLeague=womensLeagueBtn.text.toString()
    }

    fun onCoEdClicked(view : View){
        mensLeagueBtn.isChecked=false
        womensLeagueBtn.isChecked=false
        selectedLeague=coEdLeagueBtn.text.toString()
    }

    fun leagueNextClicked(view : View){
        if( selectedLeague !="") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE,selectedLeague)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this,"Please select a league.",Toast.LENGTH_SHORT).show()
        }
    }

}