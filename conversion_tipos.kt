
fun main() {
    val entradaTeclado = "1500"
    val salarioBase = entradaTeclado.toInt()
    val bono  = salarioBase * 0.10

    println("Salario Capturado: $salarioBase")
    println("Bono Calculado (10%): $bono")
    println("Monto Neto: ${salarioBase + bono}")


}