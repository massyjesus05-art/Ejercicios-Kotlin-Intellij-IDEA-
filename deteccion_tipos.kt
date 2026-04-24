fun main() {
    val objeto: Any = "Hola Nicaragua"

    when (objeto) {
        is String -> println("Es un texto de longitud ${objeto.length}")
        is Int -> println("Es un número entero")
        is Boolean -> println("Es un valor lógico")
        else -> println("Tipo desconocido")
    }
}