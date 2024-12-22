package string.manipulations;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SplitClustersTest {

    @Test
    public void test1() {
        SplitClusters splitParentheses = new SplitClusters();
        assertArrayEquals((new String[]{"()", "()", "()"}), splitParentheses.splitParenthesesClusters("()()()"));
    }

    @Test
    public void test2() {
        SplitClusters splitParentheses = new SplitClusters();
        assertArrayEquals((new String[]{}), splitParentheses.splitParenthesesClusters(""));
    }

    @Test
    public void test3() {
        SplitClusters splitParentheses = new SplitClusters();
        assertArrayEquals((new String[]{"()", "()", "(())"}), splitParentheses.splitParenthesesClusters("()()(())"));
    }

    @Test
    public void test4() {
        SplitClusters splitParentheses = new SplitClusters();
        assertArrayEquals((new String[]{"(())", "(())"}), splitParentheses.splitParenthesesClusters("(())(())"));
    }

    @Test
    public void test5() {
        SplitClusters splitParentheses = new SplitClusters();
        assertArrayEquals((new String[]{"((()))"}), splitParentheses.splitParenthesesClusters("((()))"));
    }

    @Test
    public void test6() {
        SplitClusters splitParentheses = new SplitClusters();
        assertArrayEquals((new String[]{"()", "(((((((((())))))))))"}), splitParentheses.splitParenthesesClusters("()(((((((((())))))))))"));
    }

    @Test
    public void test7() {
        SplitClusters splitParentheses = new SplitClusters();
        assertArrayEquals((new String[]{"((())()(()))", "(()(())())", "(()())"}), splitParentheses.splitParenthesesClusters("((())()(()))(()(())())(()())"));
    }

    @Test
    public void test8() {
        SplitClusters splitParentheses = new SplitClusters();
        assertArrayEquals((new String[]{"((()))", "(())", "()", "()", "(()())"}), splitParentheses.splitParenthesesClusters("((()))(())()()(()())"));
    }

    @Test
    public void test9() {
        SplitClusters splitParentheses = new SplitClusters();
        assertArrayEquals((new String[]{"((())())", "(()(()()))"}), splitParentheses.splitParenthesesClusters("((())())(()(()()))"));
    }

    @Test
    public void test10() {
        SplitClusters splitParentheses = new SplitClusters();
        assertArrayEquals((new String[]{"(()(()()))", "()", "(((()))()(()))", "(()((()))(())())"}), splitParentheses.splitParenthesesClusters("(()(()()))()(((()))()(()))(()((()))(())())"));
    }
}