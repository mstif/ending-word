package ru.netology

fun main() {
    val likes = 111
    println("Понравилось $likes ${getHumanWord(likes)}")
}

fun getHumanWord(likes: Int): String {
    val lastDigi = likes % 10
    val lastTwoDigi = likes % 100
    if (lastDigi == 1 && lastTwoDigi != 11) return "человеку"
    return "людям"
}