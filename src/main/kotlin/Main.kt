import com.sun.org.apache.xpath.internal.operations.Bool
import java.lang.Exception

// función que comprueba si la edad está permitida
fun edadPermitida(edad: Int): Boolean {
    val edadPermitida = (6..12)
    if(edad in edadPermitida){
        return true
        // print("Edad: "+edad+". El alumno está dentro del rango ")
    }

    else{
        return false
        //print("Edad: "+edad+". No se contempla la edad"+edadRango(edad))
    }
}

// función que busca si el mes es erróneo o no
fun mesRango(mes: Int): Boolean{
    val mesRango= (0..12)
    if (mes in mesRango){
        return true
    }else{
        println("Mes: "+mes+" es erroneo")
        return false
    }
}

// función que busca el rango de la edad, para separar mejor
fun edadRango(edad: Int):Int {
    val rango1 = (6..8)
    val rango2 = (9..10)
    if(edad in rango1){
        //println( "[6-8]")
        return 1
    }
    else if(edad in rango2){
        //println( "[8-10]")
        return 2
    }
    else return 3
    }


// función que hace las multiplicaciones
fun tablaMultiplicar(numero: Int){
    println("TABLA DEL "+numero)
    println("***********")
    for(i in 1.. 10){
        println("$numero x $i = ${numero * i}")
    }
}

//función que comprueba si el mes es par o no
fun mesPar(numero:Int): Boolean{
    if(numero%2==0){
        return true
    }
    else{
        return false
    }
}
fun main(args: Array<String>) {
    println("Introduce tu edad seguido de coma y tu mes")
    try{
        var palabra: String? = readLine()
        val arrayPalabra: List<String> = palabra!!.split(",")
        var rango=0
        val edadAlumno=arrayPalabra[0].toInt()
        val mesAlumno= arrayPalabra[1].toInt()
        val nombreAlumno= "Daniel"
        var esPar= mesPar(mesAlumno);
        if(edadPermitida(edadAlumno)==true){
            rango=edadRango(edadAlumno)
        }

        println("*********************************************************************************")
        println("PROGRAMA DE GENERACIÓN DE TABLAS: "+nombreAlumno)
        println("̣̣̣_________________________________________________________________________________")
        if(edadPermitida(edadAlumno)==true){
            print("Edad: "+edadAlumno+". El alumno está dentro del rango ")
            if(edadRango(edadAlumno)==1){
                println( "[6-8]")
            }
            else if(edadRango(edadAlumno)==2){
                println( "[8-10]")
            }
            else if(edadRango(edadAlumno)==3){
                println( "[10-12]")
            }
        }
        else{
            println("Edad: "+edadAlumno+". No se contempla la edad")
        }

        if(mesRango(mesAlumno)==true){
            if(rango==1 && esPar==true){
                tablaMultiplicar(1)
                println()
                tablaMultiplicar(3)
                println()
                tablaMultiplicar(5)
            }
            else if(rango==1 && esPar==false){
                tablaMultiplicar(2)
                println()
                tablaMultiplicar(4)
            }

            if(rango==2 && esPar==true){
                tablaMultiplicar(7)
                println()
                tablaMultiplicar(9)
            }
            else if(rango==2 && esPar==false){
                tablaMultiplicar(6)
                println()
                tablaMultiplicar(8)
                println()
                tablaMultiplicar(10)
            }

            else if(rango==3 && esPar==true){
                tablaMultiplicar(11)
                println()
                tablaMultiplicar(12)
                println()
                tablaMultiplicar(13)
            }
            else if(rango==3 && esPar==false){
                tablaMultiplicar(14)
                println()
                tablaMultiplicar(15)
                println()
                tablaMultiplicar(16)
            }
        }
        else{

        }
        println("*********************************************************************************")
    }catch (e: Exception){
        println("Error")
    }finally{

    }
}