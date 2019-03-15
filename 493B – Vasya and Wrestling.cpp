
#include <iostream>
#include <bits/stdc++.h>
 
using namespace std;
 
int main()
{
    int t;
    cin>>t;
    int compare;
    int arr[t];
 
    vector<int> temp1;
    vector<int> temp2;
 
    long long sum1=0;
    long long sum2=0;
 
    for(int i=0;i<t;i++)
    {
        cin>>arr[i];
        compare=arr[t-1];
        if(arr[i]>0)
        {
            sum1+=arr[i];
            temp1.push_back(arr[i]);
        }
        else if(arr[i]<0)
        {
            sum2+=abs(arr[i]);
            temp2.push_back(abs(arr[i]));
        }
    }
    if(sum1>sum2)
    {
        cout<<"first"<<endl;
        return 0;
    }
    else if(sum2>sum1)
    {
        cout<<"second"<<endl;
        return 0;
    }
    else
    {
        for(int i=0;i<min(temp1.size(),temp2.size());i++)
        {
            if(temp1[i]>temp2[i])
            {
                cout<<"first"<<endl;
                return 0;
            }
            else if(temp2[i]>temp1[i])
            {
                cout<<"second"<<endl;
                return 0;
            }
        }
    }
 
    if(temp1.size()>temp2.size())
    {
        cout<<"first"<<endl;
        return 0;
    }
    else if(temp2.size()>temp1.size())
    {
        cout<<"second"<<endl;
        return 0;
    }
 
     if(sum1==sum2 && compare>0)
        cout<<"first"<<endl;
    else if (sum1==sum2 && compare<0)
        cout<<"second"<<endl;
 
        return 0;
 
}
