public class Thousands{
	public static void main(String[] args) {
		
		int N = 1000;
		int M = 3;

		// 建立布尔型的数组，长度为总人数
		Boolean rs[] = new Boolean[N];

		// 初始化布尔型数组，初始值均为true
		for (int i = 0; i < N; i++) {
			rs[i] = true;
		}

		int n = 1000;// 剩余的人数
		int m = 0;// 报数的编号

		while (n > 1) {
			for (int j = 0; j < N; j++) {
				if (rs[j]) {
					m++;
					if (m == M) {
						m = 0;
						rs[j] = false;
						n--;
						
					}

				}

			}

		}

		// 打印出最后留下来的人员的编号
		for (int k = 0; k < 1000; k++) {
			if (rs[k]) {
				System.out.println("最后剩下的是" + (k + 1) + "号。");
				break;

			}
		}

	}
}