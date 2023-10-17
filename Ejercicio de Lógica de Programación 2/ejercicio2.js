// pido la temperatura en grados celsius
var celsius = prompt("Ingresa la temperatura en grados Celsius:");

// Convierto a distintas unidades
var fahrenheit = (celsius * 9/5) + 32;
var kelvin = parseFloat(celsius) + 273.15;

// muestro los resultados por consola
console.log("La temperatura en grados Fahrenheit es: " + fahrenheit.toFixed(2) + " °F");
console.log("La temperatura en grados Kelvin: " + kelvin.toFixed(2) + " °K");// muestro solo las 2 primeras cifras

