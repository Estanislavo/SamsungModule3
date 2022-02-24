package com.company;

public class Answers {
    public Answers(String answer) throws lazyException {
        if (answer == "Лень"){
            throw new lazyException("Больше никакой лени!");
        }
        else
            System.out.println("Хорошо, мы всё понимаем, сделайте в ближайшие дни");

    }
}
