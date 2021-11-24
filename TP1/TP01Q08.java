import java.io.*;
import java.net.*;

class TP01Q08 {
    //repete a execu��o do programa ate que o usu�rio digite "FIM"
    public static boolean isFim(String palavra) {
        return (palavra.length() == 3 && palavra.charAt(0) == 'F' && palavra.charAt(1) == 'I'
                && palavra.charAt(2) == 'M');
    }

    //verifica as ocorrencias de vogais, consoantes, <br>, <table> e nome
    public static void verificaString(String palavra, String nome){
        int x1 = 0, x2 = 0, x3 = 0, x4 = 0, x5 = 0, x6 = 0, x7 = 0, x8 = 0, x9 = 0, x10 = 0, x11 = 0, x12 = 0, x13 = 0, x14 = 0, x15 = 0, x16 = 0, x17 = 0, x18 = 0, x19 = 0, x20 = 0, x21 = 0, x22 = 0, x23 = 0, x24 = 0, x25 = 0;

        for(int i = 0; i < palavra.length(); i++){
            if(palavra.charAt(i) == 'a'){
                x1++;
            }else if(palavra.charAt(i) == 'e'){
                x2++;
            }else if(palavra.charAt(i) == 'i'){
                x3++;
            }else if(palavra.charAt(i) == 'o'){
                x4++;
            }else if(palavra.charAt(i) == 'u'){
                x5++;
            }else if(palavra.charAt(i) == '�'){
                x6++;
            }else if(palavra.charAt(i) == '�'){
                x7++;
            }else if(palavra.charAt(i) == '�'){
                x8++;
            }else if(palavra.charAt(i) == '�'){
                x9++;
            }else if(palavra.charAt(i) == '�'){
                x10++;
            }else if(palavra.charAt(i) == '�'){
                x11++;
            }else if(palavra.charAt(i) == '�'){
                x12++;
            }else if(palavra.charAt(i) == '�'){
                x13++;
            }else if(palavra.charAt(i) == '�'){
                x14++;
            }else if(palavra.charAt(i) == '�'){
                x15++;
            }else if(palavra.charAt(i) == '�'){
                x16++;
            }else if(palavra.charAt(i) == '�'){
                x17++;
            }else if(palavra.charAt(i) == '�'){
                x18++;
            }else if(palavra.charAt(i) == '�'){
                x19++;
            }else if(palavra.charAt(i) == '�'){
                x20++;
            }else if(palavra.charAt(i) == '�'){
                x21++;
            }else if(palavra.charAt(i) == '�'){
                x22++;
            }else if(isConsoante(palavra.charAt(i))){
                x23++;
            
            }else if(palavra.charAt(i) == '<' && palavra.charAt(i+1) == 'b' && palavra.charAt(1+2) == 'r' && palavra.charAt(i+3) == '>'){
                x24++;
                i+=3;
            }else if(palavra.charAt(i) == '<' && palavra.charAt(i+1) == 't' && palavra.charAt(1+2) == 'a' && palavra.charAt(1+3) == 'b' && palavra.charAt(1+4) == 'l' && palavra.charAt(1+5) == 'e' && palavra.charAt(i+6) == '>'){
                x25++;
                i+=6;
            }
        }
        System.out.println("a(" + x1 + ") e(" + x2 + ") i(" + x3 + ") o(" + x4 + ") u(" + x5 + ") �(" + x6 + ") �(" + x7 + 
        ") �(" + x8 + ") �(" + x9 + ") �(" + x10 + ") �(" + x11 + ") �(" + x12 + ") �(" + x13 + ") �(" + x14 + ") �(" +x15 +
        ") �(" + x16 + ") �(" + x17 + ") �(" + x18 + ") �(" + x19 + ") �(" + x20 + ") �(" + x21 + ") �(" + x22 + ") consoante(" + x23 + ") <br>(" + x24 + ") <table>(" + x25 + ") " + nome);
    }

    public static boolean isConsoante(char c){

        boolean resp = true;
            if(c != 98 && c != 99 && c != 100 && c != 102 && c != 103 && 
            c != 104 && c != 106 && c != 107 && c != 108 && c != 109 &&
            c != 110 && c != 112 && c != 113 && c != 114 && c != 115 && c != 116 && 
            c != 118 && c != 119 && c != 120 && c != 121 && c != 122){
                resp = false;
            }
        return resp;
    }

   public static String getHtml(String endereco){
      URL url;
      InputStream is = null;
      BufferedReader br;
      String resp = "", line;

      try {
         url = new URL(endereco);
         is = url.openStream();  // throws an IOException
         br = new BufferedReader(new InputStreamReader(is));

         while ((line = br.readLine()) != null) {
            resp += line + "\n";
         }
      } catch (MalformedURLException mue) {
         mue.printStackTrace();
      } catch (IOException ioe) {
         ioe.printStackTrace();
      } 

      try {
         is.close();
      } catch (IOException ioe) {
         // nothing to see here

      }

      return resp;
   }
   public static void main(String[] args) {
    String endereco, html, nome;

    nome = MyIO.readLine();
    while (isFim(nome) == false){
        endereco = MyIO.readLine();
        html = getHtml(endereco);
        verificaString(html, nome);
        nome = MyIO.readLine();
    }
   }
}
