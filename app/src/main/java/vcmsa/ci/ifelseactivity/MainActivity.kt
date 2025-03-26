package vcmsa.ci.ifelseactivity

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        //find view by id
        val textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button)
        val editAge = findViewById<EditText>(R.id.editAge)


        //set on click listener
       button.setOnClickListener {
           //age will store the value of the edit text
           val age = editAge.text.toString().toInt()
         if (age < 12) {
             //if age is less than 12, the text view will display kids discount and the ticket costs R20
             textView.text = "KIDS DISCOUNT! YOUR TICKET COSTS R20"
         } else if (age >= 65) {
             //if age is greater than or equal to 65, the text view will display senior discount and the ticket costs R25
             textView.text = "SENIOR DISCOUNT! YOUR TICKET COSTS R25"
         } else if (age >= 12 && age < 65) {
             //if age is greater than or equal to 12 and less than 65, the text view will display adult ticket and the ticket costs R30
             textView.text = "YOUR TICKET COSTS R30"
         } else {
             //if the input entered is invalid, the text view will display invalid input and please enter your age
             textView.text = "INVALID INPUT! PLEASE ENTER YOUR AGE"
         }
       }
    }
}
