# Step-3
1. <strong>Init</strong> :
 - `cube[][][]` : 3차원 큐브
 - `total_cmd` : 전체 명령어
 - `cmd[]`: 사용될 명령어
 - `number`: 명령 실행 횟수 카운트
 - `flag` : `Mix` 메소드가 실행됬는지 확인하는 변수
 - `startTime` : 시작시간
2. `view(cube);` 초기 큐브의 형태를 보여줌
3. /반복문 실행/
4. 명령어 입력
 - 정방향 : F,R,U,B,L,D
 - 역방향 : F',R',U',B',L',D'
 - 2번 회전: 방향 + 2
 - ex)UFLD'R2
5. `if(total_cmd.equals("Q")) break;` : 명령어가 'Q'일 경우 종료
6. `else if(total_cmd.equals("Mix"))` : 명령가 Mix일 경우 큐브를 무작위로 섞음
7. 큐브 동작
 - 명령어를 분할하여  `cmd[]`에 입력받아 사용
 - `number` 에서는 명령어 실행 횟수를 카운트함
 - `move(cube)`에서 해당 명령어를 실행시킴
8. `Mix` 메소드가 실행이 되었고 전체 면이 맞을 경우, 성공 축하 메세지 출력 후 종료
9. /반복문 종료/
10. 현재시간 - 종료시간을 계산하여 경과시간 출력
11. 조작갯수 `number` 출력
12. `"이용해주셔서서 감사합니다. 뚜뚜뚜.");` 출력

## Main turn 메소드 참고 표
 - <strong> Main turn 는 면만을 회전시키는 방법으로, 연관되는 면의 경우 sub turn로 추가 실행이 필요하다. </strong>

||0|1|2|
|:---:|:---:|:---:|:---:|
|0|0,0|0,1|0,2|
|1|1,0|1,1|1,2|
|2|2,0|2,1|2,2|

1. 시계방향(cw) 회전: (0,0)→(0,1)→(0,2)→(1,2)→(2,2)→(2,1)→(2,0)→(1,0)→(0,0) 
```java
for(int i=0;i<3;i++){
			for(int j=0;j<3;j++) cube[n][j][2-i] = temp[i][j];
		}
````
2. 반시계방향(ccw) 회전: (0,0)←(0,1)←(0,2)←(1,2)←(2,2)←(2,1)←(2,0)←(1,0)←(0,0) 
```java
for(int i=0;i<3;i++){
			for(int j=0;j<3;j++) cube[n][2-j][i] = temp[i][j];
		}
````
## Sub turn 메소드 참고표
 1. 첨부 파일 "Sub_turn 참고표.png" 참고
 2. 앞의 Main-side가 회전 시, 그에 연관되는 좌측의 sub-side가 회전
 ---
 - 시계방향(cw) 회전:  U : L→B→R→F→L 순으로 데이터가 아래로 이동

```java
U에 대한 sub_turn(cw)
for(int i=0;i<6;i++){
			for(int j=0;j<3;j++){
				if(i==1) cube[4][0][j] = temp[i][0][j];
				else if(i==2) cube[1][0][j] = temp[i][0][j];
				else if(i==3) cube[2][0][j] = temp[i][0][j];
				else if(i==4) cube[3][0][j] = temp[i][0][j];
			}
		}
```

  - 반시계방향회전(ccw) 회전: U: L←B←R←F←L 순으로 데이터가 위로 이동
```java
U에 대한 sub_turn(ccw)
for(int i=0;i<6;i++){
			for(int j=0;j<3;j++){
				if(i==1) cube[2][0][j] = temp[i][0][j];
				else if(i==2) cube[3][0][j] = temp[i][0][j];
				else if(i==3) cube[4][0][j] = temp[i][0][j];
				else if(i==4) cube[1][0][j] = temp[i][0][j];
			}
		}
```

 