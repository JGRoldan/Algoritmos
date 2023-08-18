//Al recorrer todo el array la complejidad es O(n)
public boolean linearSearch(int elem, int[] arr){
        for(int el : arr)
            if(el == elem)
                return true;
    
        return false;
}
