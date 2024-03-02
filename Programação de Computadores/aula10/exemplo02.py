# 2 - Faça um programa em Python que solicite a uma quantidade
# indeterminada de usuários sua altura e sexo, calcule e imprima para
# cada um o seu peso ideal. Utilize a seguinte convenção:
# ▪ Para homens: (72.7*h) – 58
# ▪ Para mulheres: (62.1*h) – 44.7

# inicialização da variável de controle
resp = 's'

while resp == 's' or resp == 'S':
    sexo = input('Insira o seu sexo M-Masculino ou F-Feminino: ')
    altura = float(input('Insira sua altura: '))

    if sexo == 'M' or sexo == 'm':
        ideal = (72.7*altura)-58   
        print('O peso ideal é: ', ideal)    
    elif sexo == 'F' or sexo == 'f':
        ideal = (62.1*altura)-44.7
        print('O peso ideal é: ', ideal)
    else:
        print('Digite uma altura válida!')
            
    # atualização de variável de controle 
    resp = input('Quer continuar (S/N)? ')