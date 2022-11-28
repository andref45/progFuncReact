import java.nio.DoubleBuffer

//El problema de los efectos colaterales
//FP se basa en funciones que no deberían tener efectos colaterales
//Ejemplo
val cont = 0;
void addOne(){
  cont = cont + 1; // -> modificar algo que no es el del método
}
//Otro ejemplo:
// En muchos lenguajes de programación imperativos, la llamada a la función print("hola") imprimirá algo y no
// devolverá nada.
// En los lenguajes funcionales puros, una función de impresión toma un objeto que representa el estado del mundo
// exterior y devuelve un nuevo objeto que representa al estado después de haber realizado la salida.
newState = print("hola") + oldState

//Efecto colaterales
// Se conseidera que una función tiene efectos colarales si
//  * Modifica el valor de una variable o de una estructura de datos inmutable
//  * Utiliza mecanismos de IO
//  * Lanza una excepción
//  * Se detiene por un error

// Solución a efectos colaterales
// La solución es dejar de usar efectos colaterales y codificarlos en el valor de retorno
def division( n1 : Double, n2 : Double) =
  if (n2 == 0) throw new RuntimeException ("Division por 0")
  else n1/n2
import scala.util.Try
def pureDivision( n1 : Double, n2 : Double) : Try[Double] =
  Try{division(n1,n2)} // -> Representa el error como una estructura de datos

val result = pureDivision(1, 3)
import scala.util.{Success, Failure}
result match {
  case Success(v) => println(v)
  case Failure(e) => println(e.getMessage)
}

// Option/ Some / None
// Null billion dollar mistake -> Tony Hoare
def toInt (s : String) : Option[Int] = {
  try {
    Some(Integer.parseInt(s))
  } catch {
    case e: Exception => None
  }
}
toInt("1")
toInt("Uno")
val txtNumbers = List("1", "2", "foo", "3", "bar")
txtNumbers.map(toInt)
txtNumbers.map(toInt).flatten


// Manejo de nulos
//Alternativa Option
// Si tiene la tentación de usar un valor nulo piense en Option
// Option: representación de los valores opcionales
//  Posibles valores instancias de:
//    Some - Se genera cuando el valor existe
//    None - Se genera cuando el valor no existe

// Obtener valores
// Usar:
// getOrElse
// foreach
// match

val x = toInt("1").getOrElse(0)
toInt("1").foreach{ i => printf("Obtener un Int: %d", i)}
toInt("1") match {
  case Some(i) => println(i)
  case None => println("That didn't work.")
}


//Either / Left / Right 
