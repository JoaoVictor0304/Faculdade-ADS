#- Escreva um programa em Python para calcular o valor de uma prestação em atraso (prestacao). Para isso, obtenha o valor da prestação (valorPrestacao), a porcentagem de multa pelo atraso (multa) e a quantidade de dias de atraso (qtdeDias). Calcular e mostrar o valor da prestação atualizado, sabendo que: prestacao=valorPrestacao+(valorPrestacao*(multa/100)*qtdeDias)

valorPrestacao = float(input('Digite o valor da multa: '))
multa = int(input('Digite a parcentagem de multa pelo atraso: '))
qtdeDias = int(input('Digite a quantidade de dias em atraso: '))

prestacao = valorPrestacao+(valorPrestacao*(multa/100)*qtdeDias)

print('Valor da prestação atualizada:', prestacao)