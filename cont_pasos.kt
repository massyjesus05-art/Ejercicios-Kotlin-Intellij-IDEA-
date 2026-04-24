
fun main() {
    var pasosDados = 0
    println("Inicio de Jornada: $pasosDados pasos ")

    pasosDados += 1250 //usuario camina
    pasosDados += 3400 //usuario corre

    println("Actualización de actividad: $pasosDados pasos totales")

    pasosDados = 0 //Reinicio del día
    println("Contador reiniciado: $pasosDados")

}