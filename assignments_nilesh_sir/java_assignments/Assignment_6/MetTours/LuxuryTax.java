package MetTours;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * Here we create an annotation using '@' and we give Retention Policy as RUNTIME
 * and this annotation applies only to Methods.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface LuxuryTax {
    int value() default 8;
}
