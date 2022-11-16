package StrategyDP.src;

public class BadExample {
    public String getSortingAlgorithm(String sortTye) {
        if(sortTye.equals("bubble")){
            return "Bubble sort alogorithm";
        }
        else if(sortTye.equals("selection")){
            return "selection sort alogorithm";
        }
        return null;
    }
}
// OCP is violated because class is not closed for moditication
