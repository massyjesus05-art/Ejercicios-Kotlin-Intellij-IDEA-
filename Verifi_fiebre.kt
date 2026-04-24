fun main() {
    val temperatura = 38

    val reporte = when (temperatura) {
        in 35..37 -> "Temperatura normal"
        38 -> "Febrícula detectada"
        in 39..42 -> "Alerta: Fiebre alta"
        else -> "Error en el sensor"
    }

    println("Estado del paciente: $reporte")
}