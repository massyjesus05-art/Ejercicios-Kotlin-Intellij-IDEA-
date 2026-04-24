fun main() {
    var bateria = 30

    while (bateria > 5) {
        println("Dispositivo funcionando... Carga: $bateria%")
        bateria -= 5
    }

    println("Advertencia: Conecte el cargador inmediatamente.")
}