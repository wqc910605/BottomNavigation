package com.example.lenovo.test04.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.example.lenovo.test04.R
import com.example.lenovo.test04.kotlin.dialog.AlertDialog2
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        textView1.setOnClickListener(this)
        textView2.setOnClickListener(this)
        textView3.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.textView1 -> {
                val alertDialog = AlertDialog2()
                alertDialog.show(supportFragmentManager, "alertDialog")
            }
            R.id.textView2 -> {
                Toast.makeText(this, "textview2", Toast.LENGTH_SHORT).show()
            }
            R.id.textView3 -> {
                Toast.makeText(this, "textview3", Toast.LENGTH_SHORT).show()
            }
            else -> {
            }
        }
    }

}
