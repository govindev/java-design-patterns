package miscellenious.iterator;

public class Client {
    public static void main(String[] args) {
        System.out.println("Different theme colors are : ");
        Iterator<ThemeColor> themeColorIterator = ThemeColor.iterator();
        while (themeColorIterator.hasNext()) {
            System.out.println(themeColorIterator.next());
        }
    }
}
