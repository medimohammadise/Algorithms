package algorithms

import java.util.*

fun countSort(list: IntArray): IntArray {
    var sortedList = IntArray(list.size)
    for (item in list)
        sortedList[item]++
    return sortedList
}

fun main() {
   print(Arrays.toString(countSort(intArrayOf(1, 2, 2, 3, 3, 4, 4, 4, 6, 6, 6))))
}