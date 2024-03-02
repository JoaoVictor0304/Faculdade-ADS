tipo = input('Digite o tipo de diária \nS - Simples \nD - Duplo \nT - Triplo: ')
qtde = int(input('Digite a quantidade de dias de reserva: '))

if tipo == 's' or tipo == 'S':
    print('Quarto simples: ', qtde*255.5)
elif tipo == 'd' or tipo == 'D':
    print('Quarto duplo: ', qtde*305.5)
elif tipo == 't' or tipo == 'T':
    print('Quarto triplo: ', qtde*360.5)
else:
    print('Tipo de hospedagem inválido!')
