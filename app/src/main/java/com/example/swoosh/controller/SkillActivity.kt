package com.example.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.EXTRA_PLAYER
import com.example.swoosh.R
import com.example.swoosh.model.Player
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        intent.getParcelableExtra<Player>(EXTRA_PLAYER).also {
           if(it !=null)
               player=it
        }
    }

    fun onBeginnerClicked(view : View){
        ballerSkillBtn.isChecked=false
        player.skill=beginnerSkillBtn.text.toString()

    }

    fun onBallerClicked(view : View){
        beginnerSkillBtn.isChecked=false
        player.skill=ballerSkillBtn.text.toString()
    }

    fun onFinishClicked(view : View){
        if(player.skill!="" && player.league !="") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(finishActivity)
        }else{
            Toast.makeText(this,"Please select a skill level.", Toast.LENGTH_SHORT).show()
        }
    }
}