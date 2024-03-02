total = float(input('Digite o valor total da compra: '))
parc = int(input('Digite o número de parcelas: '))

# if parc == 2:
#     res = (total+(total*0.03))/2
#     print('O valor da parcela ficaria: ', res)
# elif parc == 4:
#     res = (total+(total*0.07))/4
#     print('O valor da parcela ficaria: ', res)
# elif parc == 6:
#     res = (total+(total*0.09))/6
#     print('O valor da parcela ficaria: ', res)
# elif parc == 8:
#     res = (total+(total*0.12))/8
#     print('O valor da parcela ficaria: ', res)
# else:
#     print('Digite um valor de parcela válido!')

juros = -1

if parc == 2:
    juros == 3
elif parc == 4:
    juros == 7
elif parc == 6:
    juros == 9
elif parc == 8:
    juros == 12


if juros != -1:
    total = total+(total*juros/100)/parc
    print('Valor da parcela com juros: %.2f' %total)
else:
    print('Digite um valor válido!')