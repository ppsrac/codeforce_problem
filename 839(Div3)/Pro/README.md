# A. A+B?

당신에게는 0과 9사이 정수 $a,b$에 대해 $a+b$ 형태가 주어져 있다. 당신은 이를 계산하고 출력해야 한다. 

** 입력 **

첫번째 줄은 테스트 케이스 수 $t$이다. $(1\leq t\leq 100)$

각 테스트 케이스는 $a+b$형태의 한줄로 구성되어 있다. $(0\leq a,b\leq 9)$. 어떤 정수든 '+' 기호에 의해 분리된 것이 없다.

** 출력 **

각 케이스마다 식을 계산한 값을 출력하라. 

예시
```
\\input
4
4+2
0+0
3+7
8+9
\\output
6
0
10
17
```

# B. 행렬 회전(Matrix Rotation)

당신에게는 서로 다른 정수 원소로 채워진 $2\times 2$ 행렬이 있다. 당신은 이 행렬을 아름답게 만들고 싶다. 다음 두 조건을 만족하는 행렬을 아름다운 행렬이라고 한다. 
* 각 행마다 첫번째 원소가 두번째 원소보다 큰 경우
* 각 열마다 첫번째 원소가 두번째 원소보다 큰 경우

![](201.png)

당신은 이 행렬을 원하는 횟수만큼 시계방향으로 회전할 수 있다. 왼쪽 아래 원소는 왼쪽 위로 왼쪽 위 원소는 오른쪽 위로 오른쪽 위 원소는 오른쪽 아래의 원소로, 오른쪽 아래의 원소는 왼쪽 아래의 원소로 이동시킬 수 있다. 

![](202.png)

어느 행렬이 주어질 때 0번 혹은 그 이상의 회전을 시켜 아름답게 만들 수 있는지 판단하라. 

** 입력 **

첫번째 줄은 테스트 케이스 수 $t$이다. $(1\leq t\leq 1000)$

각 테스트 케이스는 두 줄로 구성되어 있으며 각 줄은 2개의 원소로 행렬의 각 행의 원소를 의미한다. 각 행렬에 들어가는 4개의 수는 모두 1\~100사이 수이다.

** 출력 **

각 케이스마다 행렬을 이쁘게 만들 수 있으면 `YES`라 출력하고 아니면 `NO`라 출력하라. 출력할 때 `YES`와 `NO`의 대소문자 여부는 정답에 영향을 주지 않는다. (`YES, Yes, yes`모두 긍정의 답으로 인식되며 `No,nO`는 모두 부정의 답으로 인식된다. )

예시

```
\\input
6
1 3
5 7
8 10
3 4
8 10
4 3
6 1
9 2
7 5
4 2
1 2
4 3
\\output
YES
YES
NO
YES
YES
NO
```

# C. 다른 차이들(Different Differences)

$k$개의 정수로 이루어진 행렬 $a$의 원소가 $a_{1}<a_{2}<...<a_{k}$를 만족하면 '강증가'라고 하자. 예를 들어 $[1,3,5],[1,2,3,4],[3,5,6]$은 강증가 하고 $[2,2],[3,7,5],[7,4,3],[1,2,3,3]$은 강증가 하지 않는다. 

$k$개의 정수로 이루어진 행렬 $a$에 대해 행렬 $a$의 '특징'을 행렬 $[a_{2}-a_{1},a_{3}-a_{2}...,a_{k}-a_{k-1}]$의 서로 다른 값의 개수라 정의하자. 예를 들어 $[1,3,4,7,8]$은 $[2,1,3,3]$의 서로 다른 값의 개수가 3개이므로 특징이 3이다. 

당신에게는 정수 $k,n$이 주어진다. $(k\leq n)$ 1부터 $n$사이의 정수들로만 이루어진 길이 $k$의 가능한 가장 큰 특징을 가진 행렬을 출력하라. 

** 입력 **

첫번째 줄은 테스트 케이스 수 $t$이다. $(1\leq t\leq 819)$

