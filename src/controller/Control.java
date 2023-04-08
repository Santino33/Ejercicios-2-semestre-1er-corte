package controller;

import model.Date;
import model.Student;
import view.IoManager;

import java.util.Arrays;
import java.util.Scanner;

public class Control {

    //Atributos
    private IoManager io;
    Student student = new Student();
    //Contructor

        public Control(){
            io = new IoManager();
        }



    //Metodos
        public void init(){
            //EJERCICIO MULTIPLO
            if(student.multiplo(21, 5)){
                io.showMessage("b es un multiplo de a");
            }
            else{
                io.showMessage("b no es multiplo de a");
            }
            //EJERCICIO TABLA MULTIPLICAR

           io.showMessage(student.powTable(6, 3, 7));


           io.showMessage("Este texto tiene "+ student.cantidadVocales("minita") + " vocales");

           //EJERCICIO NUMERO PRIMO
           if(student.numeroPrimo(1)){
               io.showMessage("Es un numero primo");
           } else{
               io.showMessage("No es un numero primo");
           }

            //io.showMessage(student.convertirMinusculas("niño"));

           //EJERCICIO CIFRAS
            //io.showMessage("El numero asignado tiene "+ student.cifras(1456) + " cifras");

            //EJERCICIO FIBONACCI
            //io.showMessage("Los primeros 10 numeros de la serie fibonnacci son :" + Arrays.toString(student.calcularFibonacci()));

            //EJERCICIO POTENCIA DE UN NUMERO
            //io.showMessage("El resultado de la potencia es: " + student.potencia(2, 0));

            //EJERCICIO FACTORIAL
            //io.showMessage("El factorial del numero asignado es " + student.calcularFactorial(15));

            //EJERCICIO MI PARSEO
            //io.showMessage(""+ );

            //EJERCICIO REVERSO
            //io.showMessage(student.reverseString("verstappen"));
            //CONVERSION A RADIANES
            //io.showMessage(""+student.toRadians(90));

            //EJERCICIO SENO 2 PARAMETROS
            //io.showMessage(""+ student.mySin(45, 10000));
            //io.showMessage(""+student.mySin(1));

            //EJERCICIO DECIMAL A BINARIO
            //io.showMessage("El nuevo numero con su nueva base es: "+ student.decimalToBinary(42));

            //EJERCICIO DECIMAL A HEXADECIMAL
            //io.showMessage(("El nuevo numero hexadecimal es: "+ student.decimalToHex(2470)));

            //EJERCICIO NUMERO ALEATORIO
            //io.showMessage("" + student.getRandomNumber(50, 55));

            //EJERCICIO JUEGO ADIVINAR NUMERO
            //gameGuessNumber();

            //EJERCICIO NUMERO STRING A INT


            //EJERCICIO CARACTERES REPETIDOS
            //io.showMessage("El caracter asignado se repite "+ student.getCharactersRepited("monaco", 'o') + " veces");

            //EJERCICIO QUITAR ESPACIOS
            //io.showMessage(""+ student.removeSpaces("al rayo mcueen"));

            //EJERCICIO BUSCAR EN LA CADENA
            //io.showMessage("El caracter buscado esta en las posiciones: "+ student.searchCharacter("jedahh", 'j'));

            //EJERCICIO PALINDROMO
            //io.showMessage("¿La palabra asignada es un palindromo?" + student.testPalindrome("amor a roma"));

            //EJERCICIO JUEGO
            //gameGuessNumber();

            //io.showMessage(""+student.insCad("casa", 3, 't'));

            //EJERCICIO CARACTERES REPETIDOS V2
            //io.showMessage(""+student.countCharacters("manzana"));

            //io.showMessage("funcion caracteres excluidos: "+ student.excludeCharacters("formula", 2, 4));

            //io.showMessage(""+student.findMostCharactersRepited("casas"));

            //io.showMessage("¿Es un numero magico? "+student.magicNumber(370));

            //io.showMessage("El numero double es: "+student.stringToDouble("-238"));

            io.showMessage("String ending: " + student.stringEnding("celular", "ular"));
        }


        /*JUEGO ADIVINAR NUMERO
        Lo hice en la clase Control porque me parecio mas practico a la hora de necesitar
        el uso de la clase ioManager ya que no la podemos usar en el modelo
         */
    public void gameGuessNumber(){
        int machineNumber = student.getRandomNumber(1, 100);

        io.showMessage("BIENVENIDO AL JUEGO, debe adivinar el numero de la maquina (1 - 100) en 10 intentos, buena suerte");
        logicGuessNumber(machineNumber);

    }
    private void logicGuessNumber(int machineNumber){
            int playerNumber;
            int context;

        for(int i = 0; i < 10; i++){
            playerNumber = askNumber();
            playerNumber = validatePlayerNumber(playerNumber);
            context = classificateSituation(playerNumber, machineNumber, i);

            switch (context) {
                case 1 -> io.showMessage("no, el número a adivinar es mayor, te quedan " + (10 - i - 1) + " intentos");
                case 2 -> io.showMessage("no, el número a adivinar es menor, te quedan " + (10 - i - 1) + " intentos");
                case 3 -> {
                    io.showMessage("Felicidades, has adivinado el numero, fin del juego");
                    i =10;
                }
            }
            if(i == 9) io.showMessage("Se te acabaron los intentos, fin del juego");
        }

    }

    private int classificateSituation(int playerNumber, int machineNumber, int i){
            int context = 0;
            if(playerNumber < machineNumber) context = 1;
            if(playerNumber > machineNumber) context = 2;
            if(playerNumber == machineNumber) context = 3;

            return context;

    }

    private int askNumber(){
        return io.readInt("Ingrese su numero");
    }

    private int validatePlayerNumber(int playerNumber){
            while(playerNumber < 1 || playerNumber > 100){
                io.showMessage("El numero ingresado es invalido, ingreselo nuevamente");
                playerNumber = askNumber();
            }
            return playerNumber;
    }

}





