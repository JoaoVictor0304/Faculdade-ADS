# Faça um programa em Python que contenha 3 listas, uma com as notas, a segunda
# com nomes dos alunos e a terceira com nome do curso. Utilize como critério de parada a
# nota negativa.
# ▪ Calcule e mostre a média das notas.
# ▪ Exiba o nome do aluno e o curso, as quais a nota é maior do que média
# É obrigatório o uso de estrutura de repetição e listas.

notas = list()
nomes = list()
cursos = list()

# acumulador
soma = 0

while True:
    n = float(input('Digite uma nota: '))
    if n < 0: # critério de parada
        break

    notas.append(n)
    soma += n

    nomes.append(input('Digite o nome do aluno: '))
    cursos.append(input('Digite o curso do aluno: '))

if len(notas) > 0:
    media = soma/len(notas)
    print('Média: ', media)

    for i in range(len(notas)):
        if notas[i] > media:
            print('Nome: ', nomes[i], '\nCurso: ', cursos[i], '\nNotas: ', notas[i])