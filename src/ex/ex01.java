package ex;
/*
 * Topic: 輸入一整數 N 及 N 個整數，請依照十進位中各位數字和由小到大排序輸出。如果各位數字和相等則比較數值由小到大排列。
 例如: 9122 的各位數字和為 9+1+2+2=14、3128 的各位數字和為 3+1+2+8=14 而 5112 的各位數字和為 5+1+1+2=9。
 所以輸入 9122 3128 5112 需輸出 5112 3128 9122 ，這是因為 5112(9) < 3128(14) < 9122(14)，其中又因為 3128 與 9122 兩者的各位數字和都是 14，所以將 數值小的 3128 放前面。則經由計算可得其識別碼為 165 ，乃是 11 之倍數，故此為一合法之 ISBN 碼。輸入一串 ISBN 碼，以空格隔開。
 * Date: 2016/12/26
 * Author: 1050210XX 周永振老師
 */

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int var = scn.nextInt();
		int[] data = new int[var];
		for(int i=0;i<var;i++){
			data[i] = scn.nextInt();
			if(data[i]>=10000 && data[i]<=999){
				System.out.println("不合法的輸入 請重新輸入");
				i--;
			}
		}
		int[] data1 = new int[var];
		int[] data_ch = new int[var];
		for(int i=0;i<var;i++){
			data1[i] = data[i];
		}
		for(int i=0;i<var;i++){
			for(int j=0;j<=3;j++){
				data_ch[i] = data_ch[i] + data[i]%10;
				data[i] /= 10;
			}
		}
		int stop;
		for(int i=0;i<var-1;i++){
			for(int j=0;j<var-i-1;j++){
				if(data_ch[j]>data_ch[j+1]){
					stop = data_ch[j];
					data_ch[j] = data_ch[j+1];
					data_ch[j+1] = stop;
					stop = data1[j];
					data1[j] = data1[j+1];
					data1[j+1] = stop;
				}
			}
		}
		for(int i=0;i<var-1;i++){
			for(int j=0;j<var-i-1;j++){
				if(data_ch[j] == data_ch[j+1]){
					if(data1[j]>data1[j+1]){
						stop = data1[j];
						data1[j] = data1[j+1];
						data1[j+1] = stop;
					}
				}
			}
		}
		for(int i=0;i<var;i++){
			System.out.print(data1[i] + " ");
		}
	}

}
