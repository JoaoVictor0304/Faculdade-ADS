# 1- Faça um programa em Python que recebe a idade de cada um dos 5
# alunos de uma escola, matriculados no Ensino Médio. O algoritmo deverá,
# usando estrutura de repetição, verificar, calcular e imprimir:
# a) a quantidade de alunos que podem votar, ou seja, têm idade mínima de 16
# anos.
# b) a média da idade dos alunos que não são eleitores.

qtdeAlunos = 0

qtdeNao = 0

soma = 0

for i in range(5):
    idade = int(input('Digite a idade do aluno: '))
    if idade >= 16:
        qtdeAlunos += 1
    else:
        qtdeNao += 1
        soma += idade
        
media = soma/qtdeNao

print(f'A quantidade de alunos eleitores: ', qtdeAlunos)
print(f'Média da idade dos não elitores: ', media)




# naoVota = 0
# contadorAlunos = 0
# idadeMedia = 0
# resp = 's'

# while resp == 's' or resp == 'S':
#     idade = int(input('Ensira a idade do aluno: '))
    
#     if idade < 16:
#         naoVota = naoVota + 1
#         idadeMedia = idadeMedia + idade
#     else:
#         contadorAlunos = contadorAlunos + 1
    
#     resp = input('Deseja continuar inserindo (S/N)? ')

# media = idadeMedia/naoVota
# print(f'A idade média da pessoas que não votam é: {media:.0f} ')
# print(f'A quantidade de alunos eleitores: {contadorAlunos:.0f}')