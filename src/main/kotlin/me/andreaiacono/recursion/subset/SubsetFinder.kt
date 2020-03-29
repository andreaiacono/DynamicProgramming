package me.andreaiacono.recursion.subset

import java.util.*

fun subsets(currentIndex: Int, partialResult: List<Char>, set: List<Char>, size: Int): List<List<Char>> {
    if (partialResult.size == size) {
        return listOf(partialResult)
    }

    val result: MutableList<List<Char>> = ArrayList()
    for (i in currentIndex until set.size) {
        result.addAll(subsets(i + 1, partialResult + set[i], set, size))
    }
    return result
}

fun subsetsFunctional(currentIndex: Int, partialResult: List<Char>, set: List<Char>, size: Int): List<List<Char>> {
    if (partialResult.size == size) {
        return listOf(partialResult)
    }
    return set
        .drop(currentIndex)
        .mapIndexed { index, c -> subsetsFunctional(index + 1, partialResult + c, set, size) }
        .flatten()
}
