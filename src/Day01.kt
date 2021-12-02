fun main() {
    fun part1(input: List<String>): Int {
        val list = input.map { it.toInt() }
        list.forEachIndexed { index, it ->

            list.forEachIndexed { newIndex, newIt ->
                if (newIndex != index && it + newIt == 2020) {
                    val result = it * newIt
                    println(result)
                    return result
                }
            }
        }
        return 0
    }

    fun part2(input: List<String>): Int {
        val list = input.map { it.toInt() }
        list.forEachIndexed { index, it ->

            list.forEachIndexed { newIndex, newIt ->

                list.forEachIndexed { thirdIndex, thirdIt ->
                    if ((newIndex != index && index != thirdIndex && newIndex != thirdIndex)
                        && (it + newIt + thirdIt) == 2020
                    ) {
                        println("$index $newIndex $thirdIndex")

                        println("$it $newIt $thirdIt")

                        val result = it * newIt * thirdIt
                        println(result)
                        return result
                    }
                }
            }
        }
        return 0
    }

    // test if implementation meets criteria from the description, like:
//    val testInput = readInput("Day01_test")
//    check(part1(testInput) == 1)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
