package ru.dpankratov.itkub.lesson.my;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Инициализация
//        String str1 = "lfdkfhdsfkdskj";
//        String str2 = new String();
//        String str3 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
//        String str4 = new String(new char[]{'w', 'e', 'l', 'c', 'o', 'm', 'e'}, 3, 4);

        //Расмотрели toStirng();
//        Human max = new Human("Макс");
//        System.out.println("Java object: " + max);

//        char[] helloArray = str1.toCharArray(); //преоразет строку в массив символов.

//        String s = "";
//        if(s.length()==0) System.out.println("String is empty");
//        if(s.isEmpty()) System.out.println("String is empty");
//        if(s!=null && s.length()==0) System.out.println("String is empty");

//        String str_3 = str1 + " " + str2;
        //String sss = str1.concat("dfdf");

//        String formatString = "We are printing double variable(%.2f), string('%s') and integer variable(%d) and 8(%o) and 16(%X).";
//        System.out.println(String.format(formatString, 0.1, "test", 9376, 234, 255 ));

//        String a = String.valueOf(10.54F);
//        System.out.println(a);
//        Human max = new Human("Макс");
//        String b = String.valueOf(max);
//        System.out.println(b);

//        Integer i = Integer.parseInt("12");
//        System.out.println(i);

//        List<String> people = Arrays.asList(
//                "Philip J. Fry",
//                "Turanga Leela",
//                "Bender Bending Rodriguez",
//                "Hubert Farnsworth",
//                "Hermes Conrad",
//                "John D. Zoidberg",
//                "Amy Wong"
//        );
//
//        String peopleString = String.join("; ", people);
//        System.out.println(peopleString);
//
//        String[] words = peopleString.split("; ");
//        System.out.println(words);

//        String str1 = new String("hello"); //одна ссылка
//        String str2 = new String("hello"); //вторая ссылка
//        if (str1 == str2) { //сравниваем ссылки //ссылки одинаковы надо использовать equals
//            System.out.println("true");
//        } else {
//            System.out.println("false"); //<==
//        }
//
//        String str_1 = "hello"; //запомнили ссылку на hello
//        String str_2 = "hello"; //джава подумала и решила что мы хотим тот же объект hello
//        if (str_1 == str_2) { //ссылки одинаковы надо использовать equals
//            System.out.println("true"); //<==
//        } else {
//            System.out.println("false");
//        }

//        String str1 = "B";
//        String str2 = "A";
//        System.out.println(str1.compareTo(str2)); //лексографическое сравнение

//        String str1 = "hello world";
//        int index = str1.indexOf("world"); //индекс вхождения слова в сроку
//        System.out.println(index);
//
//        int lindex = str1.lastIndexOf('o'); //индекс последнего вхождения символа в сроку
//        System.out.println(lindex);

//        String str1 = " hello world ";
//        System.out.println("=>" + str1.trim() + "<=");

//        String str1 = "Hello world!";
//        System.out.println(str1.substring(6));
//        System.out.println(str1.substring(6,8)); //с 6 символа по 8 символ

//        String str1 = "Hello world!";
//        System.out.println(str1.replace('w', 'p'));

//        String str1 = "Hello world!";
//        System.out.println(str1.toLowerCase());
//        System.out.println(str1.toUpperCase());

        //В многопоточных приложения StringBuilder
        //B однопоточных StringBuffer


        StringBuffer stringBuffer1 = new StringBuffer(); //мы выделяем память под строку на 16 байт
        StringBuffer stringBuffer2 = new StringBuffer(32); //мы указываем сколько байт памяти нам надо выделить для работы со строкой
        StringBuffer stringBuffer3 = new StringBuffer("String"); //мы указываем конкретную строчку с которой хотим работать

        System.out.println(stringBuffer1.capacity()); //показывает сколько байт реально было выделено под работ со строкой.
        System.out.println(stringBuffer2.capacity());
        System.out.println(stringBuffer3.capacity());

        stringBuffer3.ensureCapacity(23); //увеличение буфера под работу со строками
        System.out.println(stringBuffer3.capacity());
        System.out.println(stringBuffer3.length()); //длина строки

        stringBuffer3.append(" test");
        System.out.println(stringBuffer3.capacity());
        System.out.println(stringBuffer3.length()); //длина строки

        System.out.println(stringBuffer3.charAt(0));

        System.out.println(stringBuffer3.insert(3, "brrr..."));

        System.out.println(stringBuffer3.delete(3,5)); //удаляем символы с 3 по 5

        System.out.println(stringBuffer3.reverse());

        stringBuffer3.setLength(5);
        System.out.println(stringBuffer3);

    }

//    static class Human {
//        private String name;
//        public Human(String name) {
//            this.name = name;
//        }
//
//        @Override
//        public String toString() {
//            return "Человек с именем " + name;
//        }
//    }


}