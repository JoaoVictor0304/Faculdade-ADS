# Uma empresa está selecionando entre seus estagiários os que irão fazer um
# treinamento especial. O selecionado deve satisfazer ao mesmo tempo a dois critérios.
# O primeiro critério é que ele deve ter uma bolsa maior ou igual a R$ 750,00 e menor ou
# igual a R$ 950,00.
# O segundo critério leva em conta o tempo de estágio, este deve ser maior ou igual a 2
# anos.
# Escreva um programa em Python que solicite ao usuário o valor da bolsa e o tempo de
# estágio, e caso os critérios acima sejam satisfeitos, mostre a mensagem “Participará do
# treinamento”, caso contrário mostre “Não participará do treinamento”.

bolsa = float(input('Digite o valor da bolsa: '))
tempo = float(input('Quantos anos de estágio: '))

if bolsa >= 750 and  bolsa <= 950 and tempo >= 2:
    print('Participara do treinamento!')
else:
    print('Não participará do treinamento!')