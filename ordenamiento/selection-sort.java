//SELECTION SORT
//Complejidad en el peor caso: O(n^2)
//Descripción: Busca el elemento mínimo en el array y lo intercambia con el primer elemento. 
//Luego busca el siguiente elemento mínimo en el subarray restante y lo intercambia con el segundo elemento, y así sucesivamente.

private void swap(int[] arr, int min, int i){
        int temp = arr[min]; 
        arr[min] = arr[i]; 
        arr[i] = temp; 
}
    
public void selectionSort(int[] arr){
        
    int lastElem = arr.length;
        
    for(int i = 0; i < lastElem - 1; i++){
        int min = i;
        for(int j = i+1; j < lastElem ; j++){
            if(arr[j] < arr[min])
                min = j;
        }
        swap(arr, min, i);
    }
        
}
