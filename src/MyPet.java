public class MyPet {
    public static void main(String[] args) {
        MyDog Dog = new MyDog();
        Dog.setName("jack");
        Dog.setAge(5);
        Dog.setColour("golden black");
        Dog.setHeight((float) 4.675);
        Dog.setWeight((float) 5.35);

        System.out.println("The name of my Dog is " + Dog.getName());
        System.out.println("My Dog is " + Dog.getAge()+" years old");
        System.out.println("It height is " + Dog.getHeight());
        System.out.println("It weight is "+ Dog.getWeight());
        System.out.println("My Dog is "+ Dog.getColour()+" in colour");

    }
}
