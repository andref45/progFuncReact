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