package tw.com.bmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun bmi(view: View){
        val weight:Float =ed_weight.text.toString().toFloat()
        val height:Float=ed_height.text.toString().toFloat()
        val bmi:Float=weight/(height * height)
        Log.d("BMI",bmi.toString())
    }

}
