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