각 테스트 케이스는 $k,n$으로 구성되어 있다. $(2\leq k\leq n\leq 40)$

** 출력 **

각 케이스마다 강증가하면서 1부터 $n$까지의 정수를 원소로 가지고 최대 특징을 가진 배열의 $k$개 원소를 한 줄에 출력하라. 만일 복수의 정답이 있으면 하나만 출력하라. 

예시
```
\\input
7
5 9
4 12
3 3
3 4
4 4
4 6
8 11
\\output
1 3 4 7 8
2 4 7 12
1 2 3
1 3 4
1 2 3 4
2 4 5 6
1 2 3 5 6 7 8 11
```

# D. 절대 정렬(Absolute sorting)

당신에게는 $n$개의 원소로 이루어진 행렬 $a$가 주어진다. 행렬은 그의 원소 $a_{1},a_{2},a_{3},...,a_{n}$이 $a_{1}\leq a_{2}\leq a_{3}\leq a_{4}...\leq a_{n}$인 경우 정렬되어 있다고 한다. 

당신은 다음에 적힌 연산을 단 한번만 수행하여 행렬 $a$를 정렬하고 싶다.
* 정수 $x$를 고르고 $[1,n]$의 모든 정수 $i$에 대해 $a_{i}$를 $|a_{i}-x|$로 교체한다. 

행렬을 정렬할 수 있는 $x$가 있으면 그를 찾고, 없으면 없다는 것을 알려라. 

** 입력 **

첫번째 줄은 테스트 케이스 수 $t$이다. $(1\leq t\leq 2\cdot 10^{4})$

각 테스트 케이스는 두 줄로 이루어져 있다. 첫 번째 줄은 행렬의 길이 $n$을 의미하고 $(2\leq n\leq 2\cdot 10^{5})$ 두 번째 줄은 각 행렬의 원소 $a_{1},a_{2},...a_{n}(1\leq a_{i} \leq 10^{8})$이다. 

추가로, 모든 테스트 케이스의 $n$의 합은 $2\cdot 10^{5}$를 넘지 않는다. 

** 출력 **

각 테스트 케이스에 대해 배열을 정렬하는 가능한 정수 $x$를 출력하라. $(0\leq x\leq 10^{9})$ 만일 그러한 정수가 존재하면 0과 $10^{9}$사이에도 $x$가 반드시 존재한다. 

만일 그러한 정수가 없으면 -1을 출력하라. 복수의 정답이 존재하면 그 중 하나만 출력하라. 

예시
```
\\input
8
5
5 3 3 3 5
4
5 3 4 5
8
1 2 3 4 5 6 7 8
6
10 5 4 3 2 1
3
3 3 1
3
42 43 42
2
100000000 99999999
6
29613295 52036613 75100585 78027446 81409090 73215
\\output
4
-1
0
42
2
-1
100000000
40741153
```

# E. 순열 게임(Permutation game)
 두 참가자가 게임을 하고 있다. 그들에게는 $1,2,3,...n$의 순열이 주어지고 증가하는 순서나 감소하는 순서로 배열되어 있지는 않다. 즉, $[1,2,...,n]$혹은 $[n,n-1,...,1]$으로 배열되어 있지 않다. 

 처음에 순열의 모든 원소는 빨간색으로 칠해져 있다. 참가자들은 각자의 차례가 되면 다음 세가지 중 한가지 행동을 취할 수 있다. 

 1. 빨갛게 칠해진 원소를 제외한 다른 원소들을 재배열한다.
 2. 빨갛게 칠해진 원소들 중 하나만 파란색으로 바꾼다. 
 3. 차례를 넘긴다.

만일 순열이 증가하는 순서 즉, $[1,2,...,n]$이 되면 처음 시작하는 참가자가 승리하고 감소하는 순서 즉, $[n,n-1,...,1]$이 되면 나중에 시작하는 참가자가 이긴다. 만일 $100^{500}$번 차례를 주고 받아도 승리한 사람이 없으면 비기게 된다.

