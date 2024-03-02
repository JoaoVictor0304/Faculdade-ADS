# strip - retirar a quebra de linha e o espaço em branco do inicío e do fim

b = '\n Fizeram a atividade? '
s = b.strip()
print(s)

# operador in - verifica se uma substring está contida na string
print('idade' in s)

#  replace - substitui todas as ocoorências de uma substring
s = s.replace('atividade', 'avaliação')
print(s)

# find - retorna o indice de onde a substring está contida
print(s.find('zer'))

# split - separa a string o caracter de separação e armazena em uma lista
resul = s.split('a')
print(resul)