val goleadores = List(
  ("Francisco Fydriszewski","Delantero centro","Argentina / Polonia",29,"SD Aucas",11, 1, 2, 884, 88, 0.91, 10),
  ("Joaquín Vergés","Mediocentro ofensivo","Uruguay",30,"Gualaceo SC",15, 2, 1, 1120, 124, 0.6, 9),
  ("Santiago Giordana","Delantero centro","Argentina",27,"Mushuc Runa SC",15, 1, 1, 1108, 123, 0.6, 9),
  ("Ismael Díaz","Extremo izquierdo","Panamá",25,"CD Universidad Católica",13, 4, 0, 869, 109, 0.62, 8),
  ("Tomás Molina","Delantero centro","Argentina",27,"LDU Quito",13, 2, 0, 905, 129, 0.54, 7),
  ("Danny Luna","Extremo izquierdo","Ecuador",31,"AD Nueve de Octubre",15, 1, 2, 1189, 170, 0.47, 7),
  ("Cristian Martínez","Delantero centro","Colombia / México",34,"CD Universidad Católica",14, 1, 1, 975, 139, 0.5, 7),
  ("Gabriel Cortez","Mediocentro ofensivo","Ecuador",27,"Barcelona SC Guayaquil",8, 1, 1, 511, 73, 0.88, 7),
  ("Leonardo Villagra","Delantero centro","Paraguay",32,"Orense SC",15, 3, 2, 1283, 214, 0.4, 6),
  ("Michael Hoyos","Extremo derecho","Ecuador",31,"LDU Quito",12, 2, 1, 729, 122, 0.5, 6),
  ("Gonzalo Mastriani","Delantero centro","Uruguay",29,"Barcelona SC Guayaquil",13, 0, 2, 816, 136, 0.46, 6),
  ("Lisandro Alzugaray","Extremo derecho","Argentina",32,"CD Universidad Católica",12, 6, 0, 950, 190, 0.42, 5),
  ("Renato César","Delantero centro","Uruguay",29,"Guayaquil City FC",15, 3, 0, 1183, 237, 0.33, 5),
  ("Jonathan Bauman","Delantero centro","Argentina",31,"Independiente del Valle",15, 2, 2, 1065, 213, 0.33, 5),
  ("Sebastián Rodríguez","Pivote","Uruguay / España",30,"CS Emelec",13, 1, 4, 1015, 203, 0.38, 5),
  ("Klebinho","Lateral derecho","Brasil",24,"Guayaquil City FC",13, 5, 0, 1033, 258, 0.31, 4),
  ("Jhon Cifuente","Delantero centro","Ecuador",30,"Delfin SC",12, 3, 1, 634, 159, 0.33, 4),
  ("Alexis Zapata","Mediocentro ofensivo","Colombia",27,"CS Emelec",14, 2, 0, 809, 202, 0.29, 4),
  ("Alexander Alvarado","Extremo izquierdo","Ecuador",23,"LDU Quito",13, 2, 2, 907, 227, 0.31, 4),
  ("Janner Corozo","Extremo izquierdo","Ecuador",27,"Delfin SC",15, 1, 0, 1252, 313, 0.27, 4),
  ("Lucas Mancinelli","Extremo derecho","Argentina",33,"Deportivo Cuenca",14, 0, 1, 1154, 289, 0.29, 4),
  ("Mauro Quiroga","Delantero centro","Argentina",32,"CS Emelec",11, 0, 0, 577, 144, 0.36, 4),
  ("Willian Cevallos","Pivote","Ecuador",32,"CD Universidad Católica",15, 4, 0, 944, 315, 0.2, 3),
  ("Rodrigo Rivas","Delantero centro","Colombia",25,"CD Universidad Católica",14, 3, 0, 313, 104, 0.21, 3),
  ("Gustavo Alles","Delantero centro","Uruguay / Italia",32,"Gualaceo SC",13, 3, 0, 958, 319, 0.23, 3)
)

//1 Calcular el promedio de:
val promGoles = goleadores.map(_._12).map(_.toDouble).sum/goleadores.size
val promEdad = goleadores.map(_._4).map(_.toDouble).sum/goleadores.size
val promPartidos = goleadores.map(_._6).map(_.toDouble).sum/goleadores.size
val promAsistencias = goleadores.map(_._7).map(_.toDouble).sum/goleadores.size
val promPenal = goleadores.map(_._8).map(_.toDouble).sum/goleadores.size
val promTiempoJugado = goleadores.map(_._9).map(_.toDouble).sum/goleadores.size
val promMinGol = goleadores.map(_._10).map(_.toDouble).sum/goleadores.size
val promGolEncuentro = goleadores.map(_._11).map(_.toDouble).sum/goleadores.size

// 2 ¿Cuál es el equipo que más goleadores posee?
goleadores.groupBy{
  case(_, _, _, _, eqp, _, _, _, _, _, _, _) => eqp
}.map(row => row match{
  case(goles, lista) => (goles, lista.size)
}).toList.maxBy(_._2)._1

// 3 ¿Cuántos jugadores tienen más de una nacionalidad?
goleadores.count(_._3 contains "/")

// 4 ¿Cuál es la posición más común entre los goleadores?
goleadores.groupBy{
  case(_, p, _, _, _, _, _, _, _, _, _, _) => p
}.map(row => row match{
  case(n, lista) => (n, lista.size)
}).maxBy(_._2)._1

// 5 ¿Cuál es la nacionalidad más frecuente entre los goleadores?
goleadores.groupBy{
  case(_, _, pais, _, _, _, _, _, _, _, _, _) => pais
}.map(row => row match{
  case(n, lista) => (n, lista.size)
}).maxBy(_._2)._1

// 6 De los jugadores ecuatorianos ¿cuál ha marcado más goles de penal?
goleadores.filter(_._3 == "Ecuador").maxBy(_._8)._1

// 7 ¿Cuál es el goleador más joven?
goleadores.minBy(_._4)._1

// 8 ¿Cuál es el goleador de mayor edad?
goleadores.maxBy(_._4)._1

// 9 ¿Cuál es la nacionalidad, posición y nombre del goleador que menos partidos ha jugado?
goleadores.minBy(_._6)._1
goleadores.minBy(_._6)._2
goleadores.minBy(_._6)._3

// 10 ¿Cuáles son los nombres únicos de los equipos a los que pertenecen los goleadores?
goleadores.map(_._5).distinct