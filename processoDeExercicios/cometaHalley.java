public class cometaHalley {
    public static void main(String[] args) {
        int ano;

        do
        {
            ano = MyIO.readInt();
            int i = 1986;
            while(i <= ano){
                i = i + 76;
                if(i > ano){
                    MyIO.println("" + i);
                }
            }
        }while(ano > 0);
    }
}