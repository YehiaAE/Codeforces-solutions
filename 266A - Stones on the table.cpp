#include <bits/stdc++.h>
#include <iostream>
 
using namespace std;
 
int main()
{
    char a,b;
    int cnt=0;
    int x;
    cin>>x;
    cin>>a;
    for(int i=1;i<x;i++)
    {
       cin>>b;
       if(b==a)
       {
        cnt++;
       }
       else
        a=b;
    }
    cout<<cnt<<endl;
}
