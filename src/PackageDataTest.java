
    public class PackageDataTest {
        public static void main(String[] args) {

            PackageData data = new PackageData();
            System.out.printf("After instantiation: %n%s%n", data);

            data.number = 17;
            data.string = "GOODBYE FRIEND";

            System.out.printf("%n After changing values: %n%s%n", data);
        }
}
class PackageData {

    int number = 0;
    String string = "My guy";

public String toString() {
    return String.format("number:%d: string: %s", number, string);
}
}