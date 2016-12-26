package ex;
/*
 * Topic: OX 遊戲是大家小時候的童年記憶，甚至在長大後，無聊時還是會玩一下呢 ! 但當你一個人時，是否也能讓電腦跟你玩呢 ?
 * Date: 2016/12/26
 * Author: 1050210XX 周永振老師
 */

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int[][] var = new int[3][3];
		boolean flag=false;
		int tal=0;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				var[i][j] = scn.nextInt();
			}
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				tal += var[i][j];
			}
			if(tal==0 || tal == 3 && flag == false){
				System.out.println("True");
				flag=true;
			}
			tal=0;
			for(int j=0;j<3;j++){
				tal += var[j][i];
			}
			if(tal==0 || tal == 3 && flag == false){
				System.out.println("True");
				flag=true;
			}
			tal=0;
		}
		tal += var[0][0] + var[1][1] + var[2][2];
		if(tal==0 || tal == 3 && flag == false){
			System.out.println("True");
			flag=true;
		}
		tal=0;
		tal += var[0][2] + var[1][1] + var[2][0];
		if(tal==0 || tal == 3 && flag == false){
			System.out.println("True");
			flag=true;
		}
		if(flag==false){
			System.out.println("False");
		}
	}

}
