class Operators {

    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 5;

        int res = num1-num2;
        System.out.println(res);


        //num1 = num1 + 2
        num1 += 2; //i.e adding myself by 2
        System.out.println(num1);


        //increment
        // num1 = num1+1;
        // num1 += 1;
        num1++;
        System.out.println(num1);


        //post-increment => num1++
        //pre-increment => ++num1

        int num3 = 6;
        int num4 = 9;

        int res2 = num3++;  //it will fetch the value and then increment
        System.out.print("Result1=>");
        System.out.println(res2);
        System.out.print("num3 value =>");
        System.out.println(num3);
        

        int res3 = ++num4;  //it will first increment and then fetch the value
        System.out.print("Result2=>");
        System.out.println(res3);
        System.out.print("num4 value =>");
        System.out.println(num4);

    }
}