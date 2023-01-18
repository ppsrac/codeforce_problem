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

<script type="text/javascript" src="http://cdn.mathjax.org/mathjax/latest/MathJax.js?config=TeX-AMS-MML_HTMLorMML"></script>
<script type="text/x-mathjax-config">
  MathJax.Hub.Config({ tex2jax: {inlineMath: [['$', '$']]}, messageStyle: "none" });
</script>