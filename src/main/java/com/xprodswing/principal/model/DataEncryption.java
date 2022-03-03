/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.xprodswing.principal.model;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author ahaha
 */
public class DataEncryption {
  private static String ConvertToHex(byte[] data){
    StringBuffer buf = new StringBuffer(); //La classe StringBuffer en jave est une chaine de caractère modifiable
    for(int i=0;i<data.length;i++){
     int halfbyte = (data[i]>>>4) & 0x0F;
     int two_halfs = 0;
     
     do{
       if((0<=halfbyte) && (halfbyte<=9)){
          buf.append((char)('0'+halfbyte));
       } else{
          buf.append((char)('a'+(halfbyte-10)));
       }
     
     halfbyte = data[i] & 0x0F; 
    }while(two_halfs++<i);
    }
    return buf.toString();
  }

  public static String getSHA1(String text) throws NoSuchAlgorithmException, UnsupportedEncodingException{
      MessageDigest md; //La classe MessageDigest fournit aux applications
      // La fonctionnalité d'un algorithme de résumer de message, exmeple: SHA-1 SHA-256
      md = MessageDigest.getInstance("SHA-1");
      byte[] sha1hash = new byte [40];
      md.update(text.getBytes("iso-8859-1"),0,text.length());
      sha1hash = md.digest();
      return ConvertToHex(sha1hash);

  
  }

}
