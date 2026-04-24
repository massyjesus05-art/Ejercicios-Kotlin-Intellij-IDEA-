fun main() {
    val carrito = arrayOf("Laptop", "Mouse", "Teclado")

    // withIndex() permite obtener par (índice, valor)
    for ((posicion, articulo) in carrito.withIndex()) {
        println("Producto #${posicion + 1}: $articulo")
    }
}