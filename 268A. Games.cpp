#include <iostream>
#include <bits/stdc++.h>
 
using namespace std;
 
int main()
{
          int n,arr1[30],arr2[30],i=0,j=0;
          int count=0;
          cin>>n;
          for(i;i<n;i++)
           cin>>arr1[i]>>arr2[i];
 
 
           for(i=0;i<n;i++)
              for(j=0;j<n;j++)
           {
                      if(arr1[i]==arr2[j])
                                 count++;
 
           }
           cout<<count<<endl;
}
