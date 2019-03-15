#include <iostream>
#include <bits/stdc++.h>
 
using namespace std;
 
int main()
{
    int levels;
    cin>>levels;
 
    int x,y;
 
    set<int> myset;
 
    for(int i=0;i<2;i++)
    {
        cin>>x;
        for(int j=0;j<x;j++)
        {
            cin>>y;
            myset.insert(y);
        }
    }
    if(myset.size()==levels)
        cout<<"I become the guy."<<endl;
    else
        cout<<"Oh, my keyboard!"<<endl;
}
