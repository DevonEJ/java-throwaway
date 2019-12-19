public class MyClass {

    private int age;
    private String name;

    public MyClass(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // Constructor with default arguments
    public MyClass() {
        this.age = 27;
        this.name = "Devs";
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        MyClass dylan = new MyClass(26, "Dylan");

        MyClass devon = new MyClass();

        System.out.print("Person 1: ");
        System.out.println(dylan.getName());
        System.out.println(dylan.getAge());

        System.out.print("Person 2: ");
        System.out.println(devon.getName());
        System.out.println(devon.getAge());

    }

}





