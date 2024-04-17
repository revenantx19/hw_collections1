import java.util.*;

public class Main {
    public static void main(String[] args) {
        //task1
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        showNechet(nums);
        System.out.println();
        //task2
        List<Integer> listWithoutDublicates = removeDuplicates(nums);
        showChet(listWithoutDublicates);
        //task3
        List<String> listOfWords = new ArrayList<>(List.of("job", "home", "heal", "job", "man", "man"));
        System.out.println();
        System.out.println(removeDuplicatesStr(listOfWords));
        //task4
        List<String> stringList = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три", "три"));
        countDuplicatesStr(stringList);
    }

    public static List<Integer> removeDuplicates(List<Integer> list) {
        List<Integer> newList = new ArrayList<>(); //лист
        HashSet<Integer> set = new HashSet<>(); //множество

        for (Integer element : list) {
            if (!set.contains(element)) {
                newList.add(element);
                set.add(element);
            }
        }
        return newList;
    }

    public static List<String> removeDuplicatesStr(List<String> list) {
        List<String> newList = new ArrayList<>(); //лист
        HashSet<Integer> set = new HashSet<>(); //множество

        for (String element : list) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        return newList;
    }


    public static void showNechet(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 1) {
                System.out.print(list.get(i) + " ");
            }
        }
    }

    public static void showChet(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                System.out.print(list.get(i) + " ");
            }
        }
    }

    public static void countDuplicatesStr(List<String> list) {
        HashSet<String> set1 = new HashSet<>(list); //множество
        for (String s : set1) {
            System.out.println(Collections.frequency(list, s));
        }
        //return set1;
    }
}