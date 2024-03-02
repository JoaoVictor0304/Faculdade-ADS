# laço condicional

# acumulador
soma = 0
# contador
cont = 0

# inicialização da variável de de controle
resp = 's'

while resp == 's' or resp == 'S':
    n = int(input('Digite um valor: '))
    # acumula valor
    soma = soma + n
    # contabiliza a qtde de números digitados
    cont = cont + 1
    # atualizar a variável de controle
    resp = input('Deseja continuar (S/N)? ')

media = soma/cont
print('Média = ', media)