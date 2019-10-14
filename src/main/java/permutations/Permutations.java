package permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Created by grigort on 11/16/2018.
 */
public class Permutations{
    public static <T>  List<List<T>> permutations(List<T> list){
        List<List<T>> allPermutations = new ArrayList<>();
        if (list.size() == 1){
            allPermutations.add(new ArrayList<>(list));
            return allPermutations;
        }
        for (int i = 0; i < list.size(); i++){
            T elem = list.get(i);
            List<T> subList = new ArrayList<>(list);
            subList.remove(elem);
            List<List<T>> permutations = permutations(subList);
            for (List<T> l : permutations){
                l.add(elem);
                allPermutations.add(l);
            }
        }
        return allPermutations;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(3);
        list.add(8);
        list.add(8);
        System.out.println(permutations(list));
        List<String> oprList = Arrays.asList("plus","minus","mull","div");
        System.out.println(permutations(oprList));
        permutations(list).stream()
                .flatMap(elem -> permutations(oprList).stream().map(per -> combine(elem,per))).filter(el -> el == 24).forEach(i -> System.out.println(""));

    }

    private static  Integer combine(List<Integer> integers,List<String> operations){
        BinaryOperator<Integer> opr0 = binOperator(operations.get(0));
        BinaryOperator<Integer> opr1 = binOperator(operations.get(1));
        BinaryOperator<Integer> opr2 = binOperator(operations.get(2));

        Integer res = opr2.apply(opr1.apply(opr0.apply(integers.get(0),integers.get(1)),integers.get(2)),integers.get(3));
        if (res == 24){
            System.out.println("-------------------------------");
            System.out.println(integers);
            System.out.println(operations);
            System.out.println("--------------------------------");
        }
        return res;
    }

    private static BinaryOperator<Integer> binOperator(String opr){
        switch (opr){
            case "plus":
                return (a,b) -> a + b;
            case "minus":
                return (a,b) -> a - b;
            case "div":
                return (a,b) -> a / b;
            case "mull":
                return (a,b) -> a * b;
            default:
                return null;
        }
    }
}
