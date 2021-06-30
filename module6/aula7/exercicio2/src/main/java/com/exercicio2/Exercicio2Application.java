package com.exercicio2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.TreeMap;

@SpringBootApplication
@RestController
public class Exercicio2Application {
    private static final TreeMap<String, String> morseDictionary = new TreeMap<>();

    static {
        morseDictionary.put(".-", "A");
        morseDictionary.put("-...", "B");
        morseDictionary.put("-.-.", "C");
        morseDictionary.put("-..", "D");
        morseDictionary.put(".", "E");
        morseDictionary.put("..-.", "F");
        morseDictionary.put("--.", "G");
        morseDictionary.put("....", "H");
        morseDictionary.put("..", "I");
        morseDictionary.put(".---", "J");
        morseDictionary.put("-.-", "K");
        morseDictionary.put(".-..", "L");
        morseDictionary.put("--", "M");
        morseDictionary.put("-.", "N");
        morseDictionary.put("---", "O");
        morseDictionary.put(".--.", "P");
        morseDictionary.put("--.-", "Q");
        morseDictionary.put(".-.", "R");
        morseDictionary.put("...", "S");
        morseDictionary.put("-", "T");
        morseDictionary.put("..-", "U");
        morseDictionary.put("...-", "V");
        morseDictionary.put(".--", "W");
        morseDictionary.put("-..-", "X");
        morseDictionary.put("-.--", "Y");
        morseDictionary.put("--..", "Z");
        morseDictionary.put(".----", "1");
        morseDictionary.put("..---", "2");
        morseDictionary.put("...--", "3");
        morseDictionary.put("....-", "4");
        morseDictionary.put(".....", "5");
        morseDictionary.put("-....", "6");
        morseDictionary.put("--...", "7");
        morseDictionary.put("---..", "8");
        morseDictionary.put("----.", "9");
        morseDictionary.put("-----", "0");
        morseDictionary.put("", " ");
    }

    public static void main(String[] args) {
        SpringApplication.run(Exercicio2Application.class, args);
    }

    @GetMapping("/morse")
    public String morse(@RequestParam(value = "code", defaultValue = ".-") String code) {
        String message = convertToAlphabet(code);

        return String.format("%s = %s", code, message);
    }

    public String convertToAlphabet(String code) {
        StringBuilder sb = new StringBuilder();

        String codeReplaced = code.replace("   ", "  ");

        Arrays.stream(codeReplaced.split(" ")).forEach(cd -> {
            System.out.println(cd);

            sb.append(morseDictionary.get(cd));
        });

        return sb.toString();
    }
}
