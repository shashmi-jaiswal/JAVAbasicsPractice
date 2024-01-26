package immutable;

public class immutable1 {
    public static void main(String[] args) {
        Integer i =10;
        
        System.out.println(i);
        
        i = Modify(i);
        System.out.println(i  +" later");
            
        }
    
    public static Integer Modify(Integer x){
        x = x +100;
        return x;
    }
}
    




