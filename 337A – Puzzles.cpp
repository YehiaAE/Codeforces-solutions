#include <iostream>
#include <bits/stdc++.h>
 
using namespace std;
 
int main()
{
            int x,y;
            cin>>x>>y;
            int m[y];
            int arr[y];
 
            for(int i=0;i<y;i++)
            {
                       cin>>arr[i];
            }
            sort(arr,arr+y);
            int k=0;
            for(int i=0;i<y-x+1;i++)
            {
 
               m[k]=arr[x-1+i]-arr[i];
               k++;
            }
            int min = 99999;
            for(int j=0;j<k;j++)
            {
             if(min > m[j])
              min=m[j];
            }
           cout<<min<<endl;
           return 0;
}
