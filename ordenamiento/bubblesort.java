//BUBBLE SORT
//Complejidad en el peor caso: O(n^2)
//Descripción: Compara elementos adyacentes y los intercambia si están en el orden incorrecto. Repite este proceso hasta que no haya intercambios en un recorrido completo del array.
for(int i=0; i< arr.length-1; i++){
   for(int j=0; j< arr.length-i-1; j++){
       if(arr[j] > arr [j+1]){
            temp = arr [j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
       }
   }
}
