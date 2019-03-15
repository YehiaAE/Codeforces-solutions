#include <iostream>
#include <bits/stdc++.h>
 
using namespace std;
 
int main()
{
    int flag=0,minn,maxx,imin=0,imax=0,n,a;
    cin>>n;
    for(int i=0;i<n;i++)
    {
     cin>>a;
     if(i==0)
     {
         minn=a;
         maxx=a;
     }
     else
     {
         if(a>maxx)
         {
             maxx=a;
             imax=i;
         }
 
         if(a<=minn)
         {
             minn=a;
             imin=i;
         }
     }
    }
    if(imin<imax)
        flag=1;
    cout<<n-1-imin+imax-flag<<endl;
}
