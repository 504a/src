package question;

public class Q9 {
    public static void main(String[] args) {
        int sum = 0;//合計の初期値
        int v = 3;
        System.out.println("------------while------------");
        while (sum < 1000) {
            sum += v;
            System.out.println("sum:value:" + sum + ":" + v);
            v += 3;
        }
        v -= 3;//誤差修正
        System.out.println("sum:value:" + sum + ":" + v);

        System.out.println("------------for------------");
        sum = 0;
        for (int i = 3; sum < 1000 ; i+=3) {
            sum += i;
            System.out.println("sum:value:" + sum + ":" + i);
        }
        //コンパイルエラー
        //System.out.println("sum:value:" + sum + ":" + i);
    }
}
