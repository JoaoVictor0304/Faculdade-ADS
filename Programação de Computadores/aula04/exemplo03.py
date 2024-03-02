# Crie um programa em Python que solicite ao usuário a sua idade expressa em anos,
# meses e dias (variáveis separadas). Calcule e mostre a idade expressa apenas em dias.
# Para isso considere 1 ano = 365 dias, 1 mês = 30 dias.

ano = int(input('Forneça a sua idade: '))
mes = int(input('Forneça o mês em que nasceu: '))
dia = int(input('Forneça o dia em que nasceu: '))

a = ano * 365
m = mes * 30

resultado = a + m + dia

print(f'Sua idade em dias é: {resultado}')