def main():
    # YOUR CODE GOES HERE
    # Please take input and print output to standard input/output (stdin/stdout)
    # E.g. 'input()/raw_input()' for input & 'print' for output
    n = int(input())
    sum,i,temp,con = 0,1,n,0
    if n%2==0:
        con = n/2
    else:
        con = (n/2)+1
    while i<= con:
        if i==temp:
            sum = sum + i
        else:
            sum = sum + i + temp
        i = i + 1
        temp = temp - 1
    print(sum)
    return 0

if __name__ == '__main__':
    main()