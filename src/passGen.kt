fun numGen():String = (0..9).random().toString()

fun letGen(): String {
    val regRand = (0..1).random()
    var letTer = ('a'..'z').random().toString()
    if (regRand == 1) letTer = letTer.toUpperCase()
    return letTer
}

fun main() {
    val passLength: Int = (8..15).random()
    println("Длина пароля: $passLength")
    var passWord = ""

    for (i in 1..passLength) {
        val numLetRan = (0..1).random()
        passWord += if (numLetRan == 0) numGen()
        else letGen()
    }

    println("Готовый пароль: $passWord")
}