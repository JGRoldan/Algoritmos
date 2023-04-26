const insertionSort = (arr) =>{
        let temp = 0;
        for(let i=1; i< arr.length ; i++){
          let j = i;
          while (j > 0 && arr[j-1] > arr[j]){
              temp = arr[j]
              arr[j] = arr[j-1]
              arr[j-1] = temp
              j= j-1
          }
        }
        
}

let arr = [8,5,9,4,2,1,10]
console.log("Antes del algoritmo: " + arr)
insertionSort(arr)
console.log("Despues del algoritmo: " +arr)
