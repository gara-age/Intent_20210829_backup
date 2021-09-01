package com.example.intent_20210829

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_other.*

class OtherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        returnToMainBtn.setOnClickListener {

//            Intent 를 이용, 메인으로 이동
//            val returnIntent = Intent(this, MainActivity::class.java)
//            startActivity(returnIntent)

//            지금 보고있는 다른 화면을 종료처리
            finish()

        }


    }
}