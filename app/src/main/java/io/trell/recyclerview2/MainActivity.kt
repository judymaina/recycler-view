package io.trell.recyclerview2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import io.trell.recyclerview2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        fibonanchiSeries()


    }

    fun fibonanchiSeries(){
        var numbersList= mutableListOf<Int>()
        val n =100
        var n1 =0
        var n2=1

        println("Upto $n:")
        for (n in 1..100){
            numbersList.add(n1)

            val sum =n1 +n2
            n1=n2
            n2=sum
        }
        var display=FibonachiRecyclerViewAdapter(numbersList)
        binding.RvNumbers.layoutManager=LinearLayoutManager(this)
        binding.RvNumbers.adapter=display

    }
}