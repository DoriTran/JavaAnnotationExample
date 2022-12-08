import Annotation.ColumnInfo;
import Annotation.PrimaryKey;
import Model.*;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        for (Annotation annotation : Student.class.getAnnotations()) {
            Class<? extends Annotation> type = annotation.annotationType();
            System.out.println("Values of " + type.getName());

            for (Method method : type.getDeclaredMethods()) {
                Object value = method.invoke(annotation, (Object[])null);
                System.out.println(" " + method.getName() + ": " + value);
            }
        }

        for(Field field : Student.class.getDeclaredFields()){
            Class type = field.getType();
            String name = field.getName();
            Annotation[] annotations = field.getDeclaredAnnotations();
            System.out.println("Type: " + type.toString() + " - Name: " + name.toString());
            for (Annotation anno: annotations
                 ) {
                if (anno.annotationType().getName() == "Annotation.PrimaryKey") {
                    PrimaryKey p = (PrimaryKey) anno;
                    System.out.println(p.toString());
                }
                else if (anno.annotationType().getName() == "Annotation.ColumnInfo") {
                    ColumnInfo c = (ColumnInfo) anno;
                    System.out.println("ColumnInfo: " + c.name() + " " + c.nullable() + " " + c.length());
                }
            }
            System.out.println("");
        }
    }
}
