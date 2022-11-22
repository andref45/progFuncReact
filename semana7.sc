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

//filter
//Itera sobre pares key/values
val fruitBasket = Map("apples" -> 3, "oranges" -> 2, "pears" -> 0)
fruitBasket


//GroupBy
//Reorganiza una secuencia en un mapa donde algunos de los elementos de la secuencia original
// se agrupan en subsecuencias
// Por ejemplo dada una secuencia de palabras, podemos agrupar todas las palabras que comienzan con la letra "y"
// en una subsecuencia y todas las demás palabras en otra subsecuencia

Seq("wombat", "xanthan", "yogurt", "zebra").
  groupBy(s => if (s startsWith "y") 1 else 2)

// El argumento del groupBy es una función que calcula el "key" de cada elemento de cada secuencia
// Asigna cada clave a la subsecuencia de valores que tienen esa clave. En el ejemplo actual el tipo de mapa es,
// por tanto, Map [Int, Seq[String])

// EL orden de los elementos en las subsecuencias sigue siendo el mismo que en la secuencia original
List(1, 2, 3, 4, 5).groupBy(k => k % 3)


val nombres = List("Oscar Becerra", "Luis Amarilla", "Michael Estrada", "Fidel Martínez", "Gonzalo Mastriani",
  "Leonel Vides", "Rodrigo Aguirre", "Carlos Garces", "Jonathan Borja")
val goles = List(17, 16, 16, 16, 13, 13, 12, 12, 11)
val goleadores = nombres zip goles
goleadores.groupBy{case (_, goals) => goals }
//Cuantos hicieron los mismos goles
goleadores.groupBy(row => row  match {
  case(_, goals) => goals
}).map(row => row match {
  case (goles, lista) => (goles, lista.size)
}).toList.sortBy(_._2)

// Número de goles más comúm
goleadores.groupBy(row => row match {
  case(_, goals) =>
}).map(row => row match{
  case (goles, lista) => (goles, lista.size)
}).toList.sortBy(_._2).reverse
