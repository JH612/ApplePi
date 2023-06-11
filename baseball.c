#include <stdio.h>
#include  <time.h>
int main() {

	int Q[3], A[3], i, j, k, strike=0, ball=0;

	srand(time(NULL));
	Q[0] = rand() % 9 + 1;
	Q[1] = rand() % 9 + 1;
	Q[2] = rand() % 9 + 1;

	for (i = 0;i < 10 ;i++) {
		scanf_s("%d %d %d", &A[0], &A[1], &A[2]);

		for (j = 0;j < 3;j++) {
			for (k = 0;k < 3;k++) {
				if (Q[j] == A[j]) {
					strike++;
				}
				if (Q[j]==A[k]) {
					ball++;
				}
			}
		}

		printf("strike : %d, ball : %d\n", strike, ball);
		if (strike == 3) {
			printf("정답입니다!");
			break;
		}

	}

}