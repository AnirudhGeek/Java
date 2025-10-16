class ConditionalRendering{
    public static void main(String[] args) {
        int x = 118 ;

        if(x>10 && x<=20)   //11-20
            System.out.println("Hello");
        else
            System.out.println("Bye");
    
        
        //greatest of all the numbers
        int a = 10;
        int b= 20;
        int c = 30;

        if(a>b && a>c){
            System.out.println(a);
        }else if(b > c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    


        //TErnary operator
        int n = 4;
        int result=0;

        result = n%2==0 ?10 : 20;
        System.out.println(result);
        }

        //exam time 
        //exam time
        //exam time 
        //exam time
        //exam time
        //exam time
}