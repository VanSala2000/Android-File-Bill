package com.example.bill

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bill.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calculateBtn.setOnClickListener{CalculateWater()}
    }


    fun CalculateWater(){

            val currentreading = binding.curMeterReading.text.toString().toDouble()
            val previousreading = binding.prvMeterReading.text.toString().toDouble()
            val meterReading = binding.meterReading.text.toString().toDouble()

            val totalConsumption = previousreading - currentreading
            binding.WaterConsumed.text = totalConsumption.toString()

            val totalBill = totalConsumption * meterReading
            binding.txtTotalAmount.text = totalBill.toString()

    }
}