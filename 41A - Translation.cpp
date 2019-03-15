#include <iostream>
#include <bits/stdc++.h>
 
using namespace std;
 
 
int main()
{
    char a[105],b[105],temp[105];
    gets(a);
    gets(b);
    int j=0;
    int l1=strlen(a);
    int l2=strlen(b);
    for(int i=l2-1;i>=0;i--,j++)
    {
        temp[j]=b[i];
    }
    int flag=1;
    for(int m=0;m<l2&&m<l1;m++)
    {
        if(a[m]!=temp[m])
        {
            flag=0;
            break;
        }
    }
    if(flag)
        cout<<"YES"<<endl;
    else
        cout<<"NO"<<endl;
}


// ANOTHER SOLUTION


#include <iostream>
#include <algorithm>
 
using namespace std;
 
int main() {
    string s1, s2;
    cin >> s1 >> s2;
    reverse(s1.begin(),s1.end());
    if(s1==s2)
        cout <<"YES\n";
    else
        cout <<"NO\n";
    return 0;
}
}
