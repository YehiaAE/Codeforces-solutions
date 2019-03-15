#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <bits/stdc++.h>
using namespace std;
 
int main ()
{
    int x,y;
    cin>>x>>y;
    string m;
    int sum;
    int c=0;
    for(int i=0;i<x;i++)
    {
        sum=0;
        cin>>m;
        for(int j=0;j<m.length();j++){
            if(m[j]=='4' || m[j]=='7')
            sum++;
        }
        if(sum<=y)
            c++;
    }
        cout<<c<<endl;
}
