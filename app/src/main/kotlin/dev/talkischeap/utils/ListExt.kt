package dev.talkischeap.utils

fun List<String>.startingWithLetter(): List<String> =
    filter {
        it.isNotEmpty() && it.first().isLetter()
    }