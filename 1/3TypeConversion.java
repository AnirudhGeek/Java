class TypeConversion {
    public static void main(String[] args) {
        byte b = 127;
        int a = b;
        byte k = (byte)a;
        System.out.println(k);

        //but what if it is out of its range i.e -128 to 127
        //so it will do modulas operation with that number with 256 (from -128 to 127) 
        
        int c = 257;
        k = (byte)c;
        System.out.println(k);

        int d = 300;
        k= (byte)d;
        System.out.println(k);

        float f = 5.7f;
        int t = (int)f;
        System.out.println(t);


        //type promotions => if result of two variables are going out of the scope 
        byte ab = 10 ;
        byte ba = 30;
        // byte result = ab *ba;    going out of the range
        int result = ab *ba;
        System.out.println(result);

    }

}