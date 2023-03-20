import java.util.*

fun main() {
    //anagrama
    val list: List<String> = listOf("hello", "llohe","world")
    //hello -> 2, world -> 1
    checkAnagram(organizeList(list), list)
}

fun organizeList(list: List<String>): List<String> {
    val result = mutableListOf<String>()
    (list.indices).forEach {
        var strAux = list[it].toCharArray()
        Arrays.sort(strAux)
        result.add(String(strAux))
    }
    return result
}

fun checkAnagram(list: List<String>, listPrimary: List<String>) {
    var result = 0
    (list.indices).forEach {value ->
        result = list.count { it == list[value] }
        println("${listPrimary[value]} -> $result")
    }
}
