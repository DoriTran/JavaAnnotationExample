package Annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ColumnInfo {
    public String name() default "";
    public boolean nullable() default false;
    public int length() default 255;
}
