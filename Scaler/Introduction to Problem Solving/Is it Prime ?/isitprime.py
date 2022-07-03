def main():
    # YOUR CODE GOES HERE
    # Please take input and print output to standard input/output (stdin/stdout)
    # E.g. 'input()/raw_input()' for input & 'print' for output
    n = int(input())
    i = 1
    c = 0
    while i*i <= n:
        if n%i==0:
            if i== n/i:
                c = c + 1
            else:
                c = c + 2
        i = i + 1
    if c == 2:
        print("YES")
    else:
        print("NO")

    return 0

if __name__ == '__main__':
    main()