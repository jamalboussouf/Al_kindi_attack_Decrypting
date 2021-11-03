
package com.decryption.jboussouf;

import java.util.Scanner;


public class ComDecryptionJBoussouf {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int cmp=0, ky=0, key=0, m=0;
        char rep=' ', k=' ';
        String txt = " ";
        String alph = "abcdefghijklmnepqrstuvwxyz";
        String fr = "eaisnrtoludcmpgbvhfqyxjkwz";
        String crypted = "Ctot xlm ng etgztzx inkxfxgm hkbxgmx hucxm. Xg xyyxm, ng inkhzktffx Ctot xlm utlx vhfiexmxfxgm lnk exl hucxml. Xqvximx exl mrixl wx whggxxl yhgwtfxmtnq, mhnm xlm hucxm.";
        crypted = crypted.toLowerCase();
        
        //recherche l'alphaber le plus utilisable
        for (int i = 0; i < alph.length(); i++) {
            cmp=0;
            for (int j = 0; j < crypted.length(); j++) {
                if (crypted.charAt(j) == alph.charAt(i)) {
                    cmp++;
                    rep=alph.charAt(i);
                }
            }
            
            if (ky < cmp) {
                ky=cmp;
                k=rep;
            }
        }
        ettiquet:
            for (int j = 0; j < alph.length(); j++) {
                txt = "";
                // calculer le clée
                key = ((int) k - 97 ) - ((int) fr.charAt(j) - 97);
        
        
                //Decrypting using the key
                for (int i = 0; i < crypted.length(); i++) {
                    int r = (int) (crypted.charAt(i));
            
                    if (r>97 && r<123) {
                
                    r -= key;
                    if (r<=96) {
                        r+=26;
                    } else if (r>123) {
                        r-=26;
                    }
                }
                txt += (char) r ;
            }
            System.out.println("[+]. "+txt+"\n\n\n");
        
            System.out.print("[!]. Ci le text est claire taper 1: ");
            m = input.nextInt();
            if (m==1) {
                break ettiquet;
            }
        }
    }
}
