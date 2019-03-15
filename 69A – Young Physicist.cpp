#include <iostream>
#include <bits/stdc++.h>
 
using namespace std;
 
int main()
{
          int n;
          int x=0,y=0,z=0;
          int temp;
          cin>>n;
          for(int i=0;i<n;i++)
          {
           cin>>temp;
           x+=temp;
           cin>>temp;
           y+=temp;
           cin>>temp;
           z+=temp;
          }
          if(x==0 && y==0 && z==0)
           cout<<"YES"<<endl;
          else
           cout<<"NO"<<endl;
 
}
