package com.example.janken

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.RecoverySystem
import android.preference.PreferenceManager
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gu.setOnClickListener{onJankenButtonTapped(it)}
        choki.setOnClickListener{onJankenButtonTapped(it)}
        pa.setOnClickListener{onJankenButtonTapped(it)}
        var pref = PreferenceManager.getDefaultSharedPreferences(this)
        var editor = pref.edit()
        editor.clear().apply()
    }

    fun onJankenButtonTapped(view: View?){
        startActivity<ResultActivity>("MY_HAND" to view?.id)
    }
}
