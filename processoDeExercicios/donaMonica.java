class donaMonica {
    public static int max (int a, int b, int c){
        int resp;
        if(a > b && a > c){
            resp = a;
        }else if(b > a && b > c){
            resp = b;
        }else{
            resp = c;
        }
        return resp;
    }

    public static void main (String [] args){
        int m, a, b;

        do
        {
            m = MyIO.readInt();
            if(m > 0){
                a = MyIO.readInt();
                b = MyIO.readInt();
                
                int c = m - (a + b);
    
                int resp = max(a, b, c);
    
                System.out.println(resp);
            }
        }while (m > 0);
    }
}
