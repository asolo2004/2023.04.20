import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSubstringFind {
    @Test
    public void test1(){
        assertEquals(2, SubstringFind.find("аб","абвгабвг"));
    }
    @Test
    public void test2(){
        assertEquals(2, SubstringFind.find("стс","стстсап"));
    }
    @Test
    public void test3(){
        assertEquals(1, SubstringFind.find(".","a."));
    }
    @Test
    public void test4(){
        assertEquals(2, SubstringFind.find("a\n","a\na\n"));
    }
}
