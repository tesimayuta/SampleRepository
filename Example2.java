package sample;

import java.awt.Point;

    public class Example2 {
        public static void main(String[] args) {
            // Pointクラスのインスタンスを生成
            Point p = new Point(3, 4);

            // インスタンス変数 x と y の値を取得
            int x = p.x;
            int y = p.y;

            // インスタンス変数 x と y の値を出力
            System.out.println("The value of p.x is: " + x);
            System.out.println("The value of p.y is: " + y);
        }
    }