package com.brono;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] result = { "even", "odd" };

        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        System.out.println(result[input % 2]);
    }
}