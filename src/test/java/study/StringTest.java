package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {


    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split(){

        String[] arr = new String[2];
        String[] x = "1,2".split(",");
        assertThat(x).containsExactly("1", "2");
//        assertThat(x).isEqualTo(arr);

    }

    @Test
    void substring(){
//        String[] arr = new String[2];
        String x = "(1,2)".substring(1,4);
        assertThat(x).isEqualTo("1,2");
    }

    @Test
    @DisplayName("Exception Boundary Tests")
    void testCharAtExceptions(){

        assertThatThrownBy(() -> {
            char x = "abc".charAt(3);
            assertThat(x).isEqualTo('d');

        }).isInstanceOf(StringIndexOutOfBoundsException.class).hasMessageContaining("String index out of range: 2");

    }


}
