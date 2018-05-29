package com.example.dakaku.mybuilderdemo;

import java.util.Arrays;
import java.util.Collections;

public class CountryTest {

    public static void main(String []args) {

        CountryCode[] countryCodes = CountryCode.values();

        Arrays.sort(countryCodes, new CustomComparator());

        boolean hasCountryName= containCountry(countryCodes);
        System.out.println(hasCountryName);
    }

    public static boolean containCountry(CountryCode[] countryCodes){
        for(int i=0;i<countryCodes.length;i++){
            if(countryCodes[i].getName()=="Algeria"){
                return true;
            }

        }
        return false;
    }

}
