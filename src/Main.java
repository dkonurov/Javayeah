
public class Main {

    public static void main(String[] args) {
        AutoOwnerDirectory autoOwnerDirectory = new AutoOwnerDirectory();
        autoOwnerDirectory.put("А235ББ", "Toyota", "Vasya");
        autoOwnerDirectory.put("А432БС", "Mercedes", "Nikita");
        autoOwnerDirectory.put("А543БС", "Lada", "Fedor");
        System.out.println(autoOwnerDirectory.get_by_number("А235ББ"));
        System.out.println(autoOwnerDirectory.get_by_number("А432БС"));
        autoOwnerDirectory.remove("А432БС");
        System.out.println(autoOwnerDirectory.get_by_number("А432БС"));
        autoOwnerDirectory.put("А543БС", "HAMMER", "Nikita");
        System.out.println(autoOwnerDirectory.get_by_number("А543БС"));
    }
}
