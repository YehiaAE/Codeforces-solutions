#include <iostream>
#include <bits/stdc++.h>
 
using namespace std;
 
int main()
{
    int t;
    int x,y;
    int c=0;
    cin>>t;
    for(int i=0;i<t;i++)
    {
        cin>>x>>y;
        if(y-x>=2)
            c++;
    }
    cout<<c<<endl;
    return 0;
}
