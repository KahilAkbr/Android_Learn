package com.example.intentlearn

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveActivityWithData: Button = findViewById(R.id.btn_move_activity_data)
        btnMoveActivityWithData.setOnClickListener(this)

        val btnMoveWithObject:Button = findViewById(R.id.btn_move_activity_object)
        btnMoveWithObject.setOnClickListener(this)

        val btnDialPhone: Button = findViewById(R.id.btn_dial_number)
        btnDialPhone.setOnClickListener(this)
    }

    override fun onClick(v: View?){
       when(v?.id){
           R.id.btn_move_activity ->{
               val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)
               startActivity(moveIntent)
           }
           R.id.btn_move_activity_data ->{
               val moveDataWithIntent = Intent(this@MainActivity, MoveWithDataActivity::class.java)
               moveDataWithIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "DicodingAcademy Boy")
               moveDataWithIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 5)
               startActivity(moveDataWithIntent)
           }
           R.id.btn_move_activity_object -> {
               val person = Person(
                   "DicodingAcademy",
                   5,
                   "academy@dicoding.com",
                   "Bandung"
               )

               val moveWithObject = Intent(this@MainActivity, MoveWithObjectActivity::class.java)
               moveWithObject.putExtra(MoveWithObjectActivity.EXTRA_PERSON, person)
               startActivity(moveWithObject)
           }
           R.id.btn_dial_number -> {
               val phoneNumber = "089665855184"
               val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel: $phoneNumber"))
               startActivity(dialPhoneIntent)
           }
       }
    }

}