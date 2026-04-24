fun main() {
    val edad = 16

    if (edad in 0..12) {
        println("Categoría: Niño")
    } else if (edad in 13..17) {
        println("Categoría: Adolescente")
    } else {
        println("Categoría: Adulto")
    }
}