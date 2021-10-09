package com.fintuple.admin.common.utilities;




import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.util.Base64;


public class AESEncryption {

    private String aesKey = System.getenv("AES_KEY");

    public String aesEncrypt(String toEncrypt) throws Exception {

        Key key = generateKey(aesKey);
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encVal = cipher.doFinal(toEncrypt.getBytes());
        String encryptedValue = Base64.getEncoder().encodeToString(encVal);
        return encryptedValue;
    }

    public String aesDecrypt(String strToDecrypt) {
        try {
            Key key = generateKey(aesKey);
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, key);
            return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));
        } catch (Exception e) {
            System.out.println("Error while decrypting: " + e.toString());
        }
        return null;
    }

    private Key generateKey(String secret) throws Exception {
        byte[] decoded = Base64.getDecoder().decode(secret.getBytes());
        Key key = new SecretKeySpec(decoded, "AES");
        return key;
    }

    public String decodeKey(String str) {
        byte[] decoded = Base64.getDecoder().decode(str.getBytes());
        return new String(decoded);
    }

    public String encodeKey(String str) {
        byte[] encoded = Base64.getEncoder().encode(str.getBytes());
        return new String(encoded);
    }
}

