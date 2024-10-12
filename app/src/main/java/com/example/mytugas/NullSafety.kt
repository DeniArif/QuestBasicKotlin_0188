package com.example.mytugas

import org.jetbrains.annotations.NotNull

fun NullSafety() {
    var neverNull: String = "This can't be null"
    
    // Nullable has nullable string type
    var nullable: String? = "You can a null here"
    nullable = null
}