public class Main {
   
    public static void main(String[] args) {
        Animal p1 = new Pets(1, "CAT", "Manya", "2020-02-08");
        Animal p2 = new Pets(2, "DOG", "Rex", "2021-09-05");
        Animal p3 = new Pets(3, "HUMSTER", "Fluffy", "2022-08-02");
        Animals_registry registry = new Animals_registry();
        registry.addAnimal(p1);
        registry.addAnimal(p2);
        registry.addAnimal(p3);
        System.out.println(registry);
        p1.addCommand("Stay");
        p1.commadsList();
        registry.searchbybirthday("2022-08-02");
    }
}
