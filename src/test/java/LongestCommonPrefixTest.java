import junit.framework.TestCase;

public class LongestCommonPrefixTest extends TestCase {

    public void testProfit1(){
        String[] strs = {"flower","flow","flight"};
        String actual = Main.Solution.longestCommonPrefix(strs);
        String expected = "fl";
        assertEquals(expected, actual);
    }

    public void testProfit2(){
        String[] strs = {"dog","racecar","car"};
        String actual = Main.Solution.longestCommonPrefix(strs);
        String expected = "";
        assertEquals(expected, actual);
    }
}