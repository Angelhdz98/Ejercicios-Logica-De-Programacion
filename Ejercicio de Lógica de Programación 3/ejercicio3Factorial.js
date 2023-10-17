let valor;
let i=0;
  while (i==0) {
    valor = parseInt(prompt("Ingresa un número entero para calcular su factorial:"));
    if (!isNaN(valor) && Number.isInteger(valor)) {
      i++;
    } else {
      console.log("¡Eso no es un número entero válido! Por favor, ingresa un número entero.");
    }
  }
let factorial=1;
for(let j=1; j<=valor;j++){
factorial=factorial*j;
}
console.log(" el factorial de ", valor," es: ", factorial);
