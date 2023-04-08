package view;

import java.util.Scanner;

public class IoManager {
    //Atributos
    private Scanner scanner = new Scanner(System.in);
    //Metodos
    public void showMessage(String Message){
        System.out.println(Message);
    }
    public String readString(String message){
        this.showMessage(message);
        return scanner.nextLine();
    }
    public int readInt(String message){
        this.showMessage(message);
        return scanner.nextInt();
    }

    public int readInt2(String message){
        return Integer.parseInt(readString("Muestre un numero"));
    }

    public int readByte(String message){
        return Byte.parseByte(readString("Muestre un numero"));
    }

    public double readDouble(String message) {
        return Double.parseDouble(readString("Muestre un Double"));
    }
    public boolean readBoolean(String message) {
        return Boolean.parseBoolean(readString("Muestre un booleano"));
    }
    public float readFloat(String message){
        return Float.parseFloat(readString("Muestre un float"));
    }

}


