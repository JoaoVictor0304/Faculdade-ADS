#Exemplo 02 - número invertido
#Entrada de dados
num = int(input("Digite um número com 3 digitos: "))

#Processamento
d1 = num // 100
d2 = num % 100 // 10
d3 = num % 10

invertido = d3 * 100 + d2 * 10 + d1

#saída
print("O número invertido é: ", invertido)