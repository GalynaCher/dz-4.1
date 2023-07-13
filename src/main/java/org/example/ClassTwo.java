package org.example;

public class ClassTwo       // 3. Створити у ньому 2 класи, один із яких містить метод main.
                            // 4. У другому класі оголосити:
{
    public int intExample = 127;   // а. поле типу int із заданим значенням;

    public Integer returnInt() {
        System.out.println("---<" + intExample + ">---"); // b. метод, який друкує в консоль "---<значення поля>---"
        return intExample;                 // і повертає його.
    }
}


