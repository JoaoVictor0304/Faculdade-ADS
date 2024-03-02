# Escreva um programa em Python que solicite ao usuário os valores de três contas de
# consumo (p.ex. água, luz e telefone) e o valor de seu salário. Verifique se o salário é
# suficiente para pagar as três contas, caso não seja apresente a mensagem “Salário
# insuficiente!”. Caso seja, apresente o valor que restou do salário após pagar as contas.

agua = float(input('Valor da conta de água: '))
luz = float(input('Valor da conta de luz: '))
telefone = float(input('Valor da conta de telefone: '))
salario = float(input('Valor do seu salário: '))

soma = agua + luz + telefone

if salario < soma:
    print('Salário insuficiente!')
else:
    res = salario - soma
    print('Após pagar todas as contas restou:', res)
