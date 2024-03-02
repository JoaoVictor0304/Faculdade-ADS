# 3 - Foi feita uma pesquisa entre os habitantes de uma região. Foram coletados os dados
# de idade e salário. Faça um algoritmo que informe:
# a) a média de idade do grupo;
# b) a média de salários das pessoas com mais de 40 anos;
# c) quantidade de pessoas com salário abaixo de R$600,00.
# Encerre a entrada de dados quando for digitada uma idade negativa (os dados da idade
# negativa não podem entrar nos cálculos dos itens solicitados acima).

# item a
qtdeTotal = 0 # contador
somaIdade = 0 # acumulador
# item b
qtdeSal = 0
somaSal = 0
# item c
qtde = 0

while True:
    idade = int(input('Digite a idade: '))
    # critério de parada
    if idade < 0:
        break # para a estrutura de repetição

    salario = float(input('Digite o salário: '))
    # resolvendo item a
    qtdeTotal += 1
    somaIdade += idade
    # resolvendo item b
    if idade >= 40:
        qtdeSal += 1
        somaSal += salario
    # resolvendo item c
    if salario <= 600:
        qtde += 1

print('Média de idade do grupo:', (somaIdade/qtdeTotal))
print('A média de salário das pessoas com mais de 40 anos:', (somaSal/qtdeSal))
print('Quantidade de pessoas com salário < R$ 600,00', qtde)