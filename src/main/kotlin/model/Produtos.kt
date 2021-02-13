package model

sealed class Produtos(val vendedor: String, val valor:Double)

class Flauta(vendedorFlauta:String,
             valorFlauta: Double,
             possuiCordasFlauta: Boolean,
             emiteSomFlauta: String):
    Produtos(vendedor = vendedorFlauta,
        valor = valorFlauta), Instrumento{

    override var possuiCordas: Boolean = false

    override var emitirSom: String = "Fluuuuuu"

        }
