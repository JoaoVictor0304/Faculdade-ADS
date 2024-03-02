# Faça um programa que solicite ao usuário um número inteiro, calcule e mostre a raiz
# quadrada desse número. O programa deverá verificar antes se o número digitado é
# positivo, exibindo uma mensagem de alerta, caso seja negativo.

import math

num = int(input('Digite um número: '))

if num < 0:
    print('Você digitou um número negativo!')
else:
    res = math.sqrt(num)
    print('A raiz quadrada de %.2f é %.2f' %(num, res))