
#include <iostream>
#include <bits/stdc++.h>
 
using namespace std;
 
int main()
{
    set<char> myset;
 
    string s;
    getline(cin,s);
 
    for(int i=0;i<s.size();i++)
    {
        if(s[i]>=97 && s[i]<=122)
        {
            myset.insert(s[i]);
        }
    }
    cout<<myset.size()<<endl;
}
