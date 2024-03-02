media = float(input('Digite sau média: '))
frequencia = float(input('Digite a sua frequência: '))

if frequencia < 75:
    print('Reprovado por falta')
elif media < 6:
    print('Reprovado por nota')
else:
    print('Aprovado!')