package java.advanced.generics;

import java.util.ArrayList;
import java.util.List;

//Generics are a way to tell the compiler what kind of objects a collection can contain

public class GenericsExample {

    public static void main(String[] args) {
	// Example without Generics
        List names = new ArrayList();
        names.add("Gill");
        String name = (String) names.get(0);
        System.out.println("First name: " + name);
        names.add(8);

        //Example with Generics
        List<String> names2 = new ArrayList();
        names2.add("Gill");
        String name2 = names2.get(0);
        System.out.println("First name: " + name2);
    }
}
