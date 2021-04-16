package com.example.justgo.Entitys

import java.io.Serializable

class Trip(name:String,tripType: TripType) : Serializable {
    //props
    var tripInformations: ArrayList<TripInformation> = ArrayList()

    var nameofTrip:String
//        get() {
//            return nameofTrip
//        }
//        set(value) {
//            nameofTrip=value
//        }

    var tripType:TripType
//        get() {
//            return tripType
//        }
//        set(value) {
//            tripType=value
//        }

    //Constructor

    init {
        this.nameofTrip = name
        this.tripType=tripType;
    }

    //Methods

    fun addTripInformation(tripInformation:TripInformation){
        this.tripInformations.add(tripInformation)
    }

    fun getTripInformationbyName(name:String):TripInformation?{

        tripInformations.forEach {
            if(it.name.equals(name)){
                return it
            }
        }
        return null
    }
}