package com.kim.intentfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val REQUST_FOR_NICKNAME = 1005

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        changeIdBtn.setOnClickListener {

            val myIntent = Intent(this, ThirdActivity::class.java)
            startActivityForResult(myIntent, REQUST_FOR_NICKNAME)

        }

        moveToOtherBtn.setOnClickListener {

            val sendMessage = thankYouEdt.text.toString()
            val myIntent = Intent(this, SecondActivity::class.java)
            myIntent.putExtra("thank", sendMessage)
            startActivity(myIntent)
        }

        flyBtn.setOnClickListener {

            val myIntent = Intent(this, SecondActivity::class.java)
            startActivity(myIntent)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQUST_FOR_NICKNAME){

            if(resultCode == RESULT_OK){
      // data 생각을 못함
                val receiveMessage = data?.getStringExtra("newnick")
                okDongJaTxt.text = receiveMessage

            }
        }
    }
}