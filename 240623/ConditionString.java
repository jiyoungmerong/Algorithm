class ConditionString {
    public int solution(String ineq, String eq, int n, int m) {
        return (">".equals(ineq) ? n > m : n < m) || ("=".equals(eq) ? n == m : false) ? 1 : 0;
    }
}
