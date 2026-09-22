package Extras.Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {
    public static void main(String[] args) {
        // string list
        List<String> list = new ArrayList< >();

        list.add("Maria");
        list.add("Leticia");
        list.add("Amanda");
        list.add(0, "Ana");

        // list remove
        list.remove("Marcos");

        // size list
        System.out.println(list.size());

        // for each
        for(String x : list){
            System.out.println(x);
        }

        // lambda filter
        System.out.println("------------------");
        List<String> result =  list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for(String x : result){
            System.out.println(x);
        }

        //remove by predicate
        System.out.println("------------------");
        list.removeIf(x -> x.charAt(0) == 'A');
        // found index
        System.out.println("Index of Leticia: " + list.indexOf("Leticia"));
        // if was removed
        System.out.println("Index of Marcos: " + list.indexOf("Marcos"));
        for(String x : list){
            System.out.println(x);
        }
        // find first lambda fuction
        System.out.println("------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
        System.out.println(name);

    }
}
