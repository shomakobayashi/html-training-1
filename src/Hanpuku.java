import java.util.Scanner;

public class Hanpuku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. 生徒の数 N を入力
        int N = sc.nextInt();
        
        // 2. 記録を格納する配列を作成
        int[] records = new int[N];
        
        // 3. 生徒の記録を入力
        for (int i = 0; i < N; i++) {
            records[i] = sc.nextInt();
        }
        
        // 4. 各生徒の順位を計算して出力
        for (int i = 0; i < N; i++) {
            int rank = 1;  // 自分より上の記録の人数をカウント
            for (int j = 0; j < N; j++) {
                if (records[j] > records[i]) {
                    rank++;
                }
            }
            System.out.println(rank);
        }
    }
}