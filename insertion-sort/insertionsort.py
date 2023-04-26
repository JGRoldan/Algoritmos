def insertionSort(arr):
        temp = 0;
        for i in range(len(arr)):
          j = i;
          while (j > 0 and arr[j-1] > arr[j]):
              temp = arr[j]
              arr[j] = arr[j-1]
              arr[j-1] = temp
              j= j-1

arr = [8,5,9,4,2,1,10]
print("Antes del algoritmo: ", arr)
insertionSort(arr)
print("Despues del algoritmo: ", arr)
