#include <iostream>
#include <bits/stdc++.h>
 
using namespace std;
 
int main()
{
    int t;
    cin>>t;
 
    string s1,s2,last;
 
    vector<string> rat,women,men;
 
    for(int i=0;i<t;i++)
    {
        cin>>s1>>s2;
        if(s2=="rat")
            rat.push_back(s1);
        else if(s2=="woman" || s2=="child")
            women.push_back(s1);
        else if(s2=="man")
            men.push_back(s1);
        else
            last=s1;
    }
    for(int j=0;j<rat.size();j++)
        cout<<rat[j]<<endl;
    for(int m=0;m<women.size();m++)
        cout<<women[m]<<endl;
    for(int k=0;k<men.size();k++)
        cout<<men[k]<<endl;
 
    cout<<last<<endl;
 
 
    return 0;
 
}
