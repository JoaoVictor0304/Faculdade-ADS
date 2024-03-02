# soma de 10 números reais digitados pelo usuário

# acumulador
soma = 0

for i in range(10):
    num = float(input('Digite um valor: '))
    # acumula o valor
    soma = soma + num

print('A somatória é: ', soma)