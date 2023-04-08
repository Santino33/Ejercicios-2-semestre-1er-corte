package model;

import java.util.Random;

public class Student {

    //Atributos
        private String name;
        private int id;


    //Constructores




    public Student() {
    }


    //Geters y Setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Metodos ordinarios

    public String powTable( int num, int ini, int stop){
        String output = "";
        num = 6;
        ini = 3;
        stop = 7;

        for (int i = ini; i<= stop; i++){
            output = output + num + "*" + i + "=" +(num*i )+'\n';
        }

        return output;
    }

    public int cantidadVocales(String texto){
        int cont = 0;
        texto = texto.toUpperCase();

        for (int i = 0; i < texto.length(); i++){

            if(texto.charAt(i)=='A' || texto.charAt(i)=='E' || texto.charAt(i)=='I' || texto.charAt(i)=='O' || texto.charAt(i)=='U'){
                cont ++;
            }
        }
        return cont;
    }

    public boolean numeroPrimo(int numero){
        int counter = 0;
        boolean prime = true;
        for (int i = 2; i < numero ; i++){
            if(numero%i == 0){
                counter++;
            }
        }
        System.out.println(counter);
        if(counter >= 1){
            prime = false;
        }
    return prime;
    }

    public String convertirMinusculas(String textoMinusculas){
        String textoMayusculas = "";

        for(int i=0; i<textoMinusculas.length(); i++) {
            char letraMinusculas = textoMinusculas.charAt(i);
            int codigoLetraMinusculas = letraMinusculas;

            if(codigoLetraMinusculas >= 97 && codigoLetraMinusculas <= 122)  {
                codigoLetraMinusculas -= 32;
            }
            if(codigoLetraMinusculas ==  241){
                codigoLetraMinusculas -= 32;
            }

            char letraMayusculas = (char)codigoLetraMinusculas;
            textoMayusculas = textoMayusculas + letraMayusculas;
        }
        return textoMayusculas;
    }

    public boolean multiplo(int a, int b){
        boolean resultado = false;
        if(a%b == 0){
            resultado = true;
        }
        return resultado;
    }

    public int cifras(int numero){
        int counter = 0;
        while(numero>=1){
            numero = numero/10;
            counter++;
        }
        return counter;
    }

    public int[] calcularFibonacci(){
        int[] numerosFibonacci = new int[10];
        int primero = 0;
        int resultado = 0;
        int segundo = 1;

        for(int i = 0; i<10; i++){
            resultado =  resultado + primero;
            primero = segundo;
            segundo = resultado;
            numerosFibonacci[i]= resultado;
        }
        return numerosFibonacci;
    }

    public int potencia(int base, int x){
        int res = base;
        int n = base;
        if(x == 1){
            res = base;
        }
        if (x == 0) {
            res = 1;
        } else {
            for (int i = 1; i < x; i++) {
                res = res* base;

            }
        }
        return res;

    }

    public float potencia(float base, int x){
        float res = 0;
        if(x == 1){
            res = base;
        }
        if (x == 0) {
            res = 1;
        } else {
            for (int i = 1; i < x; i++) {
                res += base * base;
            }
        }
        return res;

    }

    public long calcularFactorial(int numero){
        long res = 0;
        for(int i = numero-1; i > 0; i--){
            numero *= i;
            res = numero;
        }
        return res;
    }
    
    public String reversar(String mensaje){
        String reverso = "";
        char c;
        for(int i = mensaje.length()-1; i==0; i--){
            c = mensaje.charAt(mensaje.length()-i);
            reverso +=  c;
        }
        return reverso;
    }


    public String reverseString(String word) {
        String reverse = "";
        for (int i = word.length()-1; i >= 0; i--) reverse += word.charAt(i);
        return reverse;
    }

    public double toRadians(double degrees){
        double rads = (degrees*Math.PI/2)/90;
        return rads;
    }

    public static double calcularRaizCuadrada(double num) {
        double raiz = 1;
        double incremento = 0.00001;
        while (true) {
            if (raiz * raiz > num) {
                raiz = raiz - incremento;
                break;
            }
            raiz = raiz + incremento;
        }
        return raiz;
    }

    public int charToInt(char character){
        int numberInt =0;
        numberInt = numberInt*10 + character-'0';
        return numberInt;
    }

    //Metodo para comprobar si un numero es magico

    public boolean magicNumber(int number){
        boolean isMagic = false;
        int sumatory = 0;
        char n;
        int temporalNumber;
        String numberString = ""+number;
        for(int i = 0; i<numberString.length();i++){
            n =numberString.charAt(i);
            temporalNumber = charToInt(n);
            temporalNumber = potencia(temporalNumber, 3);
            sumatory += temporalNumber;
        }
        if(sumatory == number) isMagic = true;
        return isMagic;
    }

    //metodo para convertir un String a un double
    public double stringToDouble(String numberString){
        double numberDouble = 0;
        boolean negative;

        for(int i = 1; i < numberString.length(); i++){
            char digit = numberString.charAt(i);
                numberDouble = numberDouble*10 + digit-'0';
                System.out.println(numberDouble);
        }
        if(numberString.charAt(0) == 45){
            numberDouble = numberDouble * -1;
        }
        return numberDouble;
    }



    /*
    public double mySin(int degrees, int n){
        double sin = 0;
        double rads = toRadians(degrees);
        for(int i=0; i<n; i++){
            sin += potencia(-1, i)*potencia(rads, 2*i+1)/ calcularFactorial(2*i+1);
        }
        return sin;
    }

    public double mySin(int degrees){
        double sin=0;
        double rads = toRadians(degrees);
        for(int i=0; i<10; i++){
            sin +=potencia(-1, i)*potencia(rads, 2*i+1)/calcularFactorial(2*i+1);
        }
        return sin;
    }
     */

