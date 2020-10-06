package cd.get.ready.algorithms;
import java.util.*;

public class DogWalker {
    public int numberOfWalksCalculator(int[] dogSizes){
        
        int numberOfWalks = 0;
        Hashset<Integer> num = new Hashset<Integer>();
        
        for(int i = 0; i < dogSizes.length; i++){
        num.add(dogSizes[i]);
        numberOfWalks = num.size();
        
        
    }
        return numberOfWalks;
    }
}
