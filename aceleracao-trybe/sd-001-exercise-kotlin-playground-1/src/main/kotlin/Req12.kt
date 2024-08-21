fun multiplyLists(list1: List<Int>, list2: List<Int>, result: MutableList<Int>) {
    for (i in list1.indices) {
        result.add(list1[i] * list2[i])
    }
}

fun main() {}
