package ru.netology

fun main() {
    val likes = 0
    println("Понравилось $likes ${getHumanWord(likes)}")
}

fun getHumanWord(likes: Int): String {
    val lastDigi = likes % 10
    if (lastDigi == 1) return "человеку"
    return "людям"
}