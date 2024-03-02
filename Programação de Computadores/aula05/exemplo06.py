# Crie um programa em Python que solicite ao usuário um número e mostre se o
# mesmo é par ou ímpar.

n1 = float(input('Digite a primeira nota: '))
n2 = float(input('Digite a segunda nota: '))

m = (n1+n2)/2

if m >= 6:
    print('Aprovado! Sua média foi:', m)
else:
    print('Reprovado! Sua média foi:', m)