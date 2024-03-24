package week4;

class week4_programmers_Lv3_거스름돈{
    private static final int MOD = 1_000_000_007;

    public int solution(int n, int[] money) {
        int[] answer = new int[100001];
        answer[0] = 1;

        for (int i : money) {
            for (int j = i; j <= n; j++) {
                answer[j] += answer[j - i];
            }
        }

        return answer[n] % MOD;
    }
}
