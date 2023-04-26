let arr = [8,5,4,10,3]
let temp = 0;
console.log("Antes del algoritmo \n" + arr)

for(let i=0; i< arr.length-1; i++){
    for(let j=0; j< arr.length-i-1; j++){
        if(arr[j] > arr [j+1]){
            temp = arr [j]
            arr[j] = arr[j+1]
            arr[j+1] = temp
        }
    }
}
console.log("Despues del algoritmo \n" +arr)