당신은 만일 두 참가자가 최선의 수를 계속 둔다고 하였을 때 누가 이길지 혹은 비길지 판별하는 것이다. 

** 입력 **

첫번째 줄은 테스트 케이스 수 $t$이다. ($1\leq t\leq 10^{5}$)

각 케이스의 첫번째 줄은 순열의 크기 $n$을 나타낸다. 

각 케이스의 두번째 줄은 순열의 크기 $p_{1},p_{2},...p_{n}$을 담고 있다. 이 순열은 증가하는 순서로 있지도 감소하는 순서로 있지도 않는다. 

$n$의 총 합은 $3\times 10^{5}$를 넘지 않는다. 

** 출력 **

각 케이스에 대해 처음 시작하는 참가자가 이기면 'First', 나중 시작하는 참가자가 이기면 'Second'를 출력한다. 비기면 'Tie'를 출력한다.

<테스트 케이스>

```
//input
4
4
1 2 4 3
3
2 3 1
5
3 4 5 2 1
6
1 5 6 3 2 4

//output
First
Tie
Second
Tie
```

# F. 복사의 복사의 복사(Copy of a copy of a copy)

흑백 사진은 원소가 0과 1로만 이루어진 $n\times m$행렬이라고 생각할 수 있다. 각 행과 열은 각각 1부터 $n$까지 1부터 $m$으로 번호가 붙어져 있다. 

사진에는 한번에 두 가지 중 한 가지의 연산을 수행할 수 있다. 

* 가장자리에 있지 않은 원소 중 인접한 네 개의 원소가 모두 같은 색깔이고 자신과 다른 경우(만일 원소가 1이면 인접한 네 개 원소가 0이고 반대의 경우도 된다.)
* 사진의 인쇄본을 만든다.

연산의 순서는 임의대로이며 반드시 두 연산이 서로 번갈아 가며 진행해야 할 필요는 없다. 

당신은 이를 통해 $k$장의 사진을 추가로 얻게 될 것이다. 추가로 당신에게는 원본 사진도 주어져 있다. 그러나, 이 $k+1$장의 사진이 모두 섞여져 있다. (순서가 뒤죽박죽이다.)

연산의 순서를 기준으로 사진을 다시 배열하라. 만일 가능한 답이 여러가지라면 그 중 하나만 출력하여도 된다. 모든 테스트 케이스는 실제 연산의 나열을 통해 얻어낸 것으로 각 케이스마다 적어도 1개 이상의 답이 있음이 보장되어 있다.

** 입력 **

첫 번째 줄에는 각각 사진의 행과 열의 개수, 인쇄한 사진의 개수를 의미하는 $n,m,k$ ($3\leq m,n\leq 30, 0\leq k\leq 100$)가 주어진다.

그리고 인쇄된 사진 $k$장과 원본 사진을 포함해 $k+1$장의 사진이 주어진다. 이들의 순서는 임의대로 나열되어 있다. 

각 사진은 $m$개의 문자가 포함된 줄이 $n$개가 나열되어 있다. 각 사진이 주어지기 전에는 항상 빈 줄이 주어지는 것을 주의하라. 

** 출력 **

첫 번째 줄에는 원본 사진이 몇번째 줄에 있는지를 출력하라. <br/>
두 번째 줄에는 행한 연산 $q$의 개수를 출력하라.
<br/>
<br/>
다음 $q$줄동안은 각 줄마다 행한 연산에 대한 정보가 주어진다. 연산은 반드시 행한 순서에 따라 정렬되어 출력되어야 하고, 각 연산은<br/>

* $1\quad x\quad y\quad$ $(x,y)$의 색깔을 다시 칠한다. (이 원소는 사진의 $x$행의 $y$번째 원소이고 둘러싸인 이웃한 네 개의 칸은 반드시 색이 중앙의 색과 달라야 한다.)
* $2\quad i\quad$ 사진을 인쇄하고 $k+1$장 중 $i$번째 위치에 둔다. 1부터 $k+1$까지의 인덱스는 원본사진의 위치를 제외하고 반드시 1번씩 등장해야 한다.

