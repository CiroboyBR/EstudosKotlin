
fun main(args: Array<String>) {
    //continue a solução
    fun Float.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')
    var a = readLine()!!.toFloat()
    var b = readLine()!!.toFloat()
    var op = readLine()!!.toFloat()
    
    if (op == 1F) { //Soma
        println("Resultado: "+(a+b) ) 
    } else if (op == 2F) { // Subtração
        println("Resultado: "+(a-b) ) 
    } else if (op == 3F) { //Multiplicação
        println("Resultado: "+(a*b) ) 
    } else if (op == 4F ) { //Divisao
        if (b == 0F) println("Não pode dividir por zero!") else println("Resultado: "+(a/b))
    } else if (op == 6F) { //potenciação
        var pot = 1F
        for(i in 1..b.toInt())
            pot = pot * a
        println("Resultado: "+pot) 
    }else println("Opção Inválida!") 
}
