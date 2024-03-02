# exemplo com lista
# criar listas
nomes = []
numeros = list()

for i in range(5):
    nome = input('Digite um nome: ')
    nomes.append(nome) # adiciona no final da lista

for i in range(5):
    nro = int(input('Digite um número: '))
    numeros.insert(i, nro) # adiciona em um lugar específico da lista

print(nomes)
print(numeros)


# sort - ordena os elementos da lista
nomes.sort()
print(nomes)

# remove - exclui elemento da lista
retira = int(input('Digite o número a ser excluído: '))
numeros.remove(retira)
print(numeros)

nomes.insert(2, 'rodolfo')
print(nomes)