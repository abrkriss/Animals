
import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
    public int id;
    public String type;
    public String name;
    public String birthday;
    public List command;

    public Animal(int id, String type, String name, String birthday) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.birthday = birthday;
        this.command = new ArrayList();
    }

    public void addCommand(String s) {
        this.command.add(s);
    }

    public void commadsList() {
        System.out.println(this.command.toString());
    }

    public int getId() {
        return this.id;
    }

    public String getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public List getCommand() {
        return this.command;
    }

    public void showPet() {
        int var10001 = this.id;
        System.out.println("ID " + var10001 + " type " + this.type + " name " + this.name + " birtday " + this.birthday + " command " + String.valueOf(this.command));
    }

    public String toString() {
        int var10000 = this.id;
        return "Animal id=" + var10000 + ", type='" + this.type + "', name='" + this.name + "', birthday='" + this.birthday + "', command='" + String.valueOf(this.command) + "'";
    }
}
