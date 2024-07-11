public class Cifra {
    public static final String alfabeto = "abcdefghijklmnopqrstuvwxyz";
    public static String encrypt(String message, int key) {
        String string_encryptada = "";
        for (int i = 0; i < message.length(); i++){
            int pos1 = alfabeto.indexOf(message.charAt(i));
            int pos_encriptada = (pos1 + key) % 26;
            char char_encriptado = alfabeto.charAt(pos_encriptada);
            string_encryptada += char_encriptado;
        }
        return string_encryptada;
    }

    public static String decrypt(String message, int key) {
        String string_decryptada = "";
        for (int i = 0; i < message.length(); i++){
            int pos2 = alfabeto.indexOf(message.charAt(i));
            int pos_decriptada = (pos2 - key + 26) % 26;
            if (pos_decriptada < 0){
                pos_decriptada = pos_decriptada + 26;
            }
            System.out.println(pos_decriptada);
            char char_decriptado = alfabeto.charAt(pos_decriptada);
            string_decryptada += char_decriptado;
        }
        return string_decryptada;
    }
    
    public static void main(String[] args) {
        System.out.println(encrypt("bqqmf", 1));
        System.out.println(decrypt("bqqmf", 1));
    }
    
}
