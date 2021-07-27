package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {

    StringCalculator cal;
    @BeforeEach
    void setup(){
        cal = new StringCalculator("1 - 2");
    }

    @Test
    void numTest(){
        assertThat(cal.getNumString()).contains("1","+","2");
    }

    @Test
    void splitTest(){
        cal.splitNum();
        assertThat(cal.getNumArr()).contains("1","+","2");
    }

    @ParameterizedTest
    @CsvSource(value = {"1:1", "2:2", "3:3","4:+"}, delimiter = ':')
    void parseNumberTest(String input, int expected){
        assertThat(cal.parseNumber(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource(value = {"1 + 2:3", "2 - 1:1", "3 * 4:12","12 / 4:3", "2 + 3 * 4 / 2:10"}, delimiter = ':')
    void calculateTest(String input, int expected){
        cal.setNumString(input);
        cal.splitNum();
        assertThat(cal.calculate()).isEqualTo(expected);
    }




}
