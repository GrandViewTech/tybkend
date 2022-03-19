import java.lang.reflect.Field;
import java.util.Set;
import java.util.TreeSet;

public class Test
{

    public  String str;
    public  double db;

    public static void main(String[] args) throws Exception
    {
        String filename="Test";
        Class<?> classz = Class.forName(filename);
        Field[] fields=classz.getDeclaredFields();
        Set<String> fieldNames =  new TreeSet<String>();
        for (Field field : fields)
        {
            System.out.println(field.getType().getName());
            if (field.getType().getName().equals("java.lang.String"))
            {
                fieldNames.add(field.getName());
            }

        }
        fieldNames.stream().forEach(System.out::print);
    }
}
