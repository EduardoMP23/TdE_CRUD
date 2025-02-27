package Tde;
import java.util.ArrayList;

public class crud {

    public static void Addlist(ArrayList<String> list, String name){
        list.add(name);
    }

    public static void ShowList(ArrayList<String> list){
        System.out.println(list);
    }

    public static void RemoveList(ArrayList<String> list, int posicao){

        list.remove(posicao);
    }

    public static void UpdateList(ArrayList<String> list, int posicao, String altercao){

        list.set(posicao , altercao);
    }

public static void main(String[] args) {
    ArrayList<String> listinha = new ArrayList();
    Addlist(listinha, "Eduardo");
    Addlist(listinha, "Tatiane");
    Addlist(listinha, "Vitor");

    ShowList(listinha);

    RemoveList(listinha, 0);

    ShowList(listinha);

    UpdateList(listinha, 0, "André");

    ShowList(listinha);
    }
}