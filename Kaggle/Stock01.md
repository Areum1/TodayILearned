# Samsung 주식을 이용하여 데이터 시각화 공부하기💨
두번째로 가는 스터디였는데, 한 주간 피곤해서 힘들었다.. 그리고 저번 주에 내주셨던 숙제아닌 숙제를 하고 싶었는데 못 했다... 대부분 아래 내용들은 뇌피셜이라 정확하지 않을 수 있다...
#### 들어가기 전 ) 복습하기
```python
import matplotlib as mpl
import matplotlib.pyplot as plt

%matplotlib inline

# https://matplotlib.org/3.1.1/tutorials/introductory/pyplot.html
```
matplotlib에 관해 알아가는 시간이었다.

```python
plt.hist([1, 2, 3, 4], label = 'age' , color= 'g')
plt.xlabel('x')
plt.ylabel('y')
plt.legend()
plt.show()
```
이렇게 하면 왼쪽 세로에 x (plt.xlabel('x')) , 아래 가로에 y (plt.ylabel('y')) 가 나온다.  
또한 legend를 이용해서 label을 가운데 아래에 맞춘다.  
hist 속성은 막대 그래프이고, plot는 y = ax 그래프와 비슷해보인다.  
color는 g가 초록(green), b가 (blue), r이 (red) 등등이다.  

## 1) 구글 드라이브에서 csv파일 가져오기
```python
from google.colab import drive

drive.mount('/content/gdrive')
```  
이렇게 하면 무슨 링크가 나온다. 들어가서 계정 로그인 하고, 이용해도 괜찮다는 허락을 받고 난 뒤에 비밀번호 창이 나오게 되는데 그 비밀번호를 복사 붙여넣기하면 구글드라이브에 있는 자료들을 사용할 수 있다.  

```python
import pandas as pd

import matplotlib.pyplot as plt

%matplotlib inline
```
전에 pandas를 썼던 기억은 있는데 어디서 사용했는지 까먹어서 질문에 대답하지 못했다. pandas는 read_csv할 때 사용한다.  
%matplotlib inline 이 무슨 뜻인지 몰랐는데, 노트북? 에서 사용하겠다고 선언한 것이라 들었다. html에서는 Doctype 선언과 비슷한 것이라 이해했다.


```python
df = pd.read_csv('/content/gdrive/My Drive/Kaggle/Samsung.csv')
```


## 2) 데이터 확인하기
```python
df.head(n)
df.tail(n)
```
head는 상위 데이터 n개를 가져온다는 뜻이다. (전에도 있었음)  
head의 괄호 안에 아무 숫자도 넣지 않으면 상위 5개의 데이터를 가져온다.  
tail은 위와 비슷하지만 하위 데이터 n개를 가져온다는 뜻  

## 3) 필요한 데이터만 뽑아쓰기
```python
df_abj = df['Adj Close']
```
df에 있는 Adj Close 열을 가져와 df_abj에 넣는다는 뜻이다.  
