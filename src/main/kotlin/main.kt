import model.*

fun main(args: Array<String>) {
//    var chimbinha = InstrumentoMusical.Guitarra(donoInstrumentoGuitarra = "Chimbinha",
//        valorInstrumentoGuitarra = 5000.00,
//        possuiCordasGuitarra = true )
//
//    //println(chimbinha.donoInstrumento + chimbinha.valorInstrumento)
//
////    println(chimbinha.comprar())
////    println(chimbinha.emitirSom())
//    println(chimbinha.tocar())

     var soma = Somar()
    var subtrair = Sub()
    var multiplicar = Mult()
    var divisao = Div()
    println(soma.calcular(5,3))
    println(subtrair.calcular(5,3))
    println(multiplicar.calcular(5,3))
    println(divisao.calcular(5,3))
    println(divisao.calcular(5,0))





//    var Mcflautinha = Flauta(vendedorFlauta = "Mc",
//        valorFlauta = 2000.00,
//        possuiCordasFlauta = false,
//        emiteSomFlauta = "Fluuuuu")
//
//    println(Mcflautinha.vendedor)
//    println(Mcflautinha.valor)
//    println(Mcflautinha.emitirSom)
//    println(Mcflautinha.possuiCordas)
}