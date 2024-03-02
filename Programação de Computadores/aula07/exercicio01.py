sb = float(input('Digite o seu sálario: '))
ts = int(input('Digite seu tempo de serviço: '))

if sb > 1500:
    if ts <= 3:
        print('Salário com bônus: ', sb+200)
    else:
        print('Salário com bônus: ', sb+300)
else:
    if ts <= 3:
        print('Salário com bônus: ', sb+230)
    elif ts <= 6:
        print('Salário com bônus: ', sb+330)
    else:
        print('Salário com bônus: ', sb+350)