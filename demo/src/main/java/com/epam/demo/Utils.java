package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        //magic happens here
        boolean result = true;
        for(String i: args){
     if  (Integer.parseInt(i)>0){
          result = true;}
         else {
             result = false;
         }
     }
        return result;
}}