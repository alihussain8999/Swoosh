package com.example.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SkillActivity : BaseActivity() {
    var league =""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        intent.getStringExtra(EXTRA_LEAGUE).also {
            if (it != null) {
                league = it
            }
        }
    }
}