public class Person {
    private String name;

    public String getName(){
        return name;
    }

//    setter pattern
//    public void setName(String name){
//        this.name = name;
//    }

    public void sayHello(){
        System.out.println("Hey there " + name);
    }

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args){
        Person p1 = new Person("Justin");
        Person p2 = new Person("Fernando");
        System.out.println(p1.getName());
        System.out.println(p2.getName());
        p1.sayHello();
        p2.sayHello();

    }
}


