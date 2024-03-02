"""Vamos criar um programa que solicite um número real, calcule e que apresente: a) o valor absoluto; b) somente a sua parte inteira; c) sua raiz quadrada; d) o fatorial desse número."""

import math

#entrada de dados
num = float(input("Digite um número: "))

#processamento
absoluto = math.fabs(num)
inteiro = math.trunc(num)
fatorial = math.factorial(math.trunc(math.fabs(num)))

#saída
print("O valor absoluto: ", absoluto)
print("O valor inteiro: ", inteiro)
print("O valor fatorial: ", fatorial)