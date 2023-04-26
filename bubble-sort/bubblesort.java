public static void main(String[] args) {
        int [] arr = {8,5,4,10,3};
        int temp = 0;
        System.out.println("Antes del algoritmo: ");
        for(int i : arr){
            System.out.print(i+ " ");
        }
        
        //BUBBLE SORT
        for(int i=0; i< arr.length-1; i++){
            for(int j=0; j< arr.length-i-1; j++){
                if(arr[j] > arr [j+1]){
                    temp = arr [j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        System.out.println("\nDespues del algoritmo: ");
        for(int i : arr){
            System.out.print(i+ " ");
        }
    }
