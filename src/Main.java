public class Main {
    public static void main(String[] args) {
        LinkedList<String> arr = new LinkedList<>();

        arr.add("First");
        arr.add("Second");
        arr.add("Third");
        arr.add("Four");
        arr.add("Cool", 3);
        for (int i = 0; i < 5; i++) {
            System.out.println(arr.get(i));
        }
        System.out.println();

        arr.delete(0);
        for (int i = 0; i < 4; i++) {
            System.out.println(arr.get(i));
        }
        System.out.println();

        arr.delete("Third");
        for (int i = 0; i < 3; i++) {
            System.out.println(arr.get(i));
        }
    }
}