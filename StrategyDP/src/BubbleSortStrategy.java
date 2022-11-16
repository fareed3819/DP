package StrategyDP.src;

public class BubbleSortStrategy implements SortingType{
    @Override
    public String getSortingType() {
        return String.valueOf(AvailableStrategies.BUBBLE_SORT);
    }
}
