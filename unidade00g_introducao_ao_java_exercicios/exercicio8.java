import java.io.*;
import java.util.Formatter;
import java.util.Scanner;
import java.io.File;
import java.nio.charset.*;

class exercicio8 {
    public static void main (String [] args){
        int num = MyIO.readInt("Entre com um numero: ");
        int impares = 1;
        int n = num;

        while(num < n){
            num++;
            impares += 2;
            System.out.println("Os " +num+ "primeiros impares são: " + impares);
        }
    }
}
