# 미션 - 엘리베이터 시뮬레이션

## 🚀 진행 방식
1. 미션 진행은 [미션 진행 가이드 문서](https://github.com/develup-mission/docs/blob/main/mission-guide.md)를 따른다.

## 💻 기능 요구 사항

1. **엘리베이터 기본 동작**
    - 엘리베이터는 1층에서 시작합니다.
    - 엘리베이터는 1층에서 N층까지 이동할 수 있습니다.
    - 사용자가 엘리베이터를 호출하면 엘리베이터는 해당 층으로 이동합니다.
    - 엘리베이터는 한 번에 한 층씩만 이동합니다.
2. **사용자 인터페이스**
    - 사용자는 현재 층을 입력하여 엘리베이터를 호출할 수 있습니다.
    - 엘리베이터가 이동할 때마다 현재 위치를 출력합니다.
    - 엘리베이터가 도착하면 도착 메시지를 출력합니다.
3. **기본 제약 조건**
    - 사용자는 1층에서 N층까지의 숫자만 입력할 수 있습니다. 잘못된 입력에 대해서는 오류 메시지를 출력하고 다시 입력을 받습니다.
    - 엘리베이터는 한 번에 한 층씩만 움직이므로, 사용자가 호출한 층으로 한 단계씩 이동해야 합니다.

### 추가 기능 (선택 사항)

- **여러 명의 사용자**: 여러 명의 사용자가 엘리베이터를 동시에 호출할 수 있고, 엘리베이터가 가장 가까운 요청부터 처리하도록 구현합니다.
- **엘리베이터 상태 표시**: 엘리베이터가 현재 운행 중인지, 대기 중인지를 표시합니다.

### 예시:
```
엘리베이터가 현재 1층에 있습니다.
이동할 층을 입력하세요: 5

엘리베이터가 2층으로 이동 중입니다...
엘리베이터가 3층으로 이동 중입니다...
엘리베이터가 4층으로 이동 중입니다...
엘리베이터가 5층에 도착했습니다!
```
