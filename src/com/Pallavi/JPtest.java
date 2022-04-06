package com.Pallavi;
import java.util.*;
public class JPtest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int r=1;
        sc.nextLine();
        for(int i=0; i<a; i++){
            String I = sc.nextLine();
            String P = sc.nextLine();
            if(checkCon(I, P)>0){
                System.out.println("Case #"+r+": "+checkCon(I, P));
            }

            else  System.out.println("Case #"+r+": IMPOSSIBLE");
            r++;
        }

    }


    public static int checkCon(String I, String P){

        ArrayList<Character> str1 = new ArrayList<>();
        ArrayList<Character> str2 = new ArrayList<>();

        for (int i = 0; i < I.length(); i++) {
            str1.add(I.charAt(i));
        }
        for (int i = 0; i < P.length(); i++) {
            str2.add(P.charAt(i));
        }
        int b=str1.size();
        int c=str2.size();
        int count=0;
        int valu=Math.abs(b-c);
        for(int i=0; i<str1.size()-1; i++){
                if(str1.get(i)!=str2.get(i)){
                    str2.remove(i);
                    count++;
//                }
            }
        }
        if(count==0){
            return valu;
        }
        else if(str1.equals(str2)){
            return count;

        }
        else{
            return -1;
        }
    }
}

