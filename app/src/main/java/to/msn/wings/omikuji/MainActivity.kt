package to.msn.wings.omikuji

import android.R
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_item)  /* 謎 */
        getOmikujiButton.run {
            
            getOmikujiButton.setOnClickListener {
               // Log.v("MainActivity", "Button Clicked")
                val results = arrayOf("大吉","吉","中吉","末吉","凶")

               // val n = Random().nextInt( 5)
                val n = Random().nextInt( results.count())

                if ( n == 0) {
                    resultTextView.setTextColor(Color.RED)
                } else {
                    resultTextView.setTextColor(Color.parseColor("#808080"))
                }

                resultTextView.text = results.get(n)
            }
        }
    }
            }
