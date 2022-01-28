package com.example.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.EXTRA_LEAGUE
import com.example.swoosh.EXTRA_SKILL
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
    var league =""
    var skill =""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        intent.getStringExtra(EXTRA_LEAGUE).also {
            if (it != null) {
                league = it
            }
        }
    }

    fun onBeginnerClicked(view : View){
        ballerSkillBtn.isChecked=false
        skill=beginnerSkillBtn.text.toString()

    }

    fun onBallerClicked(view : View){
        beginnerSkillBtn.isChecked=false
        skill=ballerSkillBtn.text.toString()
    }

    fun onFinishClicked(view : View){
        if(skill !="") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE,league)
            finishActivity.putExtra(EXTRA_SKILL,skill)
            startActivity(finishActivity)
        }else{
            Toast.makeText(this,"Please select a skill level.", Toast.LENGTH_SHORT).show()
        }
    }
}