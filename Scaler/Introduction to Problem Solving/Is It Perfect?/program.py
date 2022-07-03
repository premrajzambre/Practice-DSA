def main():
    # YOUR CODE GOES HERE
    # Please take input and print output to standard input/output (stdin/stdout)
    # E.g. 'input()/raw_input()' for input & 'print' for output
    n = int(input())
    for i in range(n):
        j = int(input())
        i = 1
        ans = 0
        while i*i <= j:
            if(j%i==0):
                ans = ans + i
                if (i != j/i) and ((j/i)!=j):
                    ans = ans + j/i
            i = i + 1
        if ans == j:
            print("YES")
        else:
            print("NO")

    return 0

if __name__ == '__main__':
    main()