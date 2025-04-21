package com.example.benisha

fun displayList(){
    val numbers:List<String> = listOf("one", "two","three","four")

    println("Number of elements: ${numbers.size}")
    println("Third elements: ${numbers.get(2)}")
    println("Fourth elements: ${numbers[3]}")
    println("Index of elements \"two\": ${numbers.indexOf("two")}")
}

fun main(){
    //Immutable list
    val lst =listOf("one", "two", "three")
    println("Mutable list")
    for(i in lst.indices){
        println(lst[i])
    }
    println()
    //Mutablelist
    val mutablelst= mutableListOf("one", "two","three")
    mutablelst.add("Four")
    println("Immutable List")
    for(i in mutablelst.indices){
        println(mutablelst[i])
    }
    fun set(){
        val numbers = setOf(1,2,3,4)
        for(elements in numbers){
            println(elements)
        }
        val numbersBackwards = setOf(4,3,2,1)
        println ("The sets are equal: ${numbers== numbersBackwards}")
    }
}

