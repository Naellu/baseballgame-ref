
### 모델 로직
- ModelLogicTest
  - 컴퓨터의 수를 정하는 기능 `getComputerNum()`
  - 유저의 수를 입력받아 리스트에 넣는 기능 `getUserNum()`
    - 유저의 수를 입력하는 기능 `inputUserNumber()`

### 검사 로직
- 유저 모델에 들어간 수가 입력한 타입(문자열 사용)과 맞는지 판별하는 기능 `ValidString()`
  - 다른 입력값이면 IllegalArgumentException을 반환한다

### 메인 로직
- 볼과 스트라이크의 수를 계산하는 기능 `hasBall(), hasStrike()`
- 유저의 수를 리셋하는 기능 `resetUserNum()`

### 출력 로직
- 정답이라고 출력하는 기능 `correctAnswer()`
- 낫싱이라고 출력하는 기능 `hasNotBallOrStrike()`
- 메인에서 값을 받아와서 볼과 스트라이크의 개수를 출력하는 기능 `hasBallAndStrike()`
- 게임이 끝나면 다시 시작하는지 물어보는 걸 출력하는 기능 `reGameMessage()`

### 메인 애플리케이션
- 로직들을 모아서 단순히 실행만 하도록 하는 메인 실행부 `run()`
- 게임이 끝날 경우 다시 시작하는 실행부 `runAndRestart()`