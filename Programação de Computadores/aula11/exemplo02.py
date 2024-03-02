# solicitar qtde indeterminada de valores e armazenar
# na lista. Calcular e mostrar a média dos valores
# e quantos valores estão acima desta média.

valores = []

# acumulador
soma = 0
# contador
cont = 0
# variável de controle
resp = 's'

# upper converte string para maíusculo
while resp.upper() == 'S':
    v = float(input('Digite um valor: '))
    valores.append(v)
    soma += v # soma = soma + v
    # atualiza a variável de controle
    resp = input('Deseja continuar (S/N)? ')

# len - qtde de elementos da lista
media = soma/len(valores)

# for i in range(len(valores)):
#     if valores[i] > media:
#         cont += 1

for a in valores:
    if a > media:
        cont += 1

print(valores)
print('Média: ', media)
print('Qtde acima da média: ', cont)