/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validadorcontrasenas;

/**
 *
 * @author hesca
 */
public class PasswordValidator {

    public boolean longitudMinima(String password) {
        return password.length() >= 8;
    }

    public boolean caracteresEspeciales(String password) {
        String carEspeciales = "!@#$%^&*()_+{}|:<>?-=[]\\;',./`~";
        for (int i = 0; i < password.length(); i++) {
            if (carEspeciales.contains(Character.toString(password.charAt(i)))) {
                return true;
            }
        }
        return false;
    }
    
    public boolean mayusculas(String password){
        String mayus = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        for (int i = 0; i < password.length(); i++) {
            if (mayus.contains(Character.toString(password.charAt(i)))) {
                return true;
            }
        }
        return false;
    }

    public boolean minusculas(String password){
        String minus = "abcdefghijklmnñopqrstuvwxyz";
        for (int i = 0; i < password.length(); i++) {
            if (minus.contains(Character.toString(password.charAt(i)))) {
                return true;
            }
        }
        return false;
    }

}
