#include <iostream>
#include <bits/stdc++.h>
 
using namespace std;
 
int main()
{
   int answers[6];
   int a,b,c;
   cin>>a>>b>>c;
 
   answers[0]=a+b+c;
   answers[1]=a*b*c;
   answers[2]=a*b+c;
   answers[3]=a+b*c;
   answers[4]=a*(b+c);
   answers[5]=(a+b)*c;
   sort(answers,answers+6);
   cout<<answers[5]<<endl;
   return 0;
}
