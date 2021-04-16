package com.example.justgo

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.justgo.Entitys.Trip
import com.example.justgo.Entitys.TripDate
import com.example.justgo.Entitys.TripDestination
import com.example.justgo.Entitys.TripType

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun sendMessage(view: View) {

        var templateTrip = Trip("Template Trip for testing", TripType.self_created)
        var date = TripDate("Date", "October 2022")
        var dest = TripDestination("Destination", "Wien")
        templateTrip.addTripInformation(date)
        templateTrip.addTripInformation(dest)
        templateTrip.addTripInformation((TripDestination("Duration", "5 days")))
        templateTrip.addTripInformation((TripDestination("Pictures", "No pictures yet")))


        val intent = Intent(this, ActivitySingleTrip::class.java).apply {}
        intent.putExtra("trip", templateTrip)
        startActivity(intent)
    }


}