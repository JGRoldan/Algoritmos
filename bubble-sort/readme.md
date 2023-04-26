## Bubble Sort

### Idea

Recorrer el array y preguntar si el elemento en el indice siguiente al actual es mayor al elemento actual.  
Si es afirmativo, swap. La idea es dejar los elementos mas chicos a la izquierda.  
La __complejidad__ es O(n<sup>2</sup>).  

```
arr = [8,5,7,9,1,3]
temp = 0
for(i = 0; i < arr.length-1; i++){
  for(j = 0; j < arr.length-i-1; j++)
    if(arr[j] > arr [j+1])
        temp = arr [j]
        arr[j] = arr[j+1]
        arr[j+1] = temp
}
```
