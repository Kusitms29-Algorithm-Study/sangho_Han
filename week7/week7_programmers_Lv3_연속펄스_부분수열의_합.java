package week7;

class week7_programmers_Lv3_연속펄스_부분수열의_합 {
    public long solution(int[] sequence) {
        long answer = 0;
        boolean isPlus = true;

        long purse1 = 0; // 양수부터 시작
        long purse2 = 0; // 음수부터 시작

        for (int num : sequence) {
            purse1 += isPlus ? num : -num;
            purse2 += isPlus ? -num : num;

            purse1 = Math.max(0, purse1);
            purse2 = Math.max(0, purse2);

            answer = Math.max(answer, Math.max(purse1, purse2));

            isPlus = !isPlus;
        }

        return answer;
    }
}