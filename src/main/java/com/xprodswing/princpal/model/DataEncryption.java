/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.xprodswing.princpal.model;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Axel
 */
public class DataEncryption {
    private static String converToHex(byte[] data){
        StringBuffer buf = new StringBuffer(); //La classe StringBuffer en Java est
        //identique à la classe String, sauf qu'elle peut être modifié
        for(int i=0; i<data.length;i++){
            int halfbyte = (data[i]>>>4) & 0x0f; // L'opérateur >>> est un opérateur de décalage de bits
                                                // vers la droite non signé en Java. Il divise l'opérande par 4 à la puissance de l'opérande droit
        int two_halfs = 0;
        
        do{
        if((0<=halfbyte) && (halfbyte <=9)){
        buf.append((char)('0'+halfbyte)); //Récupère la séquence de mes charactères 
        }else {
        buf.append((char)('a'+(halfbyte-10))); //Récupère les lettres : a,b,c,d,e
        }
        halfbyte = data[i]& 0x0F;
        }while(two_halfs++<1);
    }
        return buf.toString();
    }
    
    public static String getSHA1(String text) throws NoSuchAlgorithmException, UnsupportedEncodingException{
        MessageDigest md; //La classe MessageDigest fournit aux applications
        //la fonctionnalité d'un algorithme de résumé de message, exemple SHA-1 ou SHA-256
        md = MessageDigest.getInstance("SHA-1"); //Je prend un aglorihtme 
        byte[]  sha1hash =new byte[40];
        md.update(text.getBytes("iso-8859-1"),0,text.length()); //je convertie mon byte selon la norme "iso-8859-1
        sha1hash = md.digest(); //Termine le calcule de hashage en effectuant des opérations finales 
                                //tel que le remplissage.
                           
       return converToHex(sha1hash);
    }
    
    
}
