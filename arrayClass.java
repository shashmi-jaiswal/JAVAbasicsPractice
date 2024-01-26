class Students{
    String name ;
    int age;
    int id;
}
public class arrayClass {
    public static void main(String a[]){
        Students kid1 = new Students();
        kid1.name = "Shashmi";
        kid1.age = 26;
        kid1.id = 10;

        Students kid2 = new Students();
        kid2.name = "Avaneesh";
        kid2.age = 12;
        kid2.id = 11;


        Students arrays[] = new Students[2];
        arrays[0] = kid1;
        arrays[1] = kid2;

        System.out.println(kid1.name);
        System.out.println(arrays[1].name);
    }
}
