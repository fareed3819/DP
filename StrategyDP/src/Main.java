package StrategyDP.src;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

//Strategy is a behavioral design pattern that lets you define a family of algorithms,
// put each of them into a separate class, and make their objects interchangeable.
public class Main {
    static int[] inputArray = {3, 5, 4,1,33};

    public static void main(String[] args) {
        SortingStrategy sorting = new SortingStrategy();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose one: ");
        AtomicInteger i = new AtomicInteger(1);
        Arrays.stream(AvailableStrategies.values()).forEach(ele->{
            System.out.println(i + "-" +ele);
            i.getAndIncrement();
        });
        int n = scanner.nextInt();
        SortingType strategy;
        if(n==1){
            strategy = new BubbleSortStrategy();
        }else {
            strategy = new SelectionSortStrategy();
        }
        String sorter = sorting.getSortingAlgorithm(strategy);
        AvailableStrategies.valueOf(sorter).getSort().sort(inputArray);
        Arrays.stream(inputArray).forEach(ele->System.out.print(ele+","));
    }
}