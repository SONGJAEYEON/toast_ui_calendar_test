package com.review.test;

public class TEST {

	public static void main(String[] args) {
//      //트리 어떻게 하는지 다 까먹었네^^
//      int n=3;
//      int[] binaryTree = new int[(int)Math.pow(2, n)];
//      //아 완전 이진트리의 개수는 저만큼이니까 애초에 픽스를 박아버리는구만!
//      ArrayList<Integer> ans=new ArrayList<Integer>();
//      
//      binaryTree[1] = 0;
//         for(int i = 1 ; i < (int) Math.pow(2, n - 1) ; ++i) {
//            binaryTree[i * 2] = 0;
//            binaryTree[i * 2 + 1] = 1;
//         }
//       
//         inOrder(binaryTree, 1, ans);
////         
//         int[] answer = new int[ans.size()];
//         for(int i = 0 ; i < answer.length ; ++i) {
//            answer[i] = ans.get(i);
//         }
////         
//         System.out.println(Arrays.toString(answer));
//
//   }
////   2 
////   4
//   public static void inOrder(int[] binaryTree,int idx,ArrayList<Integer> ans) {
//      if(idx*2<binaryTree.length) {
//         inOrder(binaryTree,idx*2,ans);
//         ans.add(binaryTree[idx]);
//      }
//      if(idx*2+1<binaryTree.length) {
//         inOrder(binaryTree, idx * 2 + 1, ans);
//      }
   //재귀어려워,,,
   //
   
   
   //////////////인생,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,
   ///하,,,,,,,,,,,,,,,,,,,
   ///////////네////......................
   //코테!! 
   //근데 분명 나 예전에 비슷한문제풀었던거같은데,,,
   // 진짜 못풀게뜸,,,,ㅎ,,,,,(자괴감,,,)
   /// 되는일이없니~~~~~~~~~~~~ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ
   
   //초기  (0+length)/2=7 초기 기준 
   //종료조건 어떻게 잡을까?
   
   //ans[7]=0 dd
   //(0+(7-1))/2=3 ans[3]=0 ddㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴ
      //(0+(3-1))/2=1 ans[1]=0ㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴ
         //(0+(1-1))/2=0 ans[0]=0ㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴ
         //((1+1)+(3-1))/2 =2 ans[2]=1
      //((3+1)+(7-1))/2=5 ans[5]=1
         //((3+1)+(5-1))/2=4  ans[4]=0 
         //((5+1)/(7-1))/2=6  ans[6]=1
   //((7+1)+14)/2 =22/2=11 ans[11]=1ㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴ
      //((7+1)+(11-1))/2=9  ans[9]=0ㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴ
            //((7+1)+(9-1))/2 =8  ans[8]=0
            //((9+1)+(11-1))/2 =10 ans[10]=1
      //((11+1)+15)/2=13 ans[13]=1
            //((11+1)+(13-1))/2 ans[12]=0
            //((13+1)+15)/2=14 ans[14]=1
   
   //왼쪽
   //((첫 출발)+(직전 기준-1))/2=값    ans[값]=0
   //오른쪽
   //((직전기준+1)+(전전 기준?))/2 =값   ans[값]=1
		
//처음부터 생각해보자

		//왼쪽
		
//중간
		
//오른쪽
//왼쪽		
//(0+(7-1))/2=3 ans[3]=0 dd
//(첫출발)+(중간지점-1)/2 = 3(결과) ans[3]=0 왼쪽이니까 0 
		//((첫출발)+(이전결과-1))/2=1 ans[1]=0 왼쪽이니까 0 
		//((7+1)+(11-1))/2=9  ans[9]=0
		//((왼쪽기준+1)+(오른쪽기준-1))/2=9 ans[9]= 왼쪽이니까0
			//(0+(1-1))/2=0 ans[0]=0
		 		//((첫출발)+(0-1))/2=-1 음수가 나와버리네? 그럼 그냥 return 0;
//오른쪽
//((7+1)+15)/2 =23/2=11 ans[11]=1
//((기준점+1)+마지막)/2=22/2=11 ans[11]=1
		//(기준점



   //0   4  0
   //1   3  0
   //2   4  1
   //3   2  0
   //4   4  0
   //5   3  1
   //6   4  1
   //7   1  0
   //8   4  0
   //9   3  0
   //10  4  1
   //11  2  1
   //12  4  0
   //13  3  1
   //14  4  1
		
	}
	public static void left() {
		
	}
	public static void right() {
		
	}

}