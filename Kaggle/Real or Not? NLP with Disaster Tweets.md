# Real or Not? NLP with Disaster Tweets

## 대회 한국어 정리
[한국어 정리](https://docs.google.com/document/d/1LE7l6mHfATnk-blpOV9L1jyJvwKVrzP7ZUPdIUBEwGs/edit?usp=sharing)

## NLP 정리
NLP (Natural Language Processing, 자연어처리)는 텍스트에서 의미있는 정보를 분석, 추출하고 이해하는 일련의 기술집합
### NLP 응용 사례
- 텍스트 요약
- 자동 질의응답 시스템
- 대화 시스템 ([시리](https://www.apple.com/siri/), [빅스비](https://www.samsung.com/sec/apps/bixby/))
- 기계 번역 ([구글 번역](https://translate.google.com/), [파파고](https://papago.naver.com/))    

### 자연어처리 PYTHON 라이브러리
#### [NLTK](http://www.nltk.org/) : 대표적인 자연어 처리 라이브러리
- 말뭉치(corpus) : 자연어 분석 작업을 위해 만든 샘플 문서 집합 
- 토큰 생성(tokenizing) : 자연어 분석을 위해 긴 문자열을 분석을 위한 작은 단위(토큰)로 나누는 작업
- 형태소 분석(morpheme) : 단어로부터 어근, 접두사, 접미사, 품사 등 다양한 언어적 속성을 파악하고 형태소를 찾아내거나 처리하는 작업
  - 어간 추출(stemming) : 변화된 단어의 접미사나 어미를 제거하여 같은 의미를 가지는 형태소의 기본형을 찾는 방법
  - 원형 복원(lemmatizing) : 같은 의미를 가지는 여러 단어를 사전형으로 통일하는 작업
  - 품사 부착(Part-Of-Speech tagging) :낱말을 문법적인 기능이나 형태, 뜻에 따라 구분한 것
 - Text 클래스 : 문서 분석에 유용한 여러가지 메서드 제공
 - FreqDist : 문서에 사용된 단어(토큰)의 사용빈도 정보를 담는 클래스
 - 워드클라우드 : 단어의 사용 빈도수에 따라 워드클라우드(Word Cloud) 시각화 할 수 있다
#### [KoNLPy](https://konlpy-ko.readthedocs.io/ko/v0.4.3/) : 우리나라 한글에 특화된 자연어 처리 라이브러리
- 단어 품사 별 분류
  - Hannanum
  - Kkma
  - Komoran
  - Twitter
#### [Scikit-learn](https://scikit-learn.org/stable/modules/feature_extraction.html) : 대표적인 Python 머신러닝 라이브러리에서는 문서 전처리용 클래스를 제공해줌
- 기능
  - DicVectorizer : 단어의 수를 세어놓은 사전에서 BOW 벡터를 만든다.
  - CountVectorizer: 문서 집합으로부터 단어의 수를 세어 BOW 벡터를 만든다.
  - Tfidfvectorizer: 문서 집합으로부터 단어의 수를 세고 TF-IDF 방식으로 단어의 가중치를 조정한 BOW 벡터를 만든다.(CounterVectorizer의 서브클래스로 CountVectorizer를 이용해 BOW를 만들고 TfidTransformer를 사용해 tf-idf로 변환)
  - HashingVectorizer: hashing trick을 사용하여 빠르게 BOW 벡터를 만든다.

### 자연어 처리 기법을 이용한 머신러닝 방법
- Word Embedding: 벡터화
- 학습
- 예측

### Word Embedding
- Frequency based Embedding : 횟수 기반 임베딩
- Prediction based Vector

### Frequency based Embedding : 횟수 기반 임베딩
#### Bag of Words(BOW) : 단어들의 출연 빈도만으로 단어 사전(주머니) 만들기
- I have an apple. and I want to eat an apple.
→ [I, have, an, apple, and, want, to, eat]

|Terms|Index|Count|
|----|----|----|
|I|0|2|
|have|1|1|
|an|2|2|
|apple|3|2|
|and|4|1|
|want|5|1|
|to|6|1|
|eat|7|1|

#### Count Vector : 모든 문서에서 어휘를 학습한 다음 문서마다의 어휘 횟수 세는 방법 (비효율적인 연산)
- D1: He is a lazy boy. She is also lazy.    
- D2: Neeraj is a lazy person.   
- Number of Tokens : [‘He’,’She’,’lazy’,’boy’,’Neeraj’,’person’]
    
|Terms|D1|D2|
|----|----|----|
|He|1|0|
|She|1|0|
|lazy|2|1|
|boy|1|0|
|Neeraj|0|1|
|person|0|1|

#### (TF-IDF)Term Frequency - inverse Document Frequency
[블로그 참고](https://khann.tistory.com/28) >> 귀찮아서 그러는 거 아님 ^.^ 블로그가 더 잘 나왔음 그리고 이 문서도 블로그 거의 가져온거라 블로그가 더 잘 되어있음.

### Prediction Based Embedding : 예측 기반 벡터
#### Word2Vec : CBOW와 Skip-gram방식의 알고리즘을 이용한 word-embedding
![image](https://user-images.githubusercontent.com/48716298/75445629-25fe7680-59a9-11ea-9538-953ca22a5b91.png)   
MAN과 WOMAN의 거리는 KING과 QUEEN의 거리와 유사하다

#### CBOW(Continuous Bag of Words) : 문장에서 한 단어 앞뒤로 붙어있는 단어들을 통해서 해당 단어 유추하는 방법
- 나는 추운 겨울보다 _ 여름이 좋아" 에서 "겨울보다"와 "여름이"를 통해 _ 을 "따뜻한"으로 유추
![image](https://user-images.githubusercontent.com/48716298/75445680-429aae80-59a9-11ea-965e-69560b0d14d3.png)   
Input layer : ["겨울보다", "여름이"]  → Hidden layer(가중치:w) → Output layer : ["따뜻한"] (One-hot-encoding)
단점 : "따뜻한 여름이" 에서의 "따뜻한"과 "마음이 따뜻한"에서의 "따뜻한"이 같이 쓰일경우 문제가 발생

#### Skip-gram : CBOW와 Input Output의 Layout구조만 반대. 손실함수는 CBOW와 같다
Input layer : ["따뜻한"] → Hidden layer(가중치:w) → Output layer : ["겨울보다", "여름이"]
장점 : 한 단어와 연관된 두 가지 이상의 의미론적 벡터를 찾을 수 있다. → CBOW보다 결과가 더 좋다고 확인됐다.


## 참고 문서
- _[자연어(NLP) 처리 기초 정리](http://hero4earth.com/blog/learning/2018/01/17/NLP_Basics_01/)_   
- [NLP 형태소 분석 알고리즘](https://ra2kstar.tistory.com/170)   
- [NLP란 무엇인가요?](https://konlpy-ko.readthedocs.io/ko/v0.4.3/start/#what-is-nlp)
- [KoNLPy: 파이썬 한국어 NLP](https://konlpy-ko.readthedocs.io/ko/v0.4.3/)
- [NLTK 자연어 처리 패키지](https://datascienceschool.net/view-notebook/8895b16a141749a9bb381007d52721c1/)
- [KoNLPy 간단 사용법](https://m.blog.naver.com/PostView.nhn?blogId=myincizor&logNo=221629109172&proxyReferer=https%3A%2F%2Fwww.google.com%2F)
- [워드투벡터(Word2Vec)](https://wikidocs.net/22660)
- _[자연어처리(NLP) - 컴퓨터가 자연어를 이해하는방법(벡터화)](https://khann.tistory.com/28)_
