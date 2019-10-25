# 사이킷런으로 수행하는 타이타닉 생존자 예측
#### 들어가기 전 ) 사이킷런이란? 
```
1. 머신러닝 알고리즘들을 효율적이고 생산적으로 사용할 수 있게 사용자 친화적인 인터페이스를 제공하는 라이브러리
2. 여러 가지 분류 알고리즘에 대단히 최적화되었고, 사용자 친화적 인터페이스와 결합된 API
3. 방대한 학습 알고리즘 + 데이터 전처리나 미세 튜닝, 그리고 우리의 모델을 평가하는 데 편리한 함수 제공
```
###### _In [1]: 으로 되어있는게 사이킷런 아닐까? 지금은 이해할 수 없을 듯_ 😅

[사이킷런 출처](http://www.datamarket.kr/xe/index.php?mid=board_oFxn34&listStyle=gallery&document_srl=25783)

### 1) 차트와 그래프 시각화 하기

```python
import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
%matplotlib inline

titanic_df = pd.read_csv('/kaggle/input/titanic/train.csv')
titanic_df.head(3)
```
