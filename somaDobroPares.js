const numeros = [2, 5, 7, 1, 10, 8, 3, 6];

const somaDobroPares = numeros
  .filter(n => n % 2 === 0)
  .map(n => n * 2)
  .reduce((soma, n) => soma + n, 0); 

console.log(somaDobroPares);
