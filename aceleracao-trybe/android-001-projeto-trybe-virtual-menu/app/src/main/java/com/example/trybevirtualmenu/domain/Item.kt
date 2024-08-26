package com.example.trybevirtualmenu.domain

data class Item(
    val id:Int,
    val name:String,
    val image:Int,
    val description:String,
    var price:String
)