    /*
    public double mySin (double angle, int num) {
        double serie = 0;
        for (int i = 0; i < num; i++) {
            serie += (potencia(-1, i) * potencia(toRadians(angle), 2 * i + 1) / factorialNumber(2 * i + 1));
        }
        return serie;
    }

     */
    public String decimalToBinary(int decNumber){
        String binario= "";
        int resto = 0;
        while(decNumber > 0){
            resto = decNumber%2;
            //System.out.println(resto);
            binario = resto + binario  ;
            decNumber /= 2;
        }
        return binario;
    }

    public String decimalToHex(int decNumber){
        String characters = "0123456789abcdef";
        String hexNumber = "";
        int digit = 0;

        while(decNumber > 0){
            digit = decNumber%16;
            System.out.println(digit);
            hexNumber = characters.charAt(digit) + hexNumber;
            System.out.println(hexNumber);
            decNumber /= 16;

        }

        return hexNumber;
    }

    public String toAnyBase(int number, int base) {
        String response = "";
        char hexadecimal[] = { 'A', 'B', 'C', 'D', 'E', 'F' };
        int i = 0;
        int module;
        while (number > 0) {
            module = number % base;
            if (module >= 10) {
                response = hexadecimal[module - 10] + response;
            } else {
                response = module + response;
            }
            number = number / base;
            i++;
        }
        return response;
    }

    public int getRandomNumber(int limInferior, int limSuperior){
        Random random = new Random();
        return random.nextInt(limSuperior - limInferior +1) + limInferior;
    }

    public int numberStringtoInt(String numberString){
        int numberInt = 0;

        for(int i = 0; i < numberString.length();i++){
            numberInt = numberInt*10 + numberString.charAt(i)-'0';
        }
        return numberInt;
    }




    public int getCharactersRepited(String text, char letter) {
        int repited = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == letter) repited++;
        }
        return repited;
    }

    public String removeSpaces(String text){
        String noSpacesText = "";

        for (int i = 0; i < text.length(); i++){
            while(text.charAt(i) == ' '){
                i++;
            }
            noSpacesText += text.charAt(i);
        }
        return noSpacesText;
    }

    public String searchCharacter(String word, char Character){
        String position = "";

        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == Character) position += i+" ";
        }
        if(position == "") position += "-1";
        return position;
    }

    //Metodo que reemplaza un caracter de x posicion con otro caracter
    public String insCad(String word, int position, char Character){
        String newWord = "";
        for(int i = 0; i < word.length(); i++){
            if(position == i) newWord += Character;
            else newWord += word.charAt(i);
        }
        return newWord;
    }

    public String countCharacters(String word){
        int repCounter;
        String repetitionsMenu = "";

        while(word.length() > 0){
            repCounter = timesCharacterRepited(word, word.charAt(0));
            repetitionsMenu += word.charAt(0);
            repetitionsMenu += repCounter;
            word = deleteCharacters(word, word.charAt(0));
        }
        return repetitionsMenu;
    }

    private int timesCharacterRepited(String word, char character){
        int timesRepited = 0;
        for(int i = 0; i<word.length(); i++){
            if(word.charAt(i) == character) timesRepited++;
        }
        return timesRepited;
    }

    private String deleteCharacters(String word, char character){
        String wordUpdated = "";
        for(int i =0; i<word.length(); i++){
            if(word.charAt(i)!=character)wordUpdated += word.charAt(i);
        }
        return wordUpdated;
    }

    //public String getMostTimesRepitedCharacter(String word){
    //    String output = "";
    //}

    public boolean testPalindrome(String word){
        String reverseWord = "";
        boolean isPalindrome = false;
        word = removeSpaces(word);

        for(int i= 0; i<word.length(); i++) {
            //System.out.println(i);
            //System.out.println(word.length());
            reverseWord = reverseWord + word.charAt(word.length()-1-i);

        }
        System.out.println(reverseWord);
        if(reverseWord.equals(word)) isPalindrome = true;
        return isPalindrome;
    }

    public String excludeCharacters(String word, int limInferior, int limSuperior){
        String wordUpdated = "";
        for(int i =0; i<limInferior; i++) wordUpdated+= word.charAt(i);
        for(int i = limSuperior+1; i<word.length();i++) wordUpdated+= word.charAt(i);
        return wordUpdated;
    }

    //Metodo que cuente las veces que se repiten los caracteres en cada palabra y determine cual es la letra que mas se repite
    //Si se repiten la misma cantidad diferentes letras, retorne ambas
    public String findMostCharactersRepited(String word){
        String mostCharRepited="";
        String repetitionsCharacters = countCharacters(word);
        repetitionsCharacters = ""+findRepsOfChar(repetitionsCharacters);
        return mostCharRepited;
    }

    private int findRepsOfChar(String charsRepited){
        int repetitions;
        String numberString = "";
        for(int i = 1 ; i<charsRepited.length(); i+=2) {
            numberString += charsRepited.charAt(i);
            System.out.println(numberString);
            System.out.println(i);
        }
        repetitions = numberStringtoInt(numberString);
        return repetitions;
    }

    //Metodo que verifique si dadas 2 palabras, la segunda es igual al termino de la primera
    public boolean stringEnding(String str, String ending) {
        String tempWord = "";
        boolean exit = false;

        for(int i =str.length() - ending.length() ; i < str.length(); i++){
            tempWord += str.charAt(i);
        }
        if(tempWord.equals(ending))
            exit = true;

        return exit;
    }



}

