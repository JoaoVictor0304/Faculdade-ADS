# Faça um programa em Python que solicite ao usuário o dia da semana e o volume de
# chuva correspondente a 10 dias. As informações obtidas devem ser armazenadas em 2
# listas distintas (observe que cada lista poderá ter apenas 10 itens armazenados e que na
# posição i das duas listas ficarão armazenados: o dia da semana i e o volume de chuva i). É
# obrigatório o uso de estrutura de repetição e listas.
# Em seguida, calcule e mostre o volume médio de chuva apenas do dia de semana igual a
# quarta-feira e a soma total do volume de chuva, para isso utilize os dados armazenados
# nas listas.

dias = []
volumes = []

# acumular do volume quarta
somaQ = 0
somaT = 0
# contador
contQ = 0

# armazena informações nas listas
for i in range(5):
    v = float(input('Digite o volume de chuva: '))
    volumes.append(v)
    s = input('Digite o dia da semana: ')
    dias.append(s)

    somaT += v
    if s.upper() == 'QUARTA-FEIRA':
        somaQ += v
        contQ += 1
    
media = somaQ/contQ

print(f'Média de volume de chuva: {media}')