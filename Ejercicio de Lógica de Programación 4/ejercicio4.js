
let valor;
let i=0;
  while (i==0) {
    valor = parseInt(prompt("Ingresa el numero de la posición de la serie de fibonacci hasta la que desees ver:"));
    if (!isNaN(valor) && Number.isInteger(valor)) {
      i++;
    } else {
      console.log("¡Eso no es un número entero válido! Por favor, ingresa un número entero.");
    }
  }

  function fibonacci(n) {
  var fib = [0, 1];

  if (n === 1) {
    console.log("Serie de Fibonacci hasta la posición 1:");
    console.log(fib[0]);
  } else if (n >= 2) {
    console.log("Serie de Fibonacci hasta la posición " + n + ":");
    console.log(fib[0]);
    console.log(fib[1]);

    for (var j = 2; j <= n; j++) {
      fib[j] = fib[j - 1] + fib[j - 2];
      console.log(fib[j]);
    }
  }

  }

let resultado = fibonacci(valor);






