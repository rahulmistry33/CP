//  https://www.codechef.com/APRIL20B/problems/REBIT/

/*
    ..Hold on Stan.. 
    H1s3nb3rg's Here !!
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

ll mpow(ll a,ll b,ll m){
    if(b==0)
        return 1;
    ll p=mpow(a,floor(b/2),m)%m;
    p=(p*p)%m;
    if(b%2==0)
        return p;
    else
        return((a*p)%m);
}

ll modInv(ll a){
    return mpow(2,2*a*(998244353 - 2), 998244353);
}

vll calcPerm(vector<vector<string>> &conmap,vll &map1,vll &map2)
{   ll mod=998244353;
    vll ans(4,0);   
    for(ll i=0;i<4;i++){
        for(ll j=0;j<conmap[i].size();j++){
            ans[i]=(ans[i]+(map1[conmap[i][j][0]-'0'] * map2[conmap[i][j][1]-'0']))% mod;
        }
    }
    return ans;
}



vll acon={9, 1, 3, 3};
vll ocon={1, 9, 3, 3};
vll xcon={4, 4, 4, 4};
vector<vector<string>> oconmap={{"00"}, {"11", "10", "12", "13", "01", "21", "23", "31", "32"}, {"02", "20","22"}, {"03", "30", "33"}};
vector<vector<string>> aconmap={{"10", "01", "00", "02", "03", "20", "23", "30", "32"}, {"11"}, {"12", "21","22"}, {"31", "13", "33"}};
vector<vector<string>> xconmap={{"11", "00", "22", "33"}, {"10", "01", "23", "32"}, {"13", "02", "20", "31"},{"12", "03", "21", "30"}};

void solveFor(char ch,vcc &stack1,vector<vector<ll>> &stack2){
    //cout<<"GOT solve: "<<ch<<endl;
    vector<vector<string>> map;
    vll ep;
    switch(ch){
        case '|':
            map=oconmap;
            ep=ocon;
            break;
        case '&':
            map=aconmap;
            ep=acon;
            break;
        case '^':
            map=xconmap;
            ep=xcon;
            break;
    }
    vll ept(4,1);
    if(stack2[stack2.size()-1].size()==1){
        if(stack2[stack2.size()-2].size()==1){
            // # | #
            stack2.pop_back();
            stack2.pop_back();
            stack2.push_back(ep);
        }
        else{ 
            // vals | #
            vll ak;
            ak=calcPerm(map,stack2[stack2.size()-2],ept);
            stack2.pop_back();
            stack2.pop_back();
            stack2.push_back(ak);
        }
    }
    else{
        if(stack2[stack2.size()-2].size()==1){
            //  # | opd
            vll ak;
            ak=calcPerm(map,ept,stack2[stack2.size()-1]);
            stack2.pop_back();
            stack2.pop_back();
            stack2.push_back(ak);                                   
        }
        else{
            // val | val
            vll ak;
            ak=calcPerm(map,stack2[stack2.size()-2],stack2[stack2.size()-1]);
            stack2.pop_back();
            stack2.pop_back();
            stack2.push_back(ak);  
        }
    }
}

int main(){
    FAST_IO;
    ll tc;
    cin>>tc;
    ll mod=998244353;
    while(tc--){
        ll chz=0;
        vcc stack1;
        vector<vector<ll>> stack2;
        string s;
        cin>>s;
        if(s[0]=='#'){
            cout<<748683265<<" "<<748683265<<" "<<748683265<<" "<<748683265<<ENDL;
            continue;
        }
        for(ll i=0;i<s.length();i++){
            if(s[i]=='('){
                stack1.push_back(s[i]);
            }
            else if(s[i]=='#'){
                stack2.push_back({-1});
                chz++;
            }
            else if(s[i]==')'){
                while(stack1.size()!=0){
                    if(stack1[stack1.size()-1]=='('){
                        stack1.pop_back();
                        break;
                    }
                    else{
                       solveFor(stack1[stack1.size()-1],stack1,stack2);
                       stack1.pop_back();
                    }
                }
            }
            else{
                stack1.push_back(s[i]);
            }
        }

        ll inv=modInv(chz);
        for(auto i:stack2[0])
            cout<<(i*inv)%mod<<" ";
        cout<<ENDL;
    }
    return 0;
}
