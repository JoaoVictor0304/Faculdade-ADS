# Crie um algoritmo que solicite ao usuário o seu turno de trabalho e a quantidade de
# horas trabalhadas, calcule e mostre o valor do salário. Considere os valores de horas a
# seguir, de acordo com o turno de trabalho. Caso o turno seja igual a ‘N’ (utilize um
# caractere para representar) o valor da hora trabalhada é R$ 45,00, caso contrário é R$
# 37,50.

turno = input('Qual é seu turno de trabalho D-Diurno T-Tarde N-noturno: ')
horas = int(input('Quantidade de horas trabalhada: '))

if turno == 'N' or turno == 'n':
    print('Valor do salário: ', horas*45)
else:
    print('Valor do salário: ', horas*37.50)