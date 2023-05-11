package v1ch5.p9_objectAnalyzer;

import java.util.*;

/**
 * This program uses reflection to spy on objects.
 * @version 1.0 2023-4-28
 * @author Zhiliang Su
 */
public class ObjectAnalyzerTest
{
    public static void main(String[] args) throws ReflectiveOperationException
    {
        var squares = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++)
            squares.add(i * i);
        System.out.println(new ObjectAnalyzer().toString(squares));
    }
}
