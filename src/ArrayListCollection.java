import java.util.ArrayList;
public class ArrayListCollection {
    public static void main(String[] args) {

        ArrayList<String> items = new ArrayList<>();

        items.add(" red");
        items.add(0, " yellow");
        System.out.print("display list of item:");

        for (String item : items) System.out.printf("%s", item);

        display(items,"%nDisplay list contents enhanced for statement:");
        items.add(" green");
        items.add(" yellow");
        display(items,"List with two new elements:");

        items.remove(0);
        display(items,"Remove first list element yellow :");

        items.remove(1);
        display(items,"Remove second list element (green):");

       System.out.printf("\"red\" is %sin the listen %n", items.contains("red")?" " : "not");

        System.out.printf("Size: %s%n", items.size());
    }
    private static void display(ArrayList<String> items, String header) {
        System.out.printf(header);
        for(String item: items)
            System.out.printf(" %s",item);
        System.out.println();
    }
}
