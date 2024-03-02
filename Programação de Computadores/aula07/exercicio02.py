pa = float(input('Preço atual do produto: '))
vmm = float(input('Venda média mensal: '))

if vmm < 500 and pa < 30:
    pa = pa + pa*0.1 # Atualiza o preço atual
elif vmm >= 500 and vmm < 1200 and pa >= 30 and pa < 80:
    pa = pa + pa*0.15
elif vmm >= 1200 and pa >= 80:
    pa = pa - pa*0.2
    
print('Valor do produto: ', pa)
        