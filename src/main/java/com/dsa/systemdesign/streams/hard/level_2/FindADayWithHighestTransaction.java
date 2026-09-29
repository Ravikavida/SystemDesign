package com.dsa.systemdesign.streams.hard.level_2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindADayWithHighestTransaction {

    public static void main(String[] args) {

        List<Transaction> transactionList = Arrays.asList(
                new Transaction("T1", LocalDate.of(2026,3,18),500),
                new Transaction("T2", LocalDate.of(2026,5,19),600),
                new Transaction("T3", LocalDate.of(2026,3,18),900),
                new Transaction("T4", LocalDate.of(2026,6,10),800)
        );

        Optional<Map.Entry<LocalDate, Double>> result = transactionList.stream().collect(Collectors.groupingBy(Transaction::getLocalDate,Collectors.summingDouble(Transaction::getSpent)))
                .entrySet().stream().max(Map.Entry.comparingByValue());

        System.out.println(result.get());
    }
}
