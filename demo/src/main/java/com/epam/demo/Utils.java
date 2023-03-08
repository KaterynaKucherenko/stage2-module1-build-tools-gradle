package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        //magic happens here
        boolean result = true;
        try{  for(String i: args){
      if  (Float.parseFloat(i)>0){
          result = true;}
         else {
             result = false;
         }
     }}
     catch (Exception e){
         result = false;
            }
        return result;
}}