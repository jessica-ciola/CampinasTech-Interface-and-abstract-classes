package model

abstract class InstrumentoMusical(val donoInstrumento: String,
                                  val valorInstrumento: Double) {

    abstract var possuirCordas: Boolean

    abstract fun emitirSom() : String

    fun comprar(){
        println("COmpra realizada com sucesso!")
    }

    class Guitarra(donoInstrumentoGuitarra: String,
                   valorInstrumentoGuitarra: Double,
                   possuiCordasGuitarra: Boolean):InstrumentoMusical(donoInstrumento = donoInstrumentoGuitarra,
        valorInstrumento = valorInstrumentoGuitarra), TouchScreen {

        override var possuirCordas: Boolean = possuiCordasGuitarra

        override fun emitirSom(): String {
            return "Truuuuuum"
        }

        override fun tocar(): String {
            return "TAAAAA"
        }
    }

}

