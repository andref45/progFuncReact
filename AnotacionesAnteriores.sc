//7-11-2022
//Ejercicios en clases
//Ejercicio 1
val names : List[String] = List ("Leo", "Cristiano", "Enner", "Felipe")
names.map(_.length).sum


//Ejercicio 2
val numbers = List(3, 4, 7, 11, 12)
def isPrime = (nro _ Int) = (2 to nro -1 ).forall(nro % _ != 0)
numbers.map(isPrime(_) match{
  case true => 1
  case false => 0
}).sum

/*
Filtrar y truncar secuencias 
sum 
product
map
forall
max
min
size
exists = enviar un predicado
filter = enviar un predicado
takeWhile = enviar un predicado 
*/
val numbers = List(6, 28, 15, 12, 11, 24)
number.max

numbers.min

numbers.size


//forall -> devuelve si y solo  si el predicado devuelve treu para todos los valores de la lista 
def isPrime(nro : Int ) : Boolean = (2 until nro).forall(nro %_ !=0)

//exists -> devuelve true si y solo si el predicado devuelve true por lo menos para un valor de la lista 
def isPrime (nro : Int) : Boolean = !(2 until nro).exists(nro %_ ==  0)

//Filtrar y truncar
//filter -> solo se filtran los valores que cumplen con el predicado 
List(1, 2, 3, 4, 5).filter( k => k % 3 != 0)


//takeWhile -> trunca la lista cuando encuentra un valor que NO cumple con el predicado 
List(1, 2, 3, 4, 5).takeWhile( k => k % 3 != 0)


//Map/reduce 
//Transfromar, una función toma un alista y devuelve otra
//Funciones: map, filter, etc.

//Agregaciones, toma un alista y devuelve uno 
//Funciones: max, sum, etc.

//Escribir programas que concatenan transformaciones y agregaciones se conocen como programación map/reduce
val a = (n : Int) => (1 until n).filter(div => n % div == 0)
val numbers = List(6, 28, 15, 12, 11, 24)
val sumDiv = (nro: Int) => (1 until nro).filter(div => nro % div == 0).sum
val ab = numbers.filter(nro => nro == sumaDiv(nro)).size



//factorial escalonado 
def factorialEscalonado( n : Int) : Int = {
  n % 2 match {
    case 0 => (2 to n by 2).product
    case _ => (1 to n by 2).product
  }
}
val v = factorialEscalonado(8)
val c = factorialEscalonado(9)


val numbers = (1 to 20).toList

//Contar los números pares
numbers.filter(nro => nro % 2 ==0).size
numbers.count(nro => nro % 2 ==0)

//contar los números impares
numbers.filter(nro => nro % 2 !=0).size
numbers.count(nro => nro % 2 !=0)


//Contar primos
def contarPrimos(nros : List[Int]) : Int = {
  val isPrime = (n : Int) => (2 until n).forall(n % _ != 0)
  nros.count(isPrime)
}
contarPrimos(numbers)



//Presentar 3 factores
def tresFactores(nros : List[Int]) : List[Int] = {
  val factores = (n : Int) => (2 until n).filter(n % _ == 0)
  nros.filter(nro => factores(nro).size == 3)
}
tresFactores(nros =(1 to 1000).toList)