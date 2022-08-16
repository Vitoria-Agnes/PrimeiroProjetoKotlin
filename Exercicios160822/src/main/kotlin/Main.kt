import kotlin.math.sqrt


         fun main() {

                print( " Digite um numero para saber se ele é par ou impar:")
                    val num = readln().toDouble()

                    if (num % 2.0 == 1.0) {
                        println(" O numero é impar ")
                        println(" O numero elevado ao quadrado é: ${Math.pow(num.toDouble(),2.0) } ")

                    }else{
                        println (" O numero é par ")
                        println(" A raiz do quadrado é: ${"%.2f".format(sqrt(num))}")


                    }
            }

