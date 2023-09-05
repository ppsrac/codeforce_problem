# A. Array Coloring

전체 행렬의 합의 홀짝성만 판단하면 된다.

Time complexity: O(n)

# B. Maximum rounding

언뜻 보면 가장 높은 자리에서 5 이상인 자리에서 올림해주고 그 밑만 모두 0으로 바꿔주면 되는 문제로 보이지만, 445와 같은 예시 때문에 낮은 자리에서부터 쭉 검사해야 하는 문제. 

445와 같은 케이스만 잘 처리한다면 무난히 쉬운 문제

Time complexity: O(n)

# C. Assembly via Minimums

가장 최소인 원소는 n - 1개가 포함되고 점점 커질수록 한개씩 덜 출현하게 된다. 따라서 먼저 정렬한 후 특정 인덱스를 찾아 출력하면 된다.

Time complexity: O(n^2 log n) (정렬때문에)

# D. Strong Vertices

언뜻 보면 어려워보일 수도 있지만, $a_u - a_v >= b_u - b_v$를 $a_u - b_u >= a_v - b_v$ 로 변형한다면 간단한 정렬 문제가 된다. 

먼저 큰 순서로 정렬한 후 차이가 가장 큰 인덱스와 그 차이가 동일한 모든 인덱스들을 모두 구하면 된다.

Time complexity: O(n log n)

# E. Power of points

역시 정렬 문제. 핵심은 일단 정렬했을 때 가장 작은 점에서의 값이 무엇이냐를 먼저 구하고, d만큼 값이 커진 곳에서의 Power 값이 무엇이냐를 구하는 것이다.
d만큼 좌표를 +x방향으로 이동하면 d보다 작거나 같은 좌표의 개수를 a개 큰 좌표의 개수를 b개라 할 때 $d(a - b)$만큼 Power가 증가하게 된다.

Time complexity: O(n log n)

# F. Sum and products

1. 이차방정식을 풀고
2. 해가 같다면 그 해가 k번 나왔을 때 $k(k - 1) >> 1$을 출력하고
3. 해가 다르다면 각각의 해가 k1번 k2번 나왔을 때 $k1 \times k2$를 출력하면 된다.

정렬 + 이분탐색이 관건 (C++은 upper bound, lower bound라는 꿀 함수가 있다.)

Time complexity: O((n + q) log n)

# G. Counting Graphs

생각보다 재밌고 괜찮은 문제. Kruskal로 MST를 찾는 것을 생각해보자. 우리는 Greedy하게 
1. 가중치로 정렬하고
2. 정렬 한 순서대로 edge의 양 끝 점이 Cycle을 형성하진 않는지 판별하고
3. Cycle이 없을 경우 추가한다.
따라서 우리가 2번 단계에서 정점 u와 정점 v를 이을 때 u가 포함된 dsu와 v가 포함된 dsu끼리 잇는 모든 간선들 중 u, v를 잇는 간선의 가중치가 최소여야만 한다.
가중치를 w라 하면, 나머지 간선들은 w + 1에서부터 S까지 값을 가지거나 아예 연결되어 있지 않는 것이 가능하므로

$(S - w + 1)^{s_u \times s_v - 1}$
가지가 나온다. 

시간복잡도는 간선을 가중치별로 정렬하는 것(n log n)과 n - 1 번의 지수 연산 (log S)가 필요하다.

Time complexity : O(n log nS)