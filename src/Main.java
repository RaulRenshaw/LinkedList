import java.util.LinkedList;
import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        NinjaOrder listNinjas = new NinjaOrder(new LinkedList<>());

        listNinjas.addFirstNinja(new Ninja("Naruto Uzumaki", 17, "Konoha"));
        listNinjas.addNinja(new Ninja("Sasuke Uchiha", 17, "Konoha"));
        listNinjas.addNinja(new Ninja("Sakura Haruno", 17, "Konoha"));
        listNinjas.addNinja(new Ninja("Kakashi Hatake", 31, "Konoha"));
        listNinjas.addNinja(new Ninja("Gaara", 17, "Areia"));
        listNinjas.addNinja(new Ninja("Shikamaru Nara", 17, "Konoha"));
        listNinjas.addNinja(new Ninja("Temari", 18, "Areia"));

        listNinjas.orderBy("idade");
        System.out.println(listNinjas);

        listNinjas.orderBy("nome");
        System.out.println(listNinjas);

        listNinjas.addById(1, new Ninja("raul",20,"gyuioedfswgbhuilzsdf"));
        System.out.println(listNinjas);
    }
}