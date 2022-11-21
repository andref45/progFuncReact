//Tuplas y listas
//Conjuntos -> grupo de valores úicos
val conj2 : Set[Int] = Set()
val conjunto : Set[Int] = Set(1, 1, 2, 2, 2, 3)
val conjunto : Set[Int] = Set(1, 2, 3)
val conNuevo = conjunto + 6
//algunas funciones
val conjunto : Set[Int] = Set(1, 2, 3)
val conNuevo = conjunto.concat(List(2, 3, 4, 5))

val conjunto : Set[Int] = Set(1, 2, 3)
val conNuevo = conjunto.concat(List(2, 3, 4, 5))
conNuevo.intersect(conjunto)

//Mapas
//Diccionarios o mapas
//En Scala se contruyen diccionarios como mapas
//  Map[K, V]
//K - Representa a las claves
// V - representa a los valores
Map(("apples", 3), ("oranges", 2), ("pears", 0))
Map("apples" -> 3, "oranges" -> 2, "pears" -> 0)
//convertir
//Método toMap: convertir una Lista de tuplas en un mapa
List(("apples", 3), ("oranges", 2), ("pears", 0)).toMap

//Método toSeq: convertir un Map en una secuencia de pares (tuplas 2)
Map(("apples", 3), ("oranges", 2), ("pears", 0)).toSeq
Map("apples" -> 3, "oranges" -> 2, "pears" -> 0).toSeq

//Map en funciones
val fruitBasket = Map("apples" -> 3, "oranges" -> 2, "pears" -> 0)

fruitBasket.map {
  case (fruit, count) => count * 2
}
//Otro modo
fruitBasket.map{case(fruit, count) => count * 2}

fruitBasket.map{case (fruit, count) => (fruit, count * 2)}

fruitBasket.map{case(fruit, count) => (fruit, count, count * 2)}.
  map{case (fruit, _, count2) => (fruit, count2/2)}.toMap