import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringUtilsTest {
    @Test
    void splitTest() {
        String str = "//r\n1r2r36";
        String[] split = StringUtils.splitString(str);
        assertThat(split).containsExactly("1","2","36");
    }

    @Test
    void wholeLetterTest() {
        String str = "12343";
        String[] split = StringUtils.splitString(str);
        assertThat(split).containsExactly(str);
    }

    @Test
    void basicSplitTest() {
        String str = "1:2,3";
        String[] split = StringUtils.splitString(str);
        assertThat(split).containsExactly("1","2","3");
    }
}
