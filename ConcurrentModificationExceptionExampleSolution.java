import java.util.*;
public class ConcurrentModificationExceptionExampleSolution {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Solution 1: Use an Iterator
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            if (num % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println("Solution 1: " + list);

        //Solution 2: Create a new list
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> oddNumbers = new ArrayList<>();
        for(Integer num : list2){
            if(num % 2 != 0){
                oddNumbers.add(num);
            }
        }
        System.out.println("Solution 2: " + oddNumbers);
    }
}