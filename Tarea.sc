val nombres = List("Oscar Becerra", "Luis Amarilla", "Michael Estrada", "Fidel Martínez", "Gonzalo Mastriani",
  "Leonel Vides", "Rodrigo Aguirre", "Carlos Garces", "Jonathan Borja")
val goles = List(17, 16, 16, 16, 13, 13, 12, 12, 11)
val goleadores = nombres zip goles
//Pregunta 1
//El promedio de goles
def promedioGoles(lista  : Seq[Int]) : Double = {
  val a = lista.foldLeft((0.0, 0))((acc, currVal) => (acc._1 + currVal, acc._2 + 1))
   a._1 / a._2
}
printf("El promedio de goles es: %.2f\n", promedioGoles(goles))
//val g = goleadores.map(_._2).map(_.toDouble)
//val average = (values : List[Double]) => values.sum/values.length
//val avgGol = average(g)
//Pregunta 2
//El nombre del jugador con más goles
println("El jugador con más goles es:\n" + goleadores.maxBy(_._2)._1)

//Pregunta 3
//El nombre del jugador con menos goles.
println("El jugador con menos goles es:\n" + goleadores.minBy(_._2)._1)

//Pregunta 4
//Una lista con los nombres de los jugadores, cuyo número de goles sea mayor que el promedio
def mayorPromedio(lista : List[(String, Int)]): List [String] = {
  lista.filter(_._2 > promedioGoles(goles)).map(_._1)
}
printf("Los jugadores con mayor número de goles que el promedio son: %s\n", mayorPromedio(goleadores))

//Pregunta 5
//Una lista con los nombres de los jugadores, cuyo número de goles sea menor que el promedio
def menosPromedio (lista : List[(String, Int)]): List [String] = {
  lista.filter(_._2 < promedioGoles(goles)).map(_._1)
}
printf("Los jugadores con menor número de goles que el promedio son: %s\n", menosPromedio(goleadores))