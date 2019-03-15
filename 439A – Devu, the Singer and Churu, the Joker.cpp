#include <iostream>
#include <bits/stdc++.h>
 
using namespace std;
 
int main()
{
   int x,y,songs,sum=0;
   cin>>x>>y;
   for(int i=0;i<x;i++)
    {
        cin>>songs;
        sum+=songs;
    }
    if(sum+(x-1)*10>y)
    {
        cout<<-1<<endl;
        return 0;
    }
    else
    {
        cout<<(y-sum)/5<<endl;
    }
 
}
