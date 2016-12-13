/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.*;

/**
 *
 * @author Trung Pham
 */
public class RandomizedCollection {

    /**
     * Initialize your data structure here.
     */
    
    HashMap<Integer, HashSet<Integer>> map;
    int[] data = new int[10000000];    
    int index = 0;

    public RandomizedCollection() {
        map = new HashMap<>();        
    }

    /**
     * Inserts a value to the collection. Returns true if the collection did not
     * already contain the specified element.
     */
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            map.get(val).add(index);            
            data[index] = val;            
            index++;
            return false;
        }
        map.put(val, new HashSet());        
        map.get(val).add(index);
        
        data[index] = val;
        index++;        
        return true;
    }

    /**
     * Removes a value from the collection. Returns true if the collection
     * contained the specified element.
     */
    public boolean remove(int val) {
        if (map.containsKey(val)) {

            Integer v = null;
            for(int i : map.get(val)){
                v = i;
                break;
            }
            map.get(val).remove(v);
            if (map.get(val).isEmpty()) {
                map.remove(val);            
            }
            
            if (v != index - 1) {
                data[v] = data[index - 1];
                map.get(data[index - 1]).remove(index - 1);
                map.get(data[index - 1]).add(v);
            }
            index--;
            //System.out.println(map);
            
            return true;
        }
        
        return false;
    }

    /**
     * Get a random element from the collection.
     */
    public int getRandom() {
        //ArrayList<Integer> list = new ArrayList<>(revert.keySet());
        Random rand = new Random();

        int r = rand.nextInt(index);
        return data[r];
    }
    
    public static void main(String[] args) {
        RandomizedCollection rc = new RandomizedCollection();
        rc.insert(1);
        rc.insert(1);
        rc.insert(2);
        rc.insert(1);
        rc.insert(2);
        rc.insert(2);
        rc.remove(2);
        rc.remove(2);
        rc.remove(2);        
        for(int i = 0; i < 4; i++){
            System.out.println(rc.getRandom());
        }
                
                
    }
}
