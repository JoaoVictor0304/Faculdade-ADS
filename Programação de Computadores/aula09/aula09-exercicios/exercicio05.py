# Temos um grupo de pessoas. Escreva um programa em Python que leia o sexo e a
# altura de cada pessoa, calcule e mostre a altura média das mulheres e dos homens
# separadamente. Utilize o comando de repetição que desejar.

alturaMulher = 0
alturaHomem = 0
masculino = 0
feminino = 0
resp = 's'

while resp == 's' or resp == 'S':
    sexo = input('Qual o seu sexo M-masculino ou F-feminino: ')
    altura = float(input('Qual a sua altura: '))

    if sexo == 'M' or sexo == 'm':
        masculino = masculino + 1
        alturaHomem = alturaHomem + altura
    else:
        feminino = feminino + 1
        alturaMulher = alturaMulher + altura

    resp = input('Deseja continuar inserindo (S/N)? ')
 
mediaFeminina = alturaMulher/feminino
mediaMasculina = alturaHomem/masculino

print(f'Altura média das mulheres: {mediaFeminina:.2f}')
print(f'Altura média dos homens: {mediaMasculina:.2f}')
