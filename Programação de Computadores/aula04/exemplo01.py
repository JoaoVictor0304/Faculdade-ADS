# Faça um programa em Python que calcule e mostre o valor do volume do tronco de
# uma pirâmide, para isso o programa deve solicitar ao usuário os valores da altura do
# tronco da pirâmide (h), o valor da base menor (Bmenor) e o da base maior (Bmaior) e
# calcular a seguinte expressão:
# volume =h/3*(Bmaior**2 + Bmenor**2 + (Bmaior**2 * Bmenor**2)**0.5)

h = float(input('Altura do tronco da pirâmida: '))
bmenor = float(input('Valor da base menor: '))
bmaior = float(input('Base maior: '))

valor = h/3*(bmaior**2 + bmenor**2 + (bmaior**2 * bmenor**2)**0.5)


print(f'O valor do troco da piramide é: {valor}')