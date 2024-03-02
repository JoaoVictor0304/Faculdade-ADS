# Um comerciante calcula o valor da venda, tendo em vista a tabela a seguir:
# Valor de compra                   Valor de venda
# valor < R$10,00                   lucro de 70%
# R$ 10,00 >= valor < R$ 30,00      lucro de 50%
# R$ 30,00 >= valor < R$ 50,00      lucro de 40%
# valor >= R$50,00                  lucro de 30%
# Crie uma programa que permita digitar o nome do produto e valor da compra, e
# imprimindo o nome do produto e o valor da venda.

produto = input('Nome do produto: ')
compra = float(input('Valor de compra do produto: '))

if compra < 10:
    total = compra+(compra*0.7)
    print('Preço de venda do', produto, 'é', total)
elif compra >= 10 and compra < 30:
    total = compra+(compra*0.5)
    print('Preço de venda do', produto, 'é', total)
elif compra >= 30 and compra < 50:
    total = compra+(compra*0.4)
    print('Preço de venda do', produto, 'é', total)
elif compra >= 50:
    total = compra+(compra*0.3)
    print('Preço de venda do', produto, 'é', total)