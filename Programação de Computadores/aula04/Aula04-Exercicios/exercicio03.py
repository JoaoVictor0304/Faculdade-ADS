#Escreva um programa em Python que solicite ao usuário a distância entre duas cidades e o tempo de viagem. O programa deverá calcular e exibir a velocidade média de um carro que vai de uma cidade para outra. Utilize a fórmula: um = distancia/tempo

distancia = int(input('Digite a distancia entre duas cidades: '))
tempo = int(input('Digite o tempo de viagem que levou para chegar de uma cidade a outra: '))

vm = distancia/tempo

print('A velocidade média do carro para percorrer esse trajeto é de:',vm ,'km/h')