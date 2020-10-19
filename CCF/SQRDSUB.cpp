// https://www.codechef.com/APRIL20B/problems/SQRDSUB/

/*
   H1s3nb3rg Here !
   
   <EAT><SLEEP><CODE><REPEAT>
*/
#include <iostream>
#include <vector>
#include <string>
#include <unordered_map>
#include <algorithm>
#include <climits>
#include <iomanip>
#include <numeric>
#include <queue>
#include <math.h>
#include <map>
#include <unordered_set>
#include <set>
#include <bitset>
#include <bits/stdc++.h> 
using namespace std;
struct hash_pair {
	template <class T1, class T2>
	size_t operator()(const pair<T1, T2>& p) const
	{
		auto hash1 = hash<T1>{}(p.first);
		auto hash2 = hash<T2>{}(p.second);
		return hash1 ^ hash2;
	}
};
#define FAST_IO ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
typedef long long ll;
#define GET_SET_BITS(a) (__builtin_popcount(a))
#define GET_SET_BITSLL(a) ( __builtin_popcountll(a))
#define GET_TRAIL_ZERO(a) (__builtin_ctz(a))
#define GET_LEAD_ZERO(a) (__builtin_clz(a))
#define GET_PARITY(a) (__builtin_parity(a))
#define ff first
#define ss second 
#define pp pair
#define ULRED 1000000007
#define MS(x,y) (x-y>0?x-y:y-x) 
#define MX(x,y) x>y?x:y
#define MN(x,y) x>y?y:x
#define MXPTR2(a,b,x,y) (x>y?a:b)
#define MXPTR3(a,b,c,x,y,z) (x>y?(x>z?a:c):(y>z?b:c))
#define MX3(a,b,c) (a>b?(a>c?a:c):(b>c?b:c))
#define AEQ(a,b,c) (a==b?1:(a==c?3:(c==b?2:-1)))
#define ENDL "\n"
#define VALL(a) a.begin(),a.end()
#define AALL(a,n) a,a+n
#define vll vector<ll>
#define vcc vector<char>
#define MP(a,b) make_pair(a,b)

/*------------------------------------------------------------------*/

int main(){
    FAST_IO;
    ll tc;
    cin>>tc;
    while(tc--)
    {
        ll n;
        cin>>n;
        vll v(n,0);
        vll ev;
        for(ll i=0;i<n;i++)
        {
            cin>>v[i];
            if(v[i]%2==0)
                ev.push_back(i);
        }
        ll ans=0;
        for(ll i=0;i<n;i++){
            if(v[i]%2!=0){
                if(ev.size()==0)
                {
                    ans+=(n*(n+1))/2;
                    break;
                }
                else{
                    auto p=upper_bound(ev.begin(),ev.end(),i);
                    if(p!=ev.end()&& *p>i){
                        ans+=(*p-i);
                        if(v[*p]%4==0){
                            ans+=(n-*p);
                           // cout<<"ODDSK "<<*p<<" "<<v[*p]<<" "<<ans<<endl;
                            continue;
                        }
                        ll pos=p-ev.begin();
                        if(pos+1<ev.size()){
                            ans+=(n-ev[pos+1]);
                        }
                        continue;
                    }
                    else{
                        ans+=((n-i)*(n-i+1))/2;
                        break;
                    }
                }
                //cout<<"ODD "<<ans<<endl;
            }
            else if(v[i]%4==0){
                ans+=(n-i);
             //  cout<<"EV4 "<<ans<<ENDL;
            }
            else{
                auto p=upper_bound(ev.begin(),ev.end(),i);
                if(p!=ev.end() && *p>i)
                    ans+=(n-*p);
              // cout<<"EV "<<ans<<endl;
            }
        }
        cout<<ans<<ENDL;
    }
    return 0;
}
