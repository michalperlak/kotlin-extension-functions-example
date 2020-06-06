package dev.talkischeap

import dev.talkischeap.utils.lowerCased
import dev.talkischeap.utils.startingWithLetter

fun main() {
    val values = listOf("abcdef", "12345", "12def")
    val result = values
        .startingWithLetter()
        .lowerCased()
    println(result)
}
