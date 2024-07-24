fun main() {
    print("Введите число:")
    val number = readln().toInt()
    print("Введите степень:")
    val degree = readln().toInt()

    //Задача 1
    val result = number.pow(degree)
    println("Результат1-> $result")

    //Задача 2
    number.pow2(degree) {
        result ->
        println("Результат2-> $result")
    }

    //Задача 3
    3.typeInfo()
    "a".typeInfo()
    true.typeInfo()

    //Задача 4
    DataType.DoubleType(1.4).dataTypeInfo()
    DataType.UnitType.dataTypeInfo()

}

fun Int.pow(degree: Int): Int {
    var result = 1
    for (i in 1..degree) {
        result *= this
    }

    return result

}