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


        ExampleSet exampleCar = new ExampleSet(KIA, "Rio", 2018);
        Set<ExampleSet> exampleHashSet = new HashSet<>();
        exampleHashSet.add(exampleCar);

        LinkedHashSet<ExampleSet> exampleLinkedHashSet = new LinkedHashSet<>();
        exampleLinkedHashSet.add(exampleCar);

        TreeSet<ExampleSet> exampleTreeSet = new TreeSet<>();
        exampleTreeSet.add(exampleCar);

        int i = 0;
        ExampleQueue exampleQueue = new ExampleQueue(i);
        LinkedList<ExampleQueue> exampleLinkedList = new LinkedList<>();
        PriorityQueue<ExampleQueue> priorityQueue = new PriorityQueue<>();
        Deque<ExampleQueue> deque = (Deque<ExampleQueue>) priorityQueue;

        System.out.println(deque);


        ExampleMap exampleMap = new ExampleMap();
        System.out.println(exampleMap);

        exampleMap.put("Маша", "8");
        exampleMap.put("Михаил", "31");
        exampleMap.put("Олег", "12");
        exampleMap.put("Денис", "14");

        System.out.println();
        System.out.println("Элементы карты");
        System.out.print("\t" + exampleMap);
        HashMap<Object, Map> hashMap = new HashMap<>();
        Hashtable<String, Boolean> stringBooleanHashtable = new Hashtable();
        TreeMap<ExampleMap, String> exampleTreeMap = new TreeMap<>();
    }
}
