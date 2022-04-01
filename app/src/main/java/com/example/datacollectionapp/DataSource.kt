package com.example.datacollectionapp

data class County(
    val countyNumber: Int,
    val countyName: String
)
class DataSource {
    fun loadCounties(): List<County>{
        return listOf<County>(
            County(1, "Mombasa"),
            County(2, "Kwale"),
            County(3, "Kilifi"),
            County(4, "Tana River"),
            County(5,"Lamu"),
            County(6, "Taita Taveta"),
            County(7, "Garrissa"),
            County(8, "Wajir"),
            County(9, "Mandera"),
            County(10, "Marsabit"),
            County(11, "Isiolo"),
        )
    }
}

data class User(
    val name: String,
    val age: Int,
    val nationalId: Long,
    val phoneNumber: Long
)