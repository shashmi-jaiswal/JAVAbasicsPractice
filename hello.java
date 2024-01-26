
class calculator{
    public int addition(int x1, int x2)
    {
        int r;
        r = x1 +x2;
        return(r);
    }
}

class Hello 
{
    public static void main(String a[])
    {   
        Integer i = Integer.valueOf(12);
        int r = 10;

        int q = 20;

        System.out.println(r|3);

        System.out.println(q>>3);


        
        int num1  = 3;
        int num2 = 4;   
        calculator c = new calculator();
        int answer;
        answer = c.addition(num1, num2);
        System.out.println(answer);

    }

    

    
}