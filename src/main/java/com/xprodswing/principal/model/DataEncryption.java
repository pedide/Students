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
 * @author Najat
 */

public class DataEncryption {
    private static String convertToHex(byte[]data){
       
        StringBuffer buf = new StringBuffer(); //Créer une chaîne de caractères modifiables
        //identique à la classe String sauf qu'elle peut être modifiée
        for(int i = 0; i<data.length;i++){
            int halfbyte = (data[i]>>>4) & 0x0F; //l'opérateur >>> est un opérateur de décaLage de  byte vers la droite sans tenir compte du signe en java. Il divise l'opérante par 4 à la puissance de l'opérande droit
            
            int two_halfs = 0;
            
            do{
                if((0<=halfbyte) && (halfbyte <=9)){
                    buf.append((char)('0'+halfbyte));// séquence je réupère la séquence de mes caractères
                                   
                }else{
                    
                buf.append((char)('a'+(halfbyte-10)));//je récupère les lettres : a,b,c,d,e
                }
                halfbyte = data[i] &0x0F;
                }while(two_halfs++<1);
            }
                return buf.toString();
    }
    //on rappelle ce qu'on a converti
    public static String getSha1(String text) throws NoSuchAlgorithmException, UnsupportedEncodingException{
       MessageDigest md;//La classe MessageDigest va fournir aux applications
        //la fonctionnalité d'un alorithme de résumé de message, exemple SHA-1 ou le SHA-256
       md = MessageDigest.getInstance("SHA-1"); //Je prends un alorithme
       byte[]sha1hash = new byte[40];
       md.update(text.getBytes("iso-8859-1"),0,text.length());
     
       sha1hash = md.digest();//He termine le calcul de hashage en effectuant des opérations finales telles que le remplissage.
       
       return convertToHex(sha1hash);
        
    }
}
    

