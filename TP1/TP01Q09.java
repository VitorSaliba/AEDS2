import java.io.*;

class TP01Q09 {
    public static void main (String [] args) throws Exception{

        int n = MyIO.readInt();
        RandomAccessFile arquivo = new RandomAccessFile("arquivo.txt", "rw");
        for(int i = 0; i < n; i++){
            double num = MyIO.readDouble();
            arquivo.writeDouble(num);
        }
        arquivo.close();
        RandomAccessFile arquivo2 = new RandomAccessFile("arquivo.txt", "r");
        for (int i = 0; i < n; i++){
            arquivo2.seek((n-1-i) * 8);
            //MyIO.println(arquivo2.getFilePointer());
            MyIO.println(arquivo2.readDouble());
        }
        arquivo2.close();
    }
}
