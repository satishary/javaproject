
package problem;

import java.util.Arrays;

public class Wordfrequency {
public static void main(String[] args)
{
    String word="I self satish";
    word=word.toLowerCase().trim();
    int[] frequency=new int[26];
    char[] chars=word.toCharArray();
    for(char ch:chars)
    {
        if(Character.isLowerCase(ch))
            frequency[ch-'a']++;
}
    System.out.println(Arrays.toString(frequency));

    

}
}