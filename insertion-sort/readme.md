## Insertion Sort

### Idea
Suponemos que el primer elemento esta ordenado, empezamos desde el array en el index 1.  
Despues se compara con cada elemento y si el actual es menor al elemento anterior se hace swap.
La __complejidad__ es O( n<sup>2</sup>).  

```
   for(i=1: i< arr.length ; i++)
       j = i
       while (j > 0 && arr[j-1] > arr[j])
           temp = arr[j]
           arr[j] = arr[j-1]
           arr[j-1] = temp
           j= j-1
```
