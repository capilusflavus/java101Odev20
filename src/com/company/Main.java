package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n ,nFaktoriyel=1,r, rFaktoriyel=1, nrFaktoriyel=1, i ;
        System.out.print("Bir n sayısı giriniz : ");
        n=scanner.nextInt();
        System.out.print("Bir r sayısı giriniz : ");
        r= scanner.nextInt();
        for (i =1; i<=n; i++){
            nFaktoriyel= nFaktoriyel * i;
        }
        System.out.println("Girdiğniz n faktöriyelinin değeri : " +nFaktoriyel);
        for (i=1 ; i<=r; i++){
            rFaktoriyel=rFaktoriyel*i;

        }
        System.out.println("Girdiğniz r faktöriyelinin değeri : " +rFaktoriyel);
        for (i=1 ; i<=(n-r); i++){
            nrFaktoriyel=nrFaktoriyel*i;
        }
        System.out.println("Girdiğniz n-r faktöriyelinin değeri : " +nrFaktoriyel);
        double total =(nFaktoriyel/(rFaktoriyel*nrFaktoriyel));
        System.out.print("C(n,r)=n!/(r!*(n-r)!) formül sonucunuz : " + total);

    }
}