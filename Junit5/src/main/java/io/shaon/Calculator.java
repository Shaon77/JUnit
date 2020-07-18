package io.shaon;

public class Calculator {
    private CalculatorService calculatorService;

    public void setCalculatorService(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public int perform(int a, int b){
        return this.calculatorService.add(a, b) * a;
    }
}
