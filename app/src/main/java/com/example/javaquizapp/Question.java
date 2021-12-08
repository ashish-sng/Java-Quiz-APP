package com.example.javaquizapp;

public class Question {

    public String questions[] = {
            "What guarantees type-safety in a collection?",
            "Which interface should be implemented for sorting on basis of many criteria’s?",
            "Which of those allows duplicate elements?",
            "Methods such as reverse, shuffle are offered in:",
            "Which of those doesn’t have an index based structure?",
            "java.util.Collections is a:",
            "Which is a Programming Language?",
    };

    public String choices[][] = {
            {"Generics","Abstract Classes","Interfaces","Collection"},
            {"Comparator","Comparable","Serializable","None of the above"},
            {"Set","List","All","None of the above"},
            {"Object","Collection","Collections","Apache Commons Collections"},
            {"Class","Interface","Object","None of the above"},
            {"List","Set","Map","None of the above"},
            {"HTML", "CSS", "Vala", "PHP"},
            {"Punction Marks", "Back-Slash", "Brackets", "Semi Colon"}
    };

    public String correctAnswer[] = {
            "Generics",
            "Comparator",
            "List",
            "Collections",
            "Class",
            "Set",
            "PHP",
            "Brackets"
    };

    public String getQuestion(int a){
        String question = questions[a];
        return question;
    }

    public String getchoice1(int a){
        String choice = choices[a][0];
        return choice;
    }

    public String getchoice2(int a){
        String choice = choices[a][1];
        return choice;
    }

    public String getchoice3(int a){
        String choice = choices[a][2];
        return choice;
    }

    public String getchoice4(int a){
        String choice = choices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = correctAnswer[a];
        return answer;
    }
}
