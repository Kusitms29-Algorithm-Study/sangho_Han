package week3;

class week3_programmers_Lv3_최고의집합 {
    public int[] solution(int n, int s) {
        if (n > s) return new int[]{-1};

        int[] answer = new int[n];

        for (int i = n; i > 0; i--) {
            int cur = (s / i);
            answer[n - i] = cur;
            s -= cur;
        }

        return answer;
    }
}