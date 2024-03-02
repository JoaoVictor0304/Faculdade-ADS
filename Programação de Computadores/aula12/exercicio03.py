# O Cebolinha é um menino muito esperto, mas tem dificuldades de dicção. O seu
# problema é que toda vez que uma palavra tem um erre (R), ou dois erres (RR), ele o troca
# por um ele (L). Queremos escrever um programa para saber como o Cebolinha falaria
# uma palavra.
# Exemplo:
# Entrada: é uma única palavra que pode ou não conter
# erros e está escrita em caixa alta: churrasqueiro
# Saída: palavra como Cebolinha falaria: chulasqueilo

palavra = input('Digite uma palavra: ').upper()

troca = palavra.replace('RR', 'L')
troca = troca.replace('R', 'L')

print('Entrada: ', palavra)
print('Saída: ', troca)