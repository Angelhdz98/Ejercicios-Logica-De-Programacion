let input = prompt("ingresa 3 variables separadas por espacios");
let valores=input.split(' ');
valores[0]=parseFloat(valores[0]);
valores[1]=parseFloat(valores[1]);
valores[2]=parseFloat(valores[2]);
valores.sort(function (a,b){
    return b-a; //ordena de mayor a menor el arreglo
});
console.log("Numero mayor:", valores[0], "Numero de en medio: ",valores[1],"Numero menor: ",valores[2]);
if (valores[0]== valores[1] && valores[1] ==valores[2]){
    console.log("Todos las entradas son iguales");
} 



 