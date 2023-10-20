import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();

        languages.put("Java", "A compiled, high level, Object-Oriented, platform independent language");
        languages.put("Python", "Interpreted, object oriented, high-level programming with dynamic semantics");
        languages.put("Algol", "An algorithmic language");
        languages.put("BASIC", "Beginner All Purpose Symbolic Instruction Code");
        languages.put("Lisp", "Therein lies madness");


        System.out.println("================================================================");
        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }

        System.out.println(languages.size());

        System.out.println(languages.getOrDefault("Java", "The key does not exist in the map"));

//        languages.remove("Algol");
        if (languages.replace("Algol", "An algorithmic language", "The new wake of algorithms with Algol")) {
            System.out.println("Algol value updated.");
        } else {
            System.out.println("Algol value not updated.");
        }
        System.out.println("================================================================");
        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }


    }
}
