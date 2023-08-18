//Complejidad en el peor caso: O(log n)
//Requisito: El array debe estar ordenado.
//Descripción: Divide repetidamente el array a la mitad y compara el valor buscado con el valor en el medio. Descarta la mitad en la que no puede estar el valor buscado.

    public boolean binarySearch(int num, int[] arr, int firstElem, int lastElem){
        
        int mid = (firstElem + lastElem) /2;
        
        if(lastElem < firstElem) return false;
        
        if (num < arr[mid]) return binarySearch(num, arr, firstElem, mid - 1);
		
		if (num > arr[mid]) return binarySearch(num, arr, mid + 1, lastElem);
		
		if (num == arr[mid]) return true;
		
		return false;
       
