package string.manipulations;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SplitClustersTest {

    SplitClusters splitParentheses = new SplitClusters();

    @Test
    public void test1() {
        assertArrayEquals((new String[]{"()", "()", "()"}), splitParentheses.splitParenthesesClusters("()()()"));
    }

    @Test
    public void test2() {
        assertArrayEquals((new String[]{}), splitParentheses.splitParenthesesClusters(""));
    }

    @Test
    public void test3() {
        assertArrayEquals((new String[]{"()", "()", "(())"}), splitParentheses.splitParenthesesClusters("()()(())"));
    }

    @Test
    public void test4() {
        assertArrayEquals((new String[]{"(())", "(())"}), splitParentheses.splitParenthesesClusters("(())(())"));
    }

    @Test
    public void test5() {
        assertArrayEquals((new String[]{"((()))"}), splitParentheses.splitParenthesesClusters("((()))"));
    }

    @Test
    public void test6() {
        assertArrayEquals((new String[]{"()", "(((((((((())))))))))"}), splitParentheses.splitParenthesesClusters("()(((((((((())))))))))"));
    }

    @Test
    public void test7() {
        assertArrayEquals((new String[]{"((())()(()))", "(()(())())", "(()())"}), splitParentheses.splitParenthesesClusters("((())()(()))(()(())())(()())"));
    }

    @Test
    public void test8() {
        assertArrayEquals((new String[]{"((()))", "(())", "()", "()", "(()())"}), splitParentheses.splitParenthesesClusters("((()))(())()()(()())"));
    }

    @Test
    public void test9() {
        assertArrayEquals((new String[]{"((())())", "(()(()()))"}), splitParentheses.splitParenthesesClusters("((())())(()(()()))"));
    }

    @Test
    public void test10() {
        assertArrayEquals((new String[]{"(()(()()))", "()", "(((()))()(()))", "(()((()))(())())"}), splitParentheses.splitParenthesesClusters("(()(()()))()(((()))()(()))(()((()))(())())"));
    }
}