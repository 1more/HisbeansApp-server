  개요

CTM은 별도의 서버없이 SKT, KT, LGT 3개 이동통신사의 가입자 핸드폰으로 문자메시지
(SMS, LMS, MMS)를 전송하는 기능을 포함하는 모듈입니다. GSLB 시스템을 기반으로 
365일 무정지(failover) 서비스를 구현하여 안정성을 보장합니다.


  소스코드 라이센스

기본적으로 BSD 라이센스에 따라 소스코드를 수정 및 배포가능하며 자세한 사항은 COP
YRIGHT.txt 파일을 참고바랍니다.


  계정만들기

문자전송을 위해 쿨에스엠에스(http://www.coolsms.co.kr/acct/signup.php)에서 회원
가입을 통하여 서비스 계정을 만듭니다.


  파일구성

SMS.java                              소스 파일
SMS.class                             문자발송 메인 클래스
CSCP.class                            전송규약 구현 클래스
CSCPPARAM.class                       전송규약 구현 클래스
TBSP.class                            문자내용 기술 클래스
SmsMessagePdu.class                   문자건당 객체
SmsBalanceInfo.class                  잔액정보
ServerLoadBalance.class               GSLB 구현
ExampleUTF8SendSMS.java               UTF-8 SMS전송 예제
ExampleUTF8SendLMS.java               UTF-8 LMS 장문전송 예제
ExampleUTF8SendMMS.java               UTF-8 MMS 이미지첨부 예제
ExampleUTF8ReserveSMS.java            UTF-8 예약전송 예제
ExampleUTF8CancelReserv.java          UTF-8 예약문자 취소 예제
ExampleUTF8CancelGroup.java           UTF-8 예약문자 그룹단위 취소 예제
ExampleUTF8GetResult.java             UTF-8 수신결과 조회 예제
ExampleUTF8CheckBalance.java          UTF-8 발송가능 SMS건수 조회 예제
ExampleUTF8SendLocalMessageId.java    UTF-8 로컬(클라이언트) 메시지ID 생성 예제
ExampleEUCKRSendSMS.java              EUC-KR SMS전송 예제
ExampleEUCKRSendLMS.java              EUC-KR LMS 장문전송 예제
ExampleEUCKRSendMMS.java              EUC-KR MMS 이미지첨부 예제
ExampleEUCKRReserveSMS.java           EUC-KR 예약전송 예제
ExampleEUCKRCancelReserv.java         EUC-KR 예약문자 취소 예제
ExampleEUCKRCancelGroup.java          EUC-KR 예약문자 그룹단위 취소 예제
ExampleEUCKRGetResult.java            EUC-KR 수신결과 조회 예제
ExampleEUCKRCheckBalance.java         EUC-KR 발송가능 SMS건수 조회 예제
ExampleEUCKRSendLocalMessageId.java   EUC-KR 로컬(클라이언트) 메시지ID 생성 예제


  Quick Start

모듈을 다운받은 후 압축을 해제하고 ExampleUTF8SendSMS.java 파일을 수정하여 빌드
 후 테스트 합니다.

  tar xvfz ctm-java-2.3.tar.gz
  cd ctm-java
  vi ExampleUTF8SendSMS.java
  javac -classpath . -encoding utf8 ExampleUTF8SendSMS.java
  java -classpath . -Dfile.encoding=utf8 ExampleUTF8SendSMS
  

  설치 및 테스트 (UNIX)

1. 모듈을 다운로드 받습니다.
   http://open.coolsms.co.kr 에 접속하여 자바전송모듈 선택 후 다운로드.

2. 다운받은 파일을 압축해제 합니다.
   $ tar xvfz ctm-java-2.3.tar.gz

3. 압축해제한 디렉토리로 이동합니다.
   $ cd ctm-java

4. 만약 *.class 가 생성되어 있지 않다면 아래와 같이 빌드합니다.
   $ javac SMS.java

5. ExampleSend.java 파일을 열어 아이디, 비밀번호 및 받는사람 폰번호, 보내는 사람
 폰번호, 메시지 내용 등을 수정합니다.
   $ vi ExampleUTF8SendSMS.java

6. ExampleUTF8SendSMS.java 파일을 빌드합니다.
   $ javac -classpath . -encoding utf8 ExampleUTF8SendSMS.java

7. 실행하여 테스트 합니다.
   $ java -classpath . -Dfile.encoding=utf8 ExampleUTF8SendSMS

8. 받는사람 폰번호로 발송된 메시지 내용이 폰으로 수신되었는지 확인합니다.

