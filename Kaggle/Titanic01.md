# 사이킷런으로 수행하는 타이타닉 생존자 예측
처음 다루는 데이터라 잘 모르는게 많아서 대부분 확실하지 않다 (뇌피셜)
#### 들어가기 전 ) 사이킷런이란? 
```
1. 머신러닝 알고리즘들을 효율적이고 생산적으로 사용할 수 있게 사용자 친화적인 인터페이스를 제공하는 라이브러리
2. 여러 가지 분류 알고리즘에 대단히 최적화되었고, 사용자 친화적 인터페이스와 결합된 API
3. 방대한 학습 알고리즘 + 데이터 전처리나 미세 튜닝, 그리고 우리의 모델을 평가하는 데 편리한 함수 제공
```

[사이킷런 출처](http://www.datamarket.kr/xe/index.php?mid=board_oFxn34&listStyle=gallery&document_srl=25783)

### 1) 선언과 데이터 확인하기

```python
import numpy as np ##계산
import pandas as pd ##파이썬 데이터 처리
import matplotlib.pyplot as plt ##데이터 시각화 (그래프)
import seaborn as sns ##데이터 시각화
%matplotlib inline

titanic_df = pd.read_csv('/kaggle/input/titanic/train.csv')
titanic_df.head(3) ## .head(n) 가 위에 있는 데이터를 n개 가져온다
```

### 2) 로딩된 데이터 칼럼 타입 확인

```python
print(titanic_df.info())
##.info()는 데이터의 개수, 널의 개수(?), 데이터 타입, 데이터 타입의 개수, 메모리 사용한 양을 알 수 있다
```

### 3) 사이킷런 머신러닝 알고리즘을 위해 Null 값 처리하기

```python
titanic_df['Age'].fillna(titanic_df['Age'].mean(), inplace=True)
titanic_df['Cabin'].fillna('N', inplace=True)
titanic_df['Embarked'].fillna('N', inplace=True)
print('데이터 세트 Null 값 개수 ', titanic_df.isnull().sum().sum())
```

pandas안에 있는 fillna(NA, NaN) 는 NaN값을 특정 값으로 대체하는 기능을 함  
numpy안에 있는 mean() 은 평균을 뜻함  
inplace = True 는 해당하는 값 안에 True를 넣는다는 뜻  
첫번째 문장은 아마도 Age안에 있는 NA 값에는 'Age'의 평균을 넣고, NaN값에는 True를 넣는다는 뜻 아닐까...  

### 4) 피처(?)들의 값 분류 살피기
피처가 뭘까... 이해할 수 없다..

```python
print('Sex 값 분포 : \n',titanic_df['Sex'].value_counts())
print('\nCabin 값 분포 : \n',titanic_df['Cabin'].value_counts())
print('\n Embarked 값 분포 : \n',titanic_df['Embarked'].value_counts())
```

value_counts는 유일한 값별로 개수 세기... 무슨 뜻일까....  
결과는 안에 들어있는 항목과 데이터 타입이 나온다  

### 5) cabin 속성 앞 문자만 추출하기

```python
titanic_df['Cabin'] = titanic_df['Cabin'].str[:1]
print(titanic_df['Cabin'].head(3))
```

.str[:1] 안에 있는 값을 다시 titanic_df['Cabin'] 안에 넣는다는 뜻!!  

### 6) 성별에 따른 생존자 수 비교하기

```python
titanic_df.groupby(['Sex','Survived'])['Survived'].count()
```

.count()는 앞에 있는 ['값']의 개수를 세어주는 코드인 듯!  
groupby는 뒤에 있는 ['값', '값']을 그룹지어 표처럼 나타내는 코드인 듯!!!!  

### 7) 위에 있는 성별에 따른 생존자 수 막대 차트 그리기

```python
sns.barplot(x = 'Sex',y= 'Survived',data=titanic_df)
```

x를 Sex로 y를 survived로 data는 titanic_df를 이용한다는 뜻  
여기에 그려지는 검정색 바의 길이가 조금씩 다른데 뭘 뜻하는 건지 모르겠다.😥  

### 8) 객실 등급에 따라 생존자 수 막대 차트 그리기

```python
sns.barplot(x = 'Pclass',y = 'Survived', hue = 'Sex', data = titanic_df)
```

hue는 표의 내용 설명? 인 듯...  

### 9) Age의 값 종류를 분류하여 다시 막대 차트 그리기

```python
def get_category(age):
    cat = ''
    if age <= -1: cat = 'Unknown'
    elif age <= 5: cat = 'Baby'
    elif age <= 12: cat = 'Child'
    elif age <= 18: cat = 'Teenager'
    elif age <= 25: cat = 'Student'
    elif age <= 35: cat = 'Young Adult'
    elif age <= 60: cat = 'Adult'
    else: cat = 'Elderly'
        
    return cat

plt.figure(figsize = (10,6))

group_names = ['Unknown', 'Baby','Child', 'Teenager', 'Student','Young Adult', 'Adult','Elderly']

titanic_df['Age_cat'] = titanic_df['Age'].apply(lambda x: get_category(x))
sns.barplot(x = 'Age_cat',y = 'Survived', hue = 'Sex',data= titanic_df, order = group_names)
titanic_df.drop('Age_cat', axis = 1, inplace=True)
```
