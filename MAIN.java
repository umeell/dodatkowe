
class Main {
  public static void main(String[] args) {
    try{
        RSA rsa = new RSA();
        String encryptedMessage = rsa.encrypt("Czesc");
        System.out.println("Encrypted:\n"+encryptedMessage);
        String decrypted = rsa.decrypt(encryptedMessage);  
        System.out.println("Decrypted:\n"+decrypted);    
      }catch (Exception ingored){}
    }
}