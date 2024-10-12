package com.example.mytugas

// Data Class
// Data class adalah yang digunakan untuk menyimpan data
// Data class menyediakan fungsi untuk meng-override fungsi equals(), hashcode(), dan toString().
// Data class juga menyediakan fungsi copy() untuk membuat salinan objek dengan beberapa perubahan.


data class DataClass(
    val id: Int,
    var email: String
)


fun main(){
    val data = DataClass(1,"indra@gmail.com")
    println(data)


    // Fungsi equals
    val data2 = DataClass(1, "makan@gmail.com")
    println(data==data2) // false


    // Fungsi Copy
    val data3 = data.copy()
    println(data3)


    // Fungsi Copy dan perubahan
    val data4 = data.copy(email = "sahar@gmail.com")
    println(data4)
}