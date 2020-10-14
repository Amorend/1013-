package android.support.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target({java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.FIELD})
public @interface HalfFloat {}


/* Location:              C:\Users\12724\Desktop\classes-dex2jar.jar!\android\support\annotation\HalfFloat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */