package model

abstract class Calculadora {
    abstract fun calcular(x:Int, y:Int):Any
}

class Somar:Calculadora(){
    override fun calcular(x:Int, y:Int): Any {
        return (x+y)
    }
}

class Sub:Calculadora(){
    override fun calcular(x:Int, y:Int): Any {
        return (x-y)
    }
}

class Mult:Calculadora(){
    override fun calcular(x:Int, y:Int): Any {
        return (x*y)
    }
}

class Div:Calculadora() {
    override fun calcular(x: Int, y: Int): Any {
        return if (y != 0) {
            (x + y)
        } else {
            "Erro, nao divide por zero"
        }
    }
}