# laço contado com o comando while

contador = 0

while contador < 5:
    n1 = float(input('Digite a nota 1: '))
    n2 = float(input('Digite a nota 2: '))
    media = (n1+n2)/2
    print('A média é: ', media)
    # atualizar a variável de controle
    contador = contador + 1