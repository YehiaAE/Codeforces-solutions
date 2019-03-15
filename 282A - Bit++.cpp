#include 
#include &lt;bits/stdc++.h&gt;
 
using namespace std;
 
int main()
{
    int x,c=0;
    cin&gt;&gt;x;
    string arr;
    for(int i=0;i&lt;x;i++) { cin&gt;&gt;arr;
        if(arr[0]=='+' || arr[1]=='+')
            c++;
        else if(arr[0]=='-' || arr[1]=='-')
            c--;
    }
    cout&lt;&lt;c&lt;&lt;endl;
    return 0;
}
