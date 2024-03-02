# inverter string

texto = input('Digite um texto qualquer: ')
inverso = ''

for letra in texto:
    inverso = letra + inverso

print(inverso)

if texto == inverso:
    print('É um palíndromo!')