만일, 복수의 정답이 있을 경우 그 중 아무거나 출력하라. 테스트 케이스는 실제 연산에 대해 만들어져 답이 항상 한 개 이상 있음은 보장되어 있다.

---
예시 케이스1
```
\\input
3 3 1

010
111
010

010
101
010
\\output
2
2
1 2 2
2 1
```
___
예시 케이스2
```
\\input
4 5 3

00000
01000
11100
01000

00000
01000
10100
01000

00000
01010
10100
01000

00000
01000
10100
01000

\\output
3
5
1 2 4
2 2
2 4
1 3 2
2 1
```
___
예시 케이스3
```
\\input
5 3 0

110
010
001
011
001

\\output
1
0
```

# G. 레이팅 올리기(Gaining Rating)

Monocarp는 유명한 체스 온라인 사이트에서 체스를 두고 있다. 그는 그와 체스를 둘 $n$명의 상대가 있다. $i$번째 상대의 레이팅을 $a_{i}$라 표기하자. Monocarp는 본인의 레이팅을 $x$에서 $y$로 올리고 싶어한다. 단, $y>x$이다. 

Monocarp가 상대 중 한명과 대련할 때 Monocarp는 자신과 <u>현재 </u>레이팅이 같거나 혹은 작은 상대랑 대련할 때 항상 이길것이다. (반대의 경우에는 항상 진다.) 만일 그가 이기면 레이팅이 1 오르고 그렇지 않으면 1 감소할 것이다.  그의 상대의 레이팅은 변하지 않는다. 

Monocarp는 그의 레이팅을 가능한 적은 횟수의 대련을 통해 $y$로 올리고 싶어한다. 그러나 단순히 그가 약한 상대만을 상대로 양학을 할 수는 없다.(본문은 he can't just grind it으로 적혀 있다. 직역하면 '상대를 갈아댈 수는 없어서') 웹사이트의 규칙상 Monocarp는 모든 적을 가능한 균일하게 상대해야 한다. 좀 더 풀어 말하면 만일 $i$와 다시 대련하고 싶다면 $i$보다 적게 대련한 상대 $j$가 없어야 한다는 뜻이다. 

Monocarp가 레이팅 $y$를 얻기 위해 필요한 최소 대련 횟수를 구하거나 레이팅 $y$를 얻는 것이 불가능함을 출력하라. Monocarp를 제외한 상대의 레이팅은 변하지 않음을 상기하라. 

** 입력 **

첫 번째 줄은 테스트 케이스의 수 $t$가 주어진다. $(1\leq t\leq 10^{4})$

각 케이스의 첫 번째 줄은 $n,x,y$ 3개의 수가 주어진다. $(1\leq n\leq 2\cdot 10^{5}; 1\leq x<y\leq 10^{12})$

두 번째 줄은 $n$과 상대의 레이팅 $a_{1},a_{2},...a_{n}$이 주어진다. $(1\leq a_{i}\leq 10^{12})$.

추가로 입력의 모든 테스트 케이스에서의 $n$의 합은 $2\cdot 10^{5}$를 넘지 않는다. 

** 출력 **

각 케이스마다 Monocarp가 레이팅 $y$에 도달할 수 있으면 최소 대련 횟수를, 불가능하면 -1을 출력하라. 

```
\\input
3
7 2 10
3 1 9 2 5 20 8
7 1 10
3 1 9 2 5 20 8
5 10 12
100 1 200 11 300

\\output
20
-1
2
```
<script type="text/javascript" src="http://cdn.mathjax.org/mathjax/latest/MathJax.js?config=TeX-AMS-MML_HTMLorMML"></script>
<script type="text/x-mathjax-config">
  MathJax.Hub.Config({ tex2jax: {inlineMath: [['$', '$']]}, messageStyle: "none" });
</script>