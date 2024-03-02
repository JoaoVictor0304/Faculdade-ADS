# Crie um programa em Python que solicite ao usuário três valores inteiros (A, B e C) e
# verifica se o valor armazenado em B é o menor.

a = int(input('Digite um valor: '))
b = int(input('Digite outro valor: '))
c = int(input('Digite outro valor: '))

if a > b and b < c:
    print('O valor de b é menor')
