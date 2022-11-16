package StrategyDP.src;

public enum AvailableStrategies {
    BUBBLE_SORT(new BubbleSortAlgorithm()),
    SELECTION_SORT(new SelectionSortAlgorithm());

    private final ISorter sorter;

    AvailableStrategies(ISorter sort) {
        this.sorter = sort;
    }

    public ISorter getSort() {
        return this.sorter;
    }
    }
