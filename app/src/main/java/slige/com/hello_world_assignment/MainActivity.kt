package slige.com.hello_world_assignment

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var increase_number =findViewById<Button>(R.id.increment_btn)
        var text = findViewById<TextView>(R.id.textview_increment)

            increase_number.setOnClickListener{
                increase_number++

            }


        }
    }
