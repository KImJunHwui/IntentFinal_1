package com.kim.intentfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        goBackBtn.setOnClickListener {

            val inputMessage = newNickNameEdt.text.toString()
            val resultIntent = Intent()
            resultIntent.putExtra("newnick", inputMessage)
//          아래 19번 Line 생각을 못해냄
            setResult(RESULT_OK, resultIntent)
            finish()

        }
    }
}