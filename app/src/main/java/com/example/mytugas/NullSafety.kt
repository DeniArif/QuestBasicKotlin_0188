package com.example.mytugas

import org.jetbrains.annotations.NotNull

fun NullSafety(){
    var neverNull: String = "This can't be null"

    // Nullable has nullable string type
    var nullable: String? = "You can a null here"
    nullable = null

    // Check for null in conditions
    if(neverNull == null){
        println("inferredNonNull is Null")
    } else {
        println("inferredNonNull is not Null")
    }

    // Safe call operator
    println(neverNull.length) //18
    println(nullable?.length) //null

    // notNull doesn't accept null values
    fun strLenght(notNull: String): Int{
        return notNull.length
    }

    println(strLenght(neverNull)) //18
}

fun main(){
    NullSafety()
}
