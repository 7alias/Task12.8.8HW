import java.util.*;

public class Main {
    private static String KIA = "KIA";

    public static void main(String[] args) {

        ExampleList example = new ExampleList("Vasja", "Fomin", true);
        List<ExampleList> arrayList = new ArrayList<>();
        arrayList.add(example);

        LinkedList<ExampleList> linkedList = new LinkedList<>();
        linkedList.add(example);

        Vector<ExampleList> listVector = new Vector<>();
        listVector.add(example);

        System.out.println("Name: " + linkedList.getFirst().getName());
        System.out.println(("Surname: " + linkedList.getLast().getSurname() +
                ", status: " + listVector.get(0).isStatus()));

        ExampleSet exampleSet = new ExampleSet(KIA, "Rio", 2014);

        LinkedHashSet<ExampleSet> exampleLinkedHashSet = new LinkedHashSet<>();
        exampleLinkedHashSet.add(exampleSet);
        System.out.println("Linked HashSet size: " + exampleLinkedHashSet.size());

        TreeSet<ExampleSet> exampleTreeSet = new TreeSet<>();
        exampleTreeSet.add(exampleSet);
        System.out.println("exampleTreeSet size: " + exampleTreeSet.size());

        ExampleMap exampleMap = new ExampleMap("Name", "Student");
        System.out.print("Map hashCode: " + exampleMap.hashCode());

        if (exampleMap.hashCode() == 1329552164) System.out.println(" Equals 1329552164");

        exampleMap.put("Маша", "8");
        exampleMap.put("Михаил", "31");
        exampleMap.put("Олег", "12");
        exampleMap.put("Денис", "14");

        System.out.println("Map size: " + "\t" + exampleMap.getName().length());

    }
}
