/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halim.lessons.leftrotationonarrays;

/**
 *
 * @author AbdElHalim
 */
public class ArrayRotation {
    
    public static void main(String[] args) {
        
        int[] result = rotLeft(new int[] {1, 2, 3, 4, 5}, 2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }
    
    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        int[] results = new int[a.length];
        for(int i=0; i<a.length; i++){
            int diff = a.length - d;
            int newIndex = (i + diff) % a.length;
            results[newIndex] = a[i];
        }
        return results;
    }
}
