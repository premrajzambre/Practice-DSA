#include <iostream>
using namespace std;

int main()
{
    int A,B,C;
    cin>>A>>B>>C;
  
    if(C==0)
    {
        if(A>B)
            cout<<"Takahashi";
        else if(A<=B)
            cout<<"Aoki";
    }
    else{
        if(A>=B)
        {
            cout<<"Takahashi";
        }
        else
            cout<<"Aoki";
    }
    return 0;
}