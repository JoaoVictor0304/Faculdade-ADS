# criar uma lista
nomes = []
itens = list()

# armazena valores em uma lista
for i in range(5):
    n = input('Digite um nome: ')
    nomes.append(n)

for i in range(3):
    item = input('Digite um item qualquer: ')
    itens.insert(i, item)

# exibe valores das listas
print(nomes)
print(itens)

# ordenar os itens
nomes.sort()
itens.sort()

print(nomes)
print(itens)

# exclue elemento da lista
exclue = input('Digite o nome que deseja excluir: ')
nomes.remove(exclue)

print(nomes)