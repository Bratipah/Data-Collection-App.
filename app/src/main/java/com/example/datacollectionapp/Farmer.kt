package com.example.datacollectionapp

data class Farmer(
    val name: String?=null,
    val nationalId: Int,
    val mobileNo: Int,
    val UAI : Int,
    val subsidiary: String?=null,
    val village: String?=null,
    val countyName: String?=null,
    val ward: String?=null,
    val crop: String?=null,
    val noOfAcres: String?=null
)
