let valorSecreto= parseInt(23);

let valor;
let i=0;
  while (i==0) {
    valor = parseInt(prompt("Ingresa un valor, a ver si adivinas el numero más iconico de todos del 1 al 100 (secreto)"));
    if (!isNaN(valor) && Number.isInteger(valor) && valor==valorSecreto) {
      i++;
    }else if(!isNaN(valor) && Number.isInteger(valor) && valor!=valorSecreto && valor>1 && valor<100){

      
        console.log("lo siento, ", valor, " no es el valor secreto");
    } 
    else if(valor<1|| valor>100){
        console.log("El valor esta fuera del rango solicitado, por favor ingresa un número entero entre el 1 y el 100");
    } 
    else {
      console.log("¡Eso no es un número entero válido! Por favor ingresa un número entero entre el 1 y el 100");
    }

  }

  console.log("bien hecho has acertado ", valorSecreto, " es el numero secreto" );


