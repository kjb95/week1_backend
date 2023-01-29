## Gradle Wrapper

1. Gradle Wrapper를 사용하는 이유

- Gradle을 각 개발자나 CLI 서버에 깔지 않고, 프로젝트에 함께 포함시켜 배포할 수 있는 방법을 제공
- Wrapper는 선언 된 버전의 Gradle을 호출하여 필요한 경우 미리 다운로드하는 스크립트
- 수동 설치 프로세스를 수행하지 않고도 Gradle 프로젝트를 신속하게 시작하게 해줌

2. gradlew

- `gradle wrapper` 명령을 실행하면 생기는 파일
- `gradle build`를 실행하면 컴퓨터에 설치된 gradle과 java를 기준으로 build
- `gradlew build`를 실행하면 build.gradle 파일에 정의한 내용을 기준으로 build됨

3. 참고: https://junilhwang.github.io/TIL/Gradle/GradleWrapper/

## Gradle Task

- Gradle은 명령에 의해 task를 수행하는 프로그램
- build.gralde에서 task의 처리를 기술해두면, 그것을 gradle 명령으로 호출 실행 시킬 수 있음
- action: 구체적으로 수행하는 처리의 실행 단위
- task는 준비된 action을 순서대로 실행해 나가는 역할을 함
- 참고: https://araikuma.tistory.com/464

## Gradle Dependencies

1. Dependency Types: build.gradle 파일에는 3가지의 의존 유형을 가짐

2. Local 라이브러리 모듈 의존성 설정

- 로컬에 정의된 모듈의 의존을 정의하는 방법
- 멀티 모듈을 구성할 때도 사용되는 방법
- 예시: `implementation project(":mylibrary")`

3. Local 바이너리 라이브러리 의존성 설정

- 패키지화되어 있는 라이브러리 모듈의 의존을 정의하는 방법
- 예시: `implementation files('libs/test-lib.jar', 'libs/web-lib.jar')`

4. Remote 바이너리 라이브러리 의존성 설정

- 외부에 정의되어 있는 바이너리 라이브러리 의존을 정의하는 방법
- 원격 저장소에서 라이브러리를 다운받아 빌드할 수 있는 환경을 제-
- 예시: `implementation 'org.springframework.boot:spring-boot-starter'`

5.참고: https://7942yongdae.tistory.com/133

## Annotation Processor

- 컴파일 단계에서 어노테이션에 정의된 일렬의 프로세스를 동작하게 하는 것을 의미
- 참고: https://roadj.tistory.com/9

## Gradle Dependencies 옵션

1. compile, api

- A모듈을 수정하게 되면 A를 의존하는 모든 모듈이 rebuild 됨
- 연결된 모든 모듈의 API가 노출됨
- compile은 deprecated 되고 api로 대체됨

2. implementation

- A모듈을 수정하게 되면 A를 직접적으로 의존하는 모듈까지만 Rebuild 됨
- 속도가 빠르고, API 노출을 막음

4. compileOnly

- 컴파일 시에만 빌드하고, 빌드 결과물에는 포함하지 않음
- 런타임 시 필요없는 라이브러리인 경우

5. runtimeOnly: 런타임 시에만 필요한 라이브러리인 경우 사용
6. annotationProcessor: annotation processor 명시
7. testImplementation: 테스트 코드를 수행할 떄만 적용
8. 참고

- https://cantcoding.tistory.com/59
- https://bcp0109.tistory.com/340

## DefaultTask

- 표준으로 다양한 테스크가 포함된 클래스
- @TaskAction: DefaultTask 클래스를 상속한 클래스에서 테스크로 수행할 메소드에 붙이는 어노테이션
- 참고: https://araikuma.tistory.com/465

## Gradle

1. Gradle 프로젝트 구조

- /.grdle: task로 생성된 파일이 저장됨
- /gradle: Gradle 환경을 정리한 Wrapper 파일들이 저장됨
- /src: 프로젝트에서 만든 프로그램 관련 파일들이 저장됨
- build.gradle: Gradle 기본 빌드 설정 파일
- gradlew: 내장 Gradle 사용을 간단하게 하기위해 만들어진 스크립트
- settings.gradle: 프로젝트에 대한 설정 정보를 작성한 파일

2. repositories

- Gradle에는 프로그램에 필요한 라이브러리를 자동으로 다운로드하고 통합하는 기능이 있음
- 어떤 저장소를 사용하는지를 빌드파일에 작성하여 설정할 수 있음

3. dependencies: 저장소에 필요한 라이브러리를 명시해두는 곳

4. 참고

- https://velog.io/@sa1341/Gradle-%EA%B8%B0%EB%B3%B8-%EB%8B%A4%EC%A7%80%EA%B8%B0-1%ED%8E%B8
- https://kotlinworld.com/314

## Gradle Plugin

- 특정 작업을 하기 위해서 모아놓은 Task들의 묶음
- 참고: https://kotlinworld.com/323

## build.gradle

1. buildscript

- gradle로 task를 수행할 떄에 사용되는 설정
- buildscript 내에 정의된 dependecies는 task를 사용할 때 사용되는 라이브러리
- buildscript 밖에서 정의된 dependencies는 소스를 컴파일할 때 등에 사용

2. allprojects: gradle에서 빌드하는 모든 모듈을 위한 설정
3. project(:서브프로젝트명): 특정 프로젝트에만 해당하는 로직
4. subprojects: 해당 프로젝트에 포함된 모든 모듈의 build.gradle을 제어

5. 참고

- https://juhi.tistory.com/70
- https://kotlinworld.com/324