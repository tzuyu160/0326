package tw.edu.pu.csim.tcyang.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txv.setOnClickListener(this)
        btn.setOnClickListener(this)

        btnHappy.setOnClickListener(object:View.OnClickListener{
            override fun onClick(p0: View?) {
                counter= (1..100).random()
                txv.text = counter.toString()
            }
        })
    }

    override fun onClick(view: View) {
        if (view.id.equals(R.id.txv)){
            counter++
        }
        else{
            counter = 0
        }
        txv.text = counter.toString()
    }
}