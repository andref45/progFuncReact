
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
  println(valores.count(x =>
    x >= (avg - i * s) && x <= (avg + i * s))))
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
val datos = ("jorgaf", "M", 45, 95.2, true)
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
  * Tanto las estructuras de datos, como los datos en sí son manipulados de forma diferente
  en los paradigmas de programación
  * Iniciaremos con la noción de una colección de datos
  * Conjuntos
  * Secuencias
  Listas:
  * Es un elemento similar a los arreglos
  * Diferencias de un arreglo -> Son inmutables, listas en scala se representan como listas enlazadas
  * Declaraciones
 */
val values = List(42, 31, 36, 40, 43)
val names = List("Jorge", "René", "Ma. del Carmen", "Nelson")
/*Operaciones
Count
Exists
filter
ForAll
Length
Map
Max, maxBy
Min, minBy
Product
Size
*/
val myList= List(10, 20, 30, 40, 50, 60)
myList.isEmpty
myList.drop(2) //Borrar n primeros
myList.dropWhile(_< 25) // Borra mientras la condición
myList.slice(2, 4)
myList.tail
myList.take(3)
myList.takeWhile(_ < 30)
myList.sorted
myList.sorted(Ordering.Int.reverse)

//Otras operaciones
//foldLeft:
//Aplica un operador binario a un valor inicial y a todos los elementos de esta secuencia
//de izquierda a derecha
myList.foldLeft(0)((x, y )=> x+y)
myList.foldLeft(0)(_ + _)

//foldRight:
//Aplica un operador binario a un valor inicial y a todos los elementos de esta secuencia
//de derecha a izquierda
myList.foldRight(0)((x, y ) => x+y)
myList.foldRight(0)(_ + _)

//foldLeft ejemplo
//crear una función para calcular el promedio de los elementos de una lista
//de números reales
def average(valores : Seq[Double]) : Double = {
  val t = valores.foldLeft((0.0, 0))((acc, currVal) => (acc._1 + currVal, acc._2 + 1))
    t._1 / t._2
}
def average2(valores : Seq[Double]) : Double = {
  val t = valores.foldLeft((0.0, 0)) { (acc, currVal) =>
    val sum = acc._1 + currVal
    val cont = acc._2 + 1
    printf("Suma: %f - contador: %d%n", sum, cont)
    (sum, cont)
  }
  t._1 + t._2
}

//Zip
// se usa para fusionar una colección con la actual y el resultado es una
// colección de tuplas de 2 con elementos de ambas colecciones

val myList = List(10, 20, 30, 40, 50, 60)
val nom = List("Guido", "Armando", "Patricio", "Manuel", "Germania", "")
