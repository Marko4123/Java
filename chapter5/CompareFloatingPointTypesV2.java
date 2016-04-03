

package comparefloatiingtypesv2;

/**
 *
 * @author Marko
 */
public class CompareFloatiingTypesV2 {

   
    public static void main(String[] args) {
        float value = 1.0f;
        float sum = 0.1f+0.1f+0.1f+0.1f+0.1f+0.1f+0.1f+0.1f+0.1f+0.1f;
        System.out.println ("Exact compare: " + (sum == value)); // false
        System.out.println("Rounded compare: " + (Math.abs(sum-value) < 0.000001)); // true
    }

}
