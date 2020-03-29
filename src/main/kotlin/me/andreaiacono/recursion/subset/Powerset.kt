package me.andreaiacono.recursion.subset

fun powerSet(index: Int, partialResult: List<Char>, set: List<Char>, tab: Int): Set<List<Char>> {
    if (index == set.size) {
        return setOf(partialResult)
    }
    return  powerSet(index + 1, partialResult, set, tab + 1) +
            powerSet(index + 1, partialResult + set[index], set, tab + 1);
}

