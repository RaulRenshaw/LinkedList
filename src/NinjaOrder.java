import java.util.LinkedList;

public class NinjaOrder {

    LinkedList<Ninja> listNinjas = new LinkedList<>();

    public NinjaOrder(LinkedList<Ninja> listNinjas) {
        this.listNinjas = listNinjas;
    }

    public void addFirstNinja(Ninja ninja){
        listNinjas.addFirst(ninja);
    }

    public void addNinja(Ninja ninja){
        listNinjas.add(ninja);
    }
    public void orderBy(String critery){
        switch (critery){
            case "nome":
                listNinjas.sort((n1,n2) -> n1.name().compareTo(n2.name()));
                System.out.println("lista ordenada por nome");
                break;
            case "vila":
                listNinjas.sort((n1,n2) -> n1.vila().compareTo(n2.vila()));
                System.out.println("lista ordenada por vila");
                break;
            case "idade":
                listNinjas.sort((n1,n2) -> n1.idade() - n2.idade());
                System.out.println("lista ordenada por idade");
                break;
        }
    }

    public void addById(int index, Ninja ninja){
        if (listNinjas.isEmpty() && index != 0){
            System.out.println("Lista vazia, por favor insira um índice de 0");
            return;
        }
        if (index < 0 || index > listNinjas.size()) {
            System.out.println("Índice inválido, por favor insira um índice de 0 até " + listNinjas.size());
            return;
        }
        listNinjas.add(index, ninja);
    }

    @Override
    public String toString() {
        StringBuilder exibirNinja = new StringBuilder();
        for (Ninja ninja : listNinjas) {
            exibirNinja.append("Eu sou o ").append(ninja.name()).append(", da ").append(ninja.vila()).append(" e tenho: ").append(ninja.idade()).append(" anos.\n");
        }
        return exibirNinja.toString();
    }
}
