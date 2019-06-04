package com.example.mylibrary.interfaces;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface NavigationBarBackgroundColor {
    int a() default 255;
    int r() default 255;
    int g() default 255;
    int b() default 255;
}
