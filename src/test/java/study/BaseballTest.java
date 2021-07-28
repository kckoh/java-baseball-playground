package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class BaseballTest {
    Baseball baseball;
    @BeforeEach
    void setUp() {
        baseball = new Baseball();
    }

    @Test
    void getRandomTest(){
        assertThat(baseball.getTarget()).isEqualTo("123");
    }

    @Test
    void equalsGuessTargetTest(){
        assertThat(baseball.equalsGuessTarget('a', 'b')).isEqualTo(0);
        assertThat(baseball.equalsGuessTarget('a', 'a')).isEqualTo(1);
    }

    @Test
    void strikeTest(){
        baseball.setTarget("123");
        assertThat(baseball.strike("123")).isEqualTo(3);
        assertThat(baseball.strike("143")).isEqualTo(2);
        assertThat(baseball.strike("135")).isEqualTo(1);
        assertThat(baseball.strike("321")).isEqualTo(0);
    }

    @Test
    void ballTest(){
        baseball.setTarget("123");
        assertThat(baseball.ball("231")).isEqualTo(3);
        assertThat(baseball.ball("235")).isEqualTo(2);
        assertThat(baseball.ball("451")).isEqualTo(1);
        assertThat(baseball.ball("456")).isEqualTo(0);
    }



//
//    @Test
//    void testSize(){
//        int size = numbers.size();
//        assertThat(size).isEqualTo(3);
//    }
//
//    @ParameterizedTest
//    @ValueSource(ints ={1,2,3} )
//    void contains(int args){
//        assertThat(numbers.contains(args)).isTrue();
//
//    }
//
//
//    @ParameterizedTest
//    @CsvSource(value = {"1:true", "2:true", "3:true", "4:false","5:false"}, delimiter = ':')
//    void containsTest(int input, boolean expected){
//        assertThat(numbers.contains(input)).isEqualTo(expected);
//    }

}
