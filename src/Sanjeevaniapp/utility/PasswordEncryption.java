/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sanjeevaniapp.utility;

import java.util.Base64;

public class PasswordEncryption {
    public static String getEncryptedPassword(String pwd) {
        Base64.Encoder en =Base64.getEncoder();
       
        byte []arr=pwd.getBytes();
        String encPwd =en.encodeToString(arr);
        System.out.println("Original String is:"+pwd);
        System.out.println("Encrypyed String is:"+encPwd);
        return encPwd;
    }
}
