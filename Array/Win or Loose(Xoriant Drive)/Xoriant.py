T = int(input())
Villains_list = []
while(T != 0):
    T = T - 1
    result = 0
    N = int(input())
    Villains_list = list(map(int, input().split()))     
    Player_list = list(map(int, input().split()))
    Villains_list.sort(reverse = True)
    Player_list.sort(reverse = True)
    length = len(Player_list)
    i = 0
    while(i < length-1):                
        if(Player_list[i] < Villains_list[i]):
            result = 121
        i = i + 1
        
    if(result != 0):
        print("LOSE")
    else:
        print("WIN")    