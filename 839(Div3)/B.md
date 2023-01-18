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
<script type="text/javascript" src="http://cdn.mathjax.org/mathjax/latest/MathJax.js?config=TeX-AMS-MML_HTMLorMML"></script>
<script type="text/x-mathjax-config">
  MathJax.Hub.Config({ tex2jax: {inlineMath: [['$', '$']]}, messageStyle: "none" });
</script>