package javax.validation.constraints;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.checkerframework.framework.qual.TypeQualifier;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@TypeQualifier
public @interface NotNull {
    // The following annotation attributes are allowed in source code,
    // but are ignored by the Nullness Checker.

    Class<?>[]  groups() default {};
    String      message() default "{javax.validation.constraints.NotNull.message}";
    // To not depend on the Payload class, let us use a more flexible bound.
    Class<?>[]  payload() default {};
}
