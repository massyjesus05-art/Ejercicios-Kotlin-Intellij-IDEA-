
fun main() {
    var nombreUsuario: String? = null

    val nombrefinal = nombreUsuario ?: "Invitado Anónimo"

    println("Bienvenido, $nombrefinal ")

    nombreUsuario = "Danilo Guerrero"
    println("Usuario identificado: $nombreUsuario")
}