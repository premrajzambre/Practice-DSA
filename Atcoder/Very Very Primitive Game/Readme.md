A - Very Very Primitive Game  / 
Time Limit: 2 sec / Memory Limit: 1024 MB

Score : 
100
 points

Problem Statement
Takahashi and Aoki will play a game against each other.
Initially, Takahashi and Aoki have 
A
 and 
B
 candies, respectively.
They will alternately do the operation below. Takahashi goes first if 
C
=
0
, and Aoki goes first if 
C
=
1
.

Eat one of the candies he has.
The person who first becomes unable to do the operation loses. Which person will win?

Constraints
All values in input are integers.
0
≤
A
,
B
≤
100
C
∈
{
0
,
1
}
Input
Input is given from Standard Input in the following format:

A
 
B
 
C

Output
If Takahashi will win, print Takahashi; if Aoki will win, print Aoki.

Sample Input 1 
Copy
2 1 0
Sample Output 1 
Copy
Takahashi
Initially, Takahashi and Aoki have 
2
 and 
1
 candy(ies), respectively. The game will proceed as follows:

Takahashi eats his candy.
Aoki eats his candy.
Takahashi eats his candy.
Aoki has no more candies, so Takahashi wins.
Sample Input 2 
2 2 0
Sample Output 2 
Aoki
Sample Input 3 
2 2 1
Sample Output 3 
Takahashi

Ref : https://atcoder.jp/contests/abc190/tasks/abc190_a
Feb6, 2021