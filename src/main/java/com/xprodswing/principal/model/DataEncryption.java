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
 * @author 77011-26-10
 */
public class DataEncryption {
    private static String ConvertToHex(byte[] data){
        StringBuffer buf = new StringBuffer(); // La classe StringBuffer est identique en Java à la classe String, sauf qu'elle peut-être modifiée
        for (int i=0; i<data.length; i++){
            int halfbyte=(data[i]>>>4) &  0x0F;  // L'operateur >>> L'opertaur decale les byts vers la droite non signé en Java Il divise l'operande par 4
            int two_halfs = 0;
            do{
                if ((0<=halfbyte)&& (halfbyte<=9)){
                    buf.append((char)('0'+halfbyte)); // Recuperer la sequence de mes caracteres 
                }else{
                    buf.append((char)('a'+(halfbyte-10))); // recupere les lettres b c d e 
                }
                halfbyte = data[i] & 0x0F;
            }
            while(two_halfs++<1);     
        }
        return buf.toString();
    }
    public static String getSHA1(String text) throws NoSuchAlgorithmException, UnsupportedEncodingException{
        MessageDigest md; // La classe MessageDigest va nous fournir aux applications la fonctionnalité d'un algo de resumer un message, exemple le SHA-1 ou SHA-256
        md = MessageDigest.getInstance("SHA-1");
        byte[] shalhash=new byte[40];
        md.update(text.getBytes("iso-8859-1"),0,text.length());
        shalhash = md.digest(); // Termine le calcul  de hashage  en effectuant des opérations finales telles que le remplissages
        return ConvertToHex(shalhash);    
    }
}
