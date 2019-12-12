/*
 * Created By Baldwin Wen
 */

package leetcode.n11_20;

import java.util.*;

public class No15 {
    public List<List<Integer>> threeSum(int[] nums) {
        HashMap<Integer, Integer> positiveMap = new HashMap<>();
        HashMap<Integer, Integer> negativeMap = new HashMap<>();
        int zeroCount = 0;

        for (int num : nums) {
            if(num > 0){
                positiveMap.put(num, positiveMap.get(num) == null ? 1 : positiveMap.get(num) + 1);
            }else if (num < 0){
                negativeMap.put(num, negativeMap.get(num) == null ? 1 : negativeMap.get(num) + 1);
            }else{
                zeroCount++;
            }
        }

        List<List<Integer>> finalResults = new ArrayList<>();

        for(Integer key : positiveMap.keySet()){
            List<List<Integer>> results = new ArrayList<>();
            if(negativeMap.containsKey(-key) && zeroCount > 0){
                results.add(Arrays.asList(key, 0, -key));
            }

            if(key % 2 == 0 && negativeMap.containsKey(-key/2) && negativeMap.get(-key/2) > 1){
                results.add(Arrays.asList(key, -key/2, -key/2));
            }

            for(Integer negativeKey : negativeMap.keySet()){
                if(negativeKey * 2 + key != 0 && negativeMap.get(-negativeKey - key) != null){
                    boolean exist = false;
                    for(List<Integer> tmp : results){
                        if (tmp.contains(negativeKey) && tmp.contains(-negativeKey - key)){
                            exist = true;
                        }
                    }
                    if(!exist) {
                        results.add(Arrays.asList(negativeKey, key, -negativeKey - key));
                    }
                }
            }
            finalResults.addAll(results);
        }

        if(zeroCount > 2){
            finalResults.add(Arrays.asList(0, 0, 0));
        }

        for(Integer negativeKey : negativeMap.keySet()){
            List<List<Integer>> results = new ArrayList<>();

            if(negativeKey % 2 == 0 && positiveMap.containsKey(-negativeKey/2) && positiveMap.get(-negativeKey/2) > 1){
                results.add(Arrays.asList(negativeKey, -negativeKey/2, -negativeKey/2));
            }

            for(Integer key : positiveMap.keySet()){
                if(key * 2 + negativeKey != 0 && positiveMap.get(-negativeKey - key) != null){
                    boolean exist = false;
                    for(List<Integer> tmp : results){
                        if (tmp.contains(negativeKey) && tmp.contains(-negativeKey - key)){
                            exist = true;
                        }
                    }
                    if(!exist) {
                        results.add(Arrays.asList(negativeKey, key, -negativeKey - key));
                    }
                }
            }
            finalResults.addAll(results);
        }
        return finalResults;
    }

    public List<List<Integer>> better(int[] num) {
        Arrays.sort(num);
        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i < num.length-2 && num[i] <= 0; i++) {
            if (i == 0 || (num[i] != num[i-1])) {
                int lo = i+1, hi = num.length-1, sum = 0 - num[i];
                while (lo < hi) {
                    if (num[lo] + num[hi] == sum) {
                        res.add(Arrays.asList(num[i], num[lo], num[hi]));
                        while (lo < hi && num[lo] == num[lo+1]) lo++;
                        while (lo < hi && num[hi] == num[hi-1]) hi--;
                        lo++; hi--;
                    } else if (num[lo] + num[hi] < sum) lo++;
                    else hi--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args){
        No15 n = new No15();
        System.out.println(n.threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
}
