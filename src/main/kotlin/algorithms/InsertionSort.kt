package algorithms

import kotlin.system.measureNanoTime

fun insertionSort(list: MutableList<Int>): List<Int> {
    for (i in 0 until list.size) {
        var key = list[i]
        //println("key : $key")
        loop@ for (j in i - 1 downTo 0) {
            var element = list[j]
            if (key < element) {
                list[j] = key
                list[j + 1] = element
                //println(list)
            } else
                if (key > element)
                    break@loop

        }

    }
    return list
}

fun main() {
    var list = mutableListOf(4, 2, 5, 3)
    println(measureNanoTime { insertionSort(list) })

    list = mutableListOf(4, 2)
    println(insertionSort(list))

    list = mutableListOf()
    println(insertionSort(list))
}