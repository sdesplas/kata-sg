package com.desplas.foobarquix.api.services;

import org.springframework.stereotype.Service;

@Service
public class FooBarQuixEngineService {

    private final static String FOO = "FOO";
    private final static String BAR = "BAR";
    private final static String QUIX = "QUIX";

    public String transform(int input) {
        StringBuilder result = new StringBuilder();
        String numberStr = String.valueOf(input);

        boolean divisibleBy3 = (input % 3 == 0);
        boolean divisibleBy5 = (input % 5 == 0);

        // RDG-006 : la règle "divisible par" est plus prioritaire que la règle "contient"
        // RDG-001 : si le nombre est divisible par 3, la chaîne  de characters doit contenir "FOO"
        if (divisibleBy3) {
            result.append(FOO);
        }

        // RDG-002 : si le nombre est divisible par 5, la chaîne de characters doit contenir "BAR"
        if (divisibleBy5) {
            result.append(BAR);
        }

        for (char c : numberStr.toCharArray()) {
            if (c == '3') {
                // RDG-004 : si le nombre contient 3, la chaîne de characters doit contenir "FOO"
                result.append(FOO);
            } else if (c == '5') {
                // RDG-005 : si le nombre contient 5, la chaîne de characters doit contenir "BAR"
                result.append(BAR);
            } else if (c == '7') {
                // RDG-003 : si le nombre contient 7, la chaîne de characters doit contenir "QUIX"
                result.append(QUIX);
            }
        }

        // RDG-007 : Si aucune des règles n'est vérifiée, retourner la nombre en entrée sous forme de chaîne de characters
        if (result.length() == 0) {
            result.append(numberStr);
        }

        return result.toString();
    }
}
