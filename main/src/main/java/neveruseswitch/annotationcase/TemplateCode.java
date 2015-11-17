package neveruseswitch.annotationcase;

import java.lang.annotation.*;

/**
 * Created by Kanstantsin_Makarau on 16-Nov-15.
 */

    // @Inherited - in case of using abstract classes instead interface
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TemplateCode {
    int value();
}
