package com.example.intent_20210829

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_view_message.*

class ViewMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_message)

//        화면에 들어올 때 첨부된 데이터를 꺼내서 => 변수에 저장

        val receivedMessage = intent.getStringExtra("inputMessage")

//        messageTxt의 text 속성에 => 저장해둔 내용을 대입

        messageTxt.text = receivedMessage


    }
}