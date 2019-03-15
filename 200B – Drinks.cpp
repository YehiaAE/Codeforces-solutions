#include <iostream>
#include <bits/stdc++.h>
 
using namespace std;
 
int main()
{
    int t;
    double x,sum=0;
    cin>>t;
    for(int i=0;i<t;i++)
    {
        cin>>x;
        sum+=x;
    }
    cout<<(sum/t)<<endl;
}
