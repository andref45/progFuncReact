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
Map(("apples" -> 3), ("oranges" -> 2), ("pears" -> 0))