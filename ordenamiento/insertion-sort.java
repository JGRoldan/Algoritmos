//INSERTION SORT
//Complejidad en el peor caso: O(n^2)
//Descripción: Divide el array en una parte ordenada y otra desordenada. Toma elementos de la parte desordenada y los inserta en la posición correcta en la parte ordenada.
public void insertionSort(int[] arr){
        int temp = 0;
        for(int i=1; i< arr.length ; i++){
           int j = i;
           while (j > 0 && arr[j-1] > arr[j]){
               temp = arr[j];
               arr[j] = arr[j-1];
               arr[j-1] = temp;
               j= j-1;
           }
        }
}
