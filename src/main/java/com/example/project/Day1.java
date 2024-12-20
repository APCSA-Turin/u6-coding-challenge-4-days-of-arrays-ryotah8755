package com.example.project;
import java.util.Random;

public class Day1 {
    private static String[] elf_names = {"Glitter", "Chocolate", "Tiny", "Snowflake", "Frosty"};

    public static String generateElfName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }

        Random random = new Random();
        String elfNamePrefix = elf_names[random.nextInt(elf_names.length)];
        return elfNamePrefix + " " + name;
    }
}