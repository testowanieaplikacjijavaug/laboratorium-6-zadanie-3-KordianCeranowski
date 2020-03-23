import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class FractionAssertJTest {

    @Test
    @DisplayName("Concat Test")
    @ParameterizedTest(name = "Checking if {0}/{1} + {2}/{3} = {4}/{5}")
    @CsvSource({
            "1, 2, 1, 2, 1, 1"
    })
    void test(int a, int b, int c, int d, int e, int f) {
        final Fraction actual = Fraction.of(a, b).add(Fraction.of(c, d));
        assertThat(actual, is(Fraction.of(e, f)));
    }

}
