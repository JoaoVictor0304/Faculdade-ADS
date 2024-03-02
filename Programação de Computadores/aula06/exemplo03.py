n1 = int(input('Digite o primeiro valor: '))
n2 = int(input('Digite o segundo valor: '))
n3 = int(input('Digite o terceiro valor: '))

if n1 > n2 and n1 > n3:
    print(n1, 'é o número maior!')
elif n2 > n1 and n2 > n3:
    print(n2, 'é o número maior')
elif n3 > n1 and n3 > n2:
    print(n3, 'é o número maior')