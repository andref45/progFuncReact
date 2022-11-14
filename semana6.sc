
//14/11/2022
//Resolución de la prueba
val nros = List(727.7, 1086.5, 1091.0, 1361.3, 1490.5, 1956.1)
def promedio (valores : List[Double]) : Double = valores.sum/valores.size
def desEst(valores : List[Double]) : Double = {
  val avg = promedio(valores)
  def varianza(valores : List[Double]) : Double =
    valores.map( x => Math.pow(x - avg, 2)).sum * (1.0/(valores.size - 1))
  Math.sqrt(varianza(valores))
}
desEst(nros)
def clasifica(valores: List[Double]): Unit = {
  val s = desEst(valores)
  val avg = promedio(valores)

  (1 to 3).foreach(i =>
  println(valores.filter(x=>
  x>= (avg - i*s) && x <=(avg + i * s)).size))
}
clasifica(nros)

//Tuplas -> hasta 22 datos
/*
Una tupla es un contenedor de datos en donde cada elemento puede ser de diferente tipo
*/
val par = (1, "Abad Ana")
/*
Se puede acceder a cada elemento de forma independiente, utilizando punto, guión bajo
y un índice
*/
println(par._1)
println(par._2)
//¿Cómo declarar su tipo?
//El tipo depende del número de elementos y el tipo de dato de cada uno, así:
val student = (1, "Abad Ana")
val datos =  ("jorgaf", "M", 45, 95.2, true)
val student: Tuple2[Int, String]
val datos : Tuple5[String, Char, Int, Double, Boolean]
//Funciones para tuplas
val student = (1, "Abad Ana")
val (edad, nombre) = student
print(edad)
println(nombre)

student.swap //cambiar el orden

student.canEqual((1, "Abad Ana"))

//Estructuras de datos funcionales
/*
  *Datos inmutables
  * La programación implica la manipulación de datos
  * Tanto ñas estructuras de datos, como los datos en sí son manipulados de forma diferente
  en los paradigmas de programación
  * Iniciaremos con la noción de una colección de datos
  * 
* */