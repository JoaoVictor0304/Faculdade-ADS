# Escreva um algoritmo que solicite um número ao usuário. Caso seja digitado um valor
# entre 0 e 9, mostre: “valor correto”, caso contrário mostre: “valor incorreto”.

num = int(input('Digite um número: '))

if num >= 0 and num <= 9:
    print('Valor correto!')
else:
    print('Valor incorreto!')