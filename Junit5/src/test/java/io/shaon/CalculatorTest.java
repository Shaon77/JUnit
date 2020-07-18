package io.shaon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CalculatorTest {
    private Calculator calculator;

    @Mock
    private CalculatorService calculatorService;


    @BeforeEach
    void setCalculator(){
        this.calculator = new Calculator();
//        this.calculatorService = Mockito.mock(CalculatorService.class);
        this.calculator.setCalculatorService(this.calculatorService);

    }

    @Test
    void testPerform()
    {
        when(this.calculatorService.add(2, 3)).thenReturn(5);
        assertEquals(10, this.calculator.perform(2, 3));
    }
}
