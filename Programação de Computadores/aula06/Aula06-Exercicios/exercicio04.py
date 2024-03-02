# Elabore um programa em Python que implemente uma calculadora com as funções de
# somar, subtrair, multiplicar e dividir. O programa deverá solicitar ao usuário os dois
# valores, e perguntar qual a operação pretendida (‘+’, ‘-‘, ‘*’ ou ‘/’ ) e a seguir calcular e
# mostrar o resultado.

n1 = float(input('Primeiro valor: '))
n2 = float(input('Segundo valor: '))
operacao = input('Operação +, -, *, ou /: ')

if operacao == '+':
    soma = n1 + n2
    print('Total:', soma)
elif operacao == '-':
    subtracao = n1 - n2
    print('Total:', subtracao)
elif operacao == '*':
    multiplicacao = n1 * n2
    print('Total:', multiplicacao)
elif operacao == '/':
    divisao = n1 / n2
    print('Total:', divisao)
else:
    print('Digite uma operação válida!')