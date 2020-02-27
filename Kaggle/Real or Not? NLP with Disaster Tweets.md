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
     
# 참고 문서
[자연어(NLP) 처리 기초 정리](http://hero4earth.com/blog/learning/2018/01/17/NLP_Basics_01/)   
[NLP 형태소 분석 알고리즘](https://ra2kstar.tistory.com/170)   
[NLP란 무엇인가요?](https://konlpy-ko.readthedocs.io/ko/v0.4.3/start/#what-is-nlp)
[KoNLPy: 파이썬 한국어 NLP](https://konlpy-ko.readthedocs.io/ko/v0.4.3/)
[NLTK 자연어 처리 패키지](https://datascienceschool.net/view-notebook/8895b16a141749a9bb381007d52721c1/)
