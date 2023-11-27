public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Animal p1 = new Pets(1, "CAT", "Manya", "2020-02-08");
        Animals_registry registry = new Animals_registry();
        registry.addAnimal(p1);
        System.out.println(registry);
        p1.addCommand("Stay");
        p1.commadsList();
    }
}
