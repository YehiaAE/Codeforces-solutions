#include <iostream>
#include <bits/stdc++.h>
 
using namespace std;
 
int main(){
    int n, m, moves;
    cin >>n>>m;
    moves = min(n,m);
    if(moves%2==0)
        cout << "Malvika" << endl;
    else
        cout << "Akshat" << endl;
    return 0;
}
