public static void insertionSort(int[] arr){
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
public static void printArray(int []arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
}
public static void main(String[] args) {
        int[] arr = {8,5,9,4,2,1,10};
        System.out.println("Antes del algoritmo: ");
        printArray(arr);
        //Lamada a la funcion de ordenamiento
        insertionSort(arr);
        System.out.println("\nDespues del algoritmo:");
        printArray(arr);
}
