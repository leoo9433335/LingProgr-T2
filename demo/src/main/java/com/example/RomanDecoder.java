package com.example;
import java.util.List;
import java.util.stream.Collectors;

public class RomanDecoder extends RomanBaseVisitor<Integer> {

/*************  ✨ Windsurf Command ⭐  *************/
/*******  da2d06bb-9e5e-4634-ba78-da0b20234a86  *******/
    
private static int sum(List<Integer> nums) {
    if (nums == null || nums.isEmpty()) return 0;

    // Validação 1: não mais que 3 repetições seguidas do mesmo valor
    int repeatCount = 1;
    for (int i = 1; i < nums.size(); i++) {
        if (nums.get(i).equals(nums.get(i - 1))) {
            repeatCount++;
            if (repeatCount > 3) {
                throw new IllegalArgumentException("Número romano inválido: mais de 3 repetições seguidas.");
            }
        } else {
            repeatCount = 1;
        }
    }

    // Validação 2: subtrações inválidas (ex: I antes de L ou C)
    for (int i = 0; i < nums.size() - 1; i++) {
        int current = nums.get(i);
        int next = nums.get(i + 1);
        if (current < next && (current * 10 < next)) {
            throw new IllegalArgumentException("Número romano inválido: subtração não permitida.");
        }
    }

    // Cálculo conforme seu algoritmo original
    int sum = nums.get(nums.size() - 1);
    for (int i = 0; i < nums.size() - 1; i++) {
        int current = nums.get(i);
        int next = nums.get(i + 1);
        if (current < next) {
            sum -= current;
        } else {
            sum += current;
        }
    }

    return sum;
}

    @Override
    public Integer visitRoot(RomanParser.RootContext ctx) {
        return sum(ctx.children.stream().map(this::visit).collect(Collectors.toList()));
    }

    @Override public Integer visitUnits(RomanParser.UnitsContext ctx) { return sum(ctx.children.stream().map(this::visit).collect(Collectors.toList())); }
    @Override public Integer visitTens(RomanParser.TensContext ctx) { return sum(ctx.children.stream().map(this::visit).collect(Collectors.toList())); }
    @Override public Integer visitHundreds(RomanParser.HundredsContext ctx) { return sum(ctx.children.stream().map(this::visit).collect(Collectors.toList())); }

    @Override public Integer visitOne(RomanParser.OneContext ctx) { return 1; }
    @Override public Integer visitFive(RomanParser.FiveContext ctx) { return 5; }
    @Override public Integer visitTen(RomanParser.TenContext ctx) { return 10; }
    @Override public Integer visitFifty(RomanParser.FiftyContext ctx) { return 50; }
    @Override public Integer visitOneHundred(RomanParser.OneHundredContext ctx) { return 100; }
    @Override public Integer visitFiveHundred(RomanParser.FiveHundredContext ctx) { return 500; }
    @Override public Integer visitOneThousand(RomanParser.OneThousandContext ctx) { return 1000; }
}