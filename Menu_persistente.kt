fun main() {
    var entrada: String?

    do {
        println("---- SESIÓN DE USUARIO ----")
        println("Escriba 'SALIR' para cerrar la aplicación:")
        entrada = "SALIR" // Simulación de entrada de usuario
        println("Comando detectado: $entrada")
    } while (entrada != "SALIR")

    println("Finalizando ejecución CLI.")
}