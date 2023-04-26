arr = [8,5,4,10,3] 
temp = 0;
print("Antes del algoritmo \n", arr)

for i in range(len(arr)-1):
    for j in range(len(arr)-i-1):
       if(arr[j] > arr [j+1]):
            temp = arr [j]
            arr[j] = arr[j+1]
            arr[j+1] = temp

print("Despues del algoritmo \n", arr)
