class Human{
    private int age;
    public String name;
    

    public Human()  //Default construtor
    {
        //If you want to perform an operation, do it in a methhod
        // We will use this constructor to make a Default name
        age = 12;
        name = "Default name";
    }
    
    public Human(String n) //paramerterized Constructor
    {
        name = n;  //this.name = name  if you are using --> public Human(String name)
    }
    
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    } 
}

public class constructor{
    public static void main(String a[])
    {
        Human h1 = new Human();
        
        System.out.println("Age: " + h1.getAge()+ " Name is: " + h1.name);

        Human h2 = new Human("SHSHAMI");
        h2.setAge(32);
        System.out.println("Age: " + h2.getAge()+ " Name is: " + h2.name);

    }
  
}
