# 🏎️ 자동차 경주

# 1. 🔍️ 역할과 책임 분석

- ## ⌨️ InputHandler
    ````
    - 클라이언트로 부터 자동차의 이름, 경주 횟수를 입력받음
    - 입력 값을 검증
    ````
- ## 🚗 Car
  ````
  - 자동차의 전반적인 상태(이름, 위치 등)를 관리
  - 전진 조건에 따른 전진
  ````
- ## 🏁 Race
  ````
  - n개의 자동차를 관리(점수 저장)하며 n번의 경주를 진행시켜 각 차수의 결과와 우승자를 반환
  ````
- ## 🎮️ Controller
  ````
  - 전반적인 프로그램의 흐름을 제어하며, 필요한 객체를 호출하는 등 조율
  ````
- ## 🖥️ OutputHandler
  ````
  - 사용자에게 메세지, 결과 값 등을 제공
  ````


# 2. 📝 구현해야 할 기능 목록

## ⌨️ InputHandler

- [x] 경주할 자동차 이름 입력 받기(쉼표로 구분, 이름은 5글자 이하)
  ````
  🚫예외 처리(InputValidator.class)
  1. 이름의 길이가 위배되는 경우(5글자 초과, 1글자 미만)
  2. 이름에 공백이 들어간 경우(앞 뒤로 공백이 있는 경우 공백 제거 후 저장)
  3. 쉼표가 아닌 다른 특수문자가 들어간 경우
  ````
- [ ] 시도할 횟수 입력받기
  ````
  🚫예외 처리
  1. 숫자가 아닌 경우
  ````

## 🚗 Car
- [ ] 이름, 위치 값 변수로 가지기
- [ ] 전진조건에 따른 전진하기

## 🏁 Race
- [ ] 회차, 참여하는 자동차 리스트 변수로 가지기
- [ ] 회차 만큼 경기 진행하기
- [ ] 1회차가 끝날 때마다 경기 결과 기록하여 저장
- [ ] 모든 회차가 끝나면 저장된 각 차수 경기 결과와 우승자 반환

## 🖥️ OutputHandler
- [ ] 입력 안내 메세지 출력
- [ ] 각 차수 경기 결과를 알맞은 형식으로 변환하여 출력
- [ ] 우승자 출력