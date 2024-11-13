from random import randint

"""masivs = [[0.0,0.0,0.0,0.0],[0.0,0.0,0.0,0.0],[0.0,0.0,0.0,0.0],[0.0,0.0,0.0,0.0],[0.0,0.0,0.0,0.0]]
viens = 1
for x in range(len(masivs)):
    for y in range(len(masivs[x])):
        masivs[x][y] = randint(0,20)
        print(f'{masivs[x][y]:5.1f}', end='')
    print()

print()




for x in range(len(masivs)):
    for apakšējais in range(len(masivs[x])):
        masivs[x][apakšējais] /= 2
        print(f'{masivs[x][apakšējais]: 5.1f}',end='')
    print()
"""



'''rindas = int(input("ievadi rindu skaitu "))
kolonnas = int(input("ieviadi kolonnu skaitu: "))

masivs = [[0 for kolonnas in range(kolonnas)]for rindas in range(rindas)]
for x in range(rindas):
    for y in range(kolonnas):
        
        masivs[x][y] = randint(0,100)


for x in range(rindas):
    for y in range(kolonnas):
        print(f'{masivs[x][y]:3}',end='')
    print()

'''


masivs = [[int(input()) for x in range(3)] for y in range(2)]


for y in range(len(masivs[y])):
    summa = 0
    for x in range(len(masivs)):
        summa = masivs[x][0] + summa
    print(f'{y+1}. dienā: {summa/4 :4} km')
    



