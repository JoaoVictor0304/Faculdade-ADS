# Crie um programa em Python que solicite ao usuário a sua idade e mostre se o
# mesmo pode ou não ter CHN.

idade = int(input('Digite a sua idade: '))

if idade >= 18: #condicional simples
    print('Pode ter CNH')
    print('Procure uma autoescola')
else: #condição falta
    print('Não pode ter CNH')