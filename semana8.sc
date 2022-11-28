//El problema de los efectos colaterales
//FP se basa en funciones que no deberían tener efectos colaterales
//Ejemplo
val cont = 0;
void addOne(){
  cont = cont + 1; // -> modificar algo que no es el del método
}