class DataTypes{
    public static void main(String a[]){
        //INTEGER
        //int => 4bytes , short =>2bytes , long => 8bytes , byte => 1byte => -2^7 to 2^7-1 i.e -128 to 127
        int num1 = 9;
        // byte num2 = 128; //   it will not exicute since its range is between -128 to 127
        byte num2 = 127;
    
        //FLOAT 
        //in float datatype the default value is double so if we are using float datatype then we have to put f in the end of the number
        float f = 5.8f;    //4bytes
        double d = 5.87;   //8 bytes

        //CHARACTER
        char c = 'A';

        boolean b = true;
        //can't able to code due to MTs
 

        //literals
        //binary 
        int num3 = 0b101;
        System.out.println(num3);

        //hexadecimal
        int num4 = 0x7E;
        System.out.println(num4);


        //couting the big numbers is easy in java as we can write them like 
        double num5 = 10_00_00_000;
        System.out.println(num5);


        //also we can increment a charter 
        char z = 'a';
        z++;
        System.out.println(z);

    }

}