# Ler três valores inteiros (variáveis a, b e c) e efetuar o cálculo da equação de segundo
# grau, apresentando: as duas raízes, quando for possível efetuar o cálculo (delta positivo ou
# zero); a mensagem "Não há raízes reais", se não for possível fazer o cálculo (delta
# negativo); e a mensagem "Não é equação do segundo grau", se o valor de A for igual a
# zero.

import math

a = int(input('Digite o valor de A: '))
b = int(input('Digite o valor de B: '))
c = int(input('Digite o valor de C: '))

delta = b*b-4*a*c

if a == 0:
    print('Não é equação de segundo grau!')
elif delta >= 0:
    x1 = (-b+math.sqrt(delta))/(2*a)
    x2 = (-b-math.sqrt(delta))/(2*a)
    print('O valor de x1 é %2f e valor de x2 é %2f' %(x1, x2))
elif delta < 0:
    print('Não há raízes reais!')
    