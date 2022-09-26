package com.leet.neat;

public class NumberStringGeek {
    public int minLength(String s, int n) {
        // code here

        char[] m=s.toCharArray();
        String a="";
        int first=0;
        int second=1;
        while(first<=n-2){
            if(m[first]==m[second]-1 ||m[first]==m[second]+1 ) {
                first=first+2;
                second=second+2;
            }else{
                a=a+m[first];
            }
        }

        if(n-first==1){
            return a.length()+1;
        }
        return a.length();
    }

    public static void main(String[] args) {
        NumberStringGeek numberStringGeek=new NumberStringGeek();
        numberStringGeek.minLength("12213",5);
    }
}
