package app;

import app.enumHelper.Day;
import app.model.AdviceGenerator;

import java.util.Scanner;

public class Lesson15App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Привіт, я бот порад, надрукуй день тижня і отримуй круту пораду");
        System.out.println("*День тижня обов'язково пиши на англійській мові");
        String dayInput = scan.nextLine();
        Day day = Day.valueOf(dayInput.toUpperCase());
        AdviceGenerator adviceGenerator = new AdviceGenerator();
        adviceGenerator.advice(day);


    }
}
