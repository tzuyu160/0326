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