fun Int.pow2(degree: Int, resultLyambda: (Int) -> Unit) {
    var result = 1
    for (i in 1..degree) {
        result *= this
    }
    return resultLyambda(result)
}

inline fun <reified  M> M.typeInfo() {
    val info = when (M::class) {
        String::class -> "its String"
        Int::class -> "its Int"
        DataType::class -> (this as DataType).dataTypeInfo().toString()
        else -> "$this type is unknown"
    }
    println(info)
}

sealed class  DataType {
    data class  DoubleType(val value: Double) : DataType()
    object UnitType: DataType()
}

fun DataType.dataTypeInfo() {
    val typeInfo = when (this) {
       is DataType.DoubleType -> "this DoubleType with a value of $value"
        DataType.UnitType -> "with Unit"
    }
    println(typeInfo)
}