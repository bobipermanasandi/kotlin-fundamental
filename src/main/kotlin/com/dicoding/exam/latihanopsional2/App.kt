/****************************************************************************************************
 *                               Perhatian                                                          *
 *                                                                                                  *
 *          Agar dapat diperiksa dengan baik, hindari beberapa hal berikut:                         *
 *                                                                                                  *
 *          1. Mengubah kode yang berada di dalam fungsi main()                                     *
 *          2. Mengubah atau menghapus kode yang sudah ada secara default                           *
 *          3. Membuat fungsi baru yang bukan merupakan tugas latihan                               *
 *          4. Mengubah struktur project (menghapus, mengedit, dan memindahkan package)             *
 *                                                                                                  *
 ***************************************************************************************************/

package com.dicoding.exam.latihanopsional2

/**
 *  TODO
 *  Lengkapi fungsi di bawah dengan ketentuan sebagai berikut:
 *  - Fungsi menerima input Integer dengan panjang digit 2-9.
 *  - Fungsi harus mengembalikan Integer yang merupakan hasil penjumlahan dari angka terkecil dan angka terbesar dari nilai yang diinput.
 *
 *  Contoh:
 *  Input = minAndMax(987234) -> Output = 11 | Penjelasan: Angka terkecil= 2, angka terbesar=9 -> 2+9 -> 11
 *  Input = minAndMax(8812334) -> Output = 9 | Penjelasan: Angka terkecil= 1, angka terbesar=8 -> 1+8 -> 9
 *  Input = minAndMax(10) -> Output = 1 | Penjelasan: Angka terkecil= 0, angka terbesar=1 -> 0+1 -> 1
 *
 *  Modul terkait: Kotlin Fundamental & Collections
 *
 */

fun minAndMax(number: Int): Int {
    val numberToString = number.toString()

    if (numberToString.length < 2 || numberToString.length > 9) return 0

    val charArray = numberToString.toCharArray()

    val numberChar = charArray.map { it.toString().toInt() }

    val maxValue = numberChar.maxOrNull() ?: 0
    val minValue = numberChar.minOrNull() ?: 0

    return maxValue + minValue
}

fun main() {
    println(minAndMax(987234) == 11)
    println(minAndMax(8812334) == 9)
    println(minAndMax(10) == 1)
}
