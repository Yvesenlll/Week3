package com.example.week3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import androidx.core.widget.addTextChangedListener
import com.example.week3.databinding.ActivityTipCalculatorBinding
import java.text.NumberFormat

class TipCalculator : AppCompatActivity() {
    private lateinit var binding : ActivityTipCalculatorBinding
    private var tipPercentage = 15
    private var initialMealCoast = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTipCalculatorBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.preTipMealAmountEditText.addTextChangedListener{
            if(!it.isNullOrBlank()){
                initialMealCoast = it.toString().toDouble()
            }else{
                initialMealCoast = 0.0
            }

    calculateTip()
        }

        binding.tipPercentSeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, seekbarNewValue: Int, p2: Boolean) {
                tipPercentage = seekbarNewValue
                calculateTip()
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }
        })
        calculateTip()
    }

    private fun calculateTip(){
        var tip = initialMealCoast * tipPercentage / 100
        binding.tipPercentTextView.text = "${tipPercentage}%"

        val currencyFormat = NumberFormat.getCurrencyInstance()
        binding.tipTotalTextView.text = currencyFormat.format(tip)
        binding.amountToPayTextView.text = currencyFormat.format(tip+initialMealCoast)

    }
}