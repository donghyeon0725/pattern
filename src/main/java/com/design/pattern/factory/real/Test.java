package com.design.pattern.factory.real;

import java.util.Calendar;
import java.util.Locale;

public class Test {

    public static void main(String[] args) {
        System.out.println(Calendar.getInstance().getClass());
        System.out.println(Calendar.getInstance(Locale.forLanguageTag("th-TH-Ivariant-TH")).getClass());
        System.out.println(Calendar.getInstance(Locale.forLanguageTag("ja-JP-Ivariant-JP")).getClass());
    }
}
