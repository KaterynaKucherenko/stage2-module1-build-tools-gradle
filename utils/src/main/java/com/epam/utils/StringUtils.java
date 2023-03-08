package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
         //here magic will happen
        try{
            return Integer.parseInt(str) >0;}
    catch (Exception e){
        return false;}
    }}

