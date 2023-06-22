package org.example;

public class Main
{
    static public void main (String[] argv)
    {
        ClassTwo two = new ClassTwo();
        System.out.println(two.returnInt());
        System.out.println("var intExample = " + two.intExample);
    }
}
