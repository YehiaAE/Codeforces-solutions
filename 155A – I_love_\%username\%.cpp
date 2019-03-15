#include <iostream>
#include <bits/stdc++.h>
 
using namespace std;
 
int main()
{
    int t,min,max;
    int c=0;
    cin>>t;
    int arr[t];
    for(int i=0;i<t;i++)
    {
        cin>>arr[i];
        if(i==0)
        {
        min=arr[i];
        max=arr[i];
        }
        if(arr[i]<min)
        {
            min=arr[i];
            c++;
        }
        if(arr[i]>max)
        {
            max=arr[i];
            c++;
        }
    }
    cout<<c<<endl;
 
    return 0;
}
