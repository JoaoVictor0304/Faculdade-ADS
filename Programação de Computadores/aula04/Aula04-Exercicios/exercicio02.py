#Escreva um programa em Python que solicite ao usuário o salário atual e mostre o salário acrescido de 5% de comissão. Sabendo que: comissao = salario*5/100

salario = float(input('Digite o seu salário: '))

comissao = salario+(salario*5/100)

print('Seu salário com a comissão de 5% é:', comissao)