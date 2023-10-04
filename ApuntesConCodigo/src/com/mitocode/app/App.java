package com.mitocode.app;

public class App {

    private String newTex2;// Asigna el valor invertido a newTex2
    private StringBuilder newText = new StringBuilder();

    private void InvertString(String text) {
        String[] arr = text.split("");
        System.out.println(newTex2);

        // Invertir array
        for (int i = arr.length; i > 0; i--) {
            newText.append(arr[i - 1]);
        }
        newTex2 = new StringBuilder(text).reverse().toString();
    }
    // El metodo usado anteriormente se podria decir que es un cortar
    // text.split("") y preparar StringBuilder newText

    /*
     * otro metodo podria ser con el metodo reverse().toString() de la clase
     * StringBuilder
     */

    private void IsCapicua(int number){
        String numberText = String.valueOf(number);
        String reverseNumber = new StringBuilder(numberText).reverse().toString();
        if (numberText.equals(reverseNumber)) {
            System.out.println("Is capicua");
        }else {
            System.out.println("Is not capicua");
        }
    }
    
     public static void main(String[] args) {
        App app = new App();

        app.IsCapicua(5255);
        app.InvertString("Hola");
        System.out.println(app.newText);
        System.out.println("Metodo 2: \n" + app.newTex2);
    }
}
