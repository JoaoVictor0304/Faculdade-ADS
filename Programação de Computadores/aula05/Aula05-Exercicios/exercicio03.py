# Faça um programa em Python que obtenha o valor de uma compra, calcular e mostrar
# o valor da compra considerando o desconto, conforme descrito abaixo:
# para compras acima de R$ 200 a loja dá um desconto de 20%
# para as abaixo disso não tem desconto, mostre o valor da compra.

compra = float(input('Qual o valor da compra: '))

if compra > 200:
    res = compra-(compra*0.2)
    print('Valor da compra com desconto: ', res)
else:
    print('Valor da compra: ', compra)