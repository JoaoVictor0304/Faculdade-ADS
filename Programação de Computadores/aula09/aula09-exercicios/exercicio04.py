# Escreva um algoritmo que leia um grupo de valores reais e determine quantos valores
# são positivos e quantos são negativos. Determine, também, qual é o menor desses
# valores. Utilize o comando de repetição que desejar.

positivos = 0
negativos = 0
menorvalor = None
resp = 's'

while resp == 's' or resp == 'S':
    num = float(input('Digite um valor inteiro: '))

    if num > 0:
        positivos = positivos + 1
    else:
        negativos = negativos + 1

    if menorvalor is None or num < menorvalor:
        menorvalor = num

    resp = input('Deseja continuar (S/N)? ')

print('Quantidade de números positivos: ', positivos)
print('Quantidade de números negativos: ', negativos)
print('O menor número digitado foi: ', menorvalor)