
fun main() {
    val notaEstudiante = 85

    val mensaje = if(notaEstudiante>70) {
        "Felicidades, has aprobado la unidad."
    } else {
        "Lo sentimos, debes ir a recuperación."
    }

    println("Estatus Final: $mensaje ")

}