/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FReni
 */

import java.util.Scanner;
public class HazifeladatE {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[] tippek=new int[7];
        boolean bennevan, ertek1, ertek2;
        int szam;
        int a=0;
                while(a<7){
                
                    System.out.print("Kérem a számot: ");   
                szam=sc.nextInt();
                bennevan=false;
                for(int i=0; i<a; i++){
                    if(szam==tippek[i]){
                        bennevan=true;
                    }
                                    }
                if(bennevan==false && szam>0 && szam<35){
                    tippek[a]=szam;
                    a++;
                }
                }
         int[]lotto=new int[7];
         boolean tartalmazza;
         int ertek;
         int b=0;
         System.out.println();
         System.out.print("A nyerőszámok: ");
         while(b<7){
             ertek=(int)(Math.random()*35)+1;
             tartalmazza=false;
             for(int j=0; j<b; j++){
                 if(ertek==lotto[j]){
                     tartalmazza=true;
                 }
             }
             if(tartalmazza==false){
                 lotto[b]=ertek;
                 b++;
             }
         }
         for(int j=0; j<lotto.length; j++){
         System.out.print(lotto[j]+" ");
         }
    System.out.println();
    int x;
    for(int i=0; i<(tippek.length-1); i++){
        for(int k=i+1; k<tippek.length; k++){
            if(tippek[i]>tippek[k]){
                x=tippek[i];
                tippek[i]=tippek[k];
                tippek[k]=x;
                
            }
        }
    }
    System.out.print("Tippek növekvő sorrendben: ");
    for(int i=0; i<tippek.length; i++){
        System.out.print(tippek[i]+" ");
    }
   System.out.println();
    int index, valtozo;
    for(int j=0; j<(lotto.length-1); j++){
        index=j;
        valtozo=lotto[j];
        for(int l=j+1; l<lotto.length; l++){
            if(valtozo>lotto[l]){
                valtozo=lotto[l];
                index=l;
                
            }
        }
        lotto[index]=lotto[j];
        lotto[j]=valtozo;
    }
    System.out.print("Nyerőszámok növekvő sorrendben: ");
    for(int j=0; j<lotto.length; j++){
        System.out.print(lotto[j]+" ");
    } 
    System.out.println();
    int talalat=0;
    for(int i=0; i<tippek.length; i++){
        for(int j=0; j<lotto.length; j++ ){
            if(tippek[i]==lotto[j]){
                talalat++;
                System.out.println("Találatok: "+lotto[j]);
        }
        }
    }
    System.out.print("Találatok száma: "+talalat);
    System.out.println();
    
    }
                    
           
            }
  
    
