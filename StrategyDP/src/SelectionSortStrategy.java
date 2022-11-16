package StrategyDP.src;

public class SelectionSortStrategy implements SortingType{
    @Override
    public String getSortingType() {
         return String.valueOf(AvailableStrategies.SELECTION_SORT);
    }
}
