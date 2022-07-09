package com.tolganacar.basiccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.tolganacar.basiccalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var number1 : Int? = null
    var number2: Int? = null
    var result: Int? = null

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun sum(view : View){
        number1 = binding.editTextNumber1.text.toString().toIntOrNull()
        number2 = binding.editTextNumber2.text.toString().toIntOrNull()

        if(number1 == null || number2 == null){
            binding.textResult.text = "Enter Number!"
        }else{
            result = number1!! + number2!!
            binding.textResult.text = "Result : ${result}"
        }

    }

    fun deduct(view : View){
        number1 = binding.editTextNumber1.text.toString().toIntOrNull()
        number2 = binding.editTextNumber2.text.toString().toIntOrNull()

        if(number1 == null || number2 == null){
            binding.textResult.text = "Enter Number!"
        }else{
            result = number1!! - number2!!
            binding.textResult.text = "Result : ${result}"
        }
    }

    fun multiply(view : View){
        number1 = binding.editTextNumber1.text.toString().toIntOrNull()
        number2 = binding.editTextNumber2.text.toString().toIntOrNull()

        if(number1 == null || number2 == null){
            binding.textResult.text = "Enter Number!"
        }else{
            result = number1!! * number2!!
            binding.textResult.text = "Result : ${result}"
        }
    }

    fun divide(view : View){
        number1 = binding.editTextNumber1.text.toString().toIntOrNull()
        number2 = binding.editTextNumber2.text.toString().toIntOrNull()

        if(number1 == null || number2 == null){
            binding.textResult.text = "Enter Number!"
        }else{
            result = number1!! / number2!!
            binding.textResult.text = "Result : ${result}"
        }
    }
}