# 🤝 Care Bridge - 요양 일지  서비스

<p align='center'>
<img width="600" alt="care_bridge_logo" src="docs/source/care_bridge.png">
</p>


# 🔗 관련 주소

|                         문서                         |
|:--------------------------------------------------:|
|  [백엔드 배포 주소](https://dbdr-servcie.com)  |
| [프론트엔드 배포 주소](https://dbdari.vercel.app/) |
|     [API 문서](https://dbdr-servcie.com/swagger-ui/index.html)     |
|   [디자인 피그마](https://www.figma.com/design/RvPegHAoDLITbqAxexEok7/%EB%B6%80%EC%82%B0%EB%8C%80-13%EC%A1%B0-%EB%81%9D%EB%82%B4%EC%A3%BC%EC%A1%B0?node-id=19-3&node-type=canvas&t=IzVl1agbkGalr8SU-0)    |
|      [프로젝트 노션](https://www.notion.so/example)      |

# 🧐 왜 이 서비스가 필요할까?

## 📝 문제 상황 1: 정보 공유의 단절
- **보호자**는 가족의 상태를 자주 확인하고 싶지만, 요양원에 일일이 연락해야 하는 번거로움과 제한된 정보로 인해 불편을 겪고 있습니다.
- 실시간 상태 확인이 어렵기 때문에, 보호자는 가족의 건강 상태에 대해 지속적인 불안감을 느낄 수 있습니다.


```
보호자의 요구 - 가족의 상태를 실시간으로 확인할 수 있는 간편한 정보 접근 방안이 필요하다.

➡️ 보호자가 어디서든 가족의 상태를 쉽게 확인할 수 있는 시스템이 필요하다!
```

### 🎯 해결 방안
- **실시간 정보 공유** 기능을 통해 보호자가 언제 어디서나 가족의 최신 상태를 확인할 수 있도록 합니다.
- 보호자와 요양보호사 간의 소통을 원활하게 하여 불안감을 줄이고, 신뢰를 강화합니다.

---

## 📝 문제 상황 2: 요양보호사의 차트 작성 어려움
- **요양보호사**는 복잡한 디지털 기록 시스템에 익숙하지 않아 핸드폰으로 차트를 작성하는 과정이 번거롭고 어렵습니다.
- 이러한 어려움은 기록의 정확성과 신속성을 저해하고, 요양보호사의 업무 효율성에도 부정적인 영향을 미칩니다.

<p align='center'>
    <img width="400" alt="caregiver_difficulty" src="docs/source/caregiver_difficulty.png">
</p>

```
요양보호사의 요구 - 복잡하지 않고 간단한 차트 작성 방식이 필요하다.

➡️ 요양보호사가 쉽게 차트를 작성할 수 있도록 하는 간편한 기록 시스템이 필요하다!
```

### 🎯 해결 방안
- **음성 인식 및 손글씨 인식** 기능을 통해 요양보호사가 복잡한 절차 없이 차트를 쉽게 작성할 수 있도록 지원합니다.
- 기록 작성의 간소화를 통해 요양보호사의 부담을 줄이고, 환자의 상태를 신속하고 정확하게 기록할 수 있도록 합니다.

---

# 🌟 Care Bridge란?

> **요양보호사**는 간편하게 차트를 작성하고,  
> **보호자**는 이를 실시간으로 확인할 수 있는 **디지털 차트 서비스**

- 보호자는 **언제 어디서나 가족의 상태를 확인**
- 요양보호사는 **복잡함 없이 기록을 관리**

**➡️ 신뢰와 편리성을 제공하는 소통 플랫폼**



## 🧩 주요 기능

### 보호자
|                             🩺 **돌봄대상자 차트 확인**                             | 📝 **차트 요약** |
|:--------------------------------------------------------------------------:|:--:|
|               - **하루 상태 기록 확인**<br/> - 사진과 차트 작성 시 **알림 수신**               | - 긴 차트를 **핵심 내용 요약**<br/> - 주요 사항을 **간결하게 확인** |
| <img width="170" alt="voice_recognition" src="docs/source/chart_view.png"> | <img width="170" alt="chart_summary_feature" src="docs/source/chart_summary.png"> |

### 요양보호사
|                              🖋️ **요양 일지 작성**                               | 🎙️ **음성 인식 차트 작성** |
|:---------------------------------------------------------------------------:|:-:|
|             - **음성/사진 인식**, 직접 작성 지원<br/> - **다양한 방식으로 간편 작성**              | - **음성 인식**을 통해 주관식 입력<br/> - 음성을 텍스트로 **자동 변환** |
| <img width="170" alt="voice_recognition" src="docs/source/chart_write.png"> |<img width="170" alt="voice_recognition" src="docs/source/voice_recognition.png"> |


|                                 📷 **OCR 차트 작성**                                 |                                  📑 **차트 요약 기능**                                  |                              🔔 **알림 기능**                               |
|:--------------------------------------------------------------------------------:|:---------------------------------------------------------------------------------:|:-----------------------------------------------------------------------:|
|               - **차트 양식 프린트 후 사진 인식**<br/> - 사진 한 장으로 **자동 기록 완성**               |                  - **환자 상태 요약 제공**<br/> - 여러 환자의 **하루 상태 간편 확인**                  |               - 사용자가 예약한 시간마다<br/> - 문자/라인 메시지로 차트 작성 알림                |
| <img width="170" alt="ocr_chart" src="https://github.com/example/ocr_chart.png"> | <img width="170" alt="chart_summary_feature" src="docs/source/chart_summary.png"> | <img width="170" alt="care_message" src="docs/source/care_message.jpg"> |


### 요양원
|                                   🖥️ **요양사, 보호자, 돌봄대상자 관리**                                   |                                     📊 **엑셀 업로드**                                      |
|:----------------------------------------------------------------------------------------------:|:--------------------------------------------------------------------------------------:|
|                      - **웹사이트로 정보 관리**<br/> - 요양사, 보호자, 대상자 정보 **수정 가능**                       |                  - 엑셀 파일로 **대량 데이터 업로드**<br/> - 제공된 템플릿 파일로 **간편 등록**                  |
| <img width="170" alt="admin_management" src="https://github.com/example/admin_management.png"> | <img width="170" alt="excel_upload" src="https://github.com/example/excel_upload.png"> |

## 🔧 BE 핵심 개발 영역

### OCR 기능

요양보호사가 작성한 돌봄 대상자 차트를 효율적으로 디지털화하기 위해 Naver Clova OCR API와 AWS S3의 presigned URL을 사용했습니다.

presigned URL을 통해 이미지 파일을 S3에 업로드하고, 백엔드 서버에는 objectKey 값만 전달하여 OCR을 수행하는 방식으로 서버 과부하를 방지하고 성능을 최적화했습니다. 이로써 서버 리소스를 절약하면서도 보안성을 유지한 상태에서 차트를 안전하게 OCR 처리할 수 있도록 구현했습니다.
<p >
<img width="270" alt="care_bridge_logo" src="docs/source/ocr_example.jpeg">
</p>

### AI 요약 기능 - 파인 튜닝
1. **고려 사항**

    - 보호자들이 차트 정보를 모두 보면 너무 많은 정보로 인해 돌봄 대상자의 상태를 파악하기 어려울 수 있습니다. 이를 해결하기 위해 차트 정보를 간결하게 요약하여 보여주는 기능을 구현하였습니다.


2. **기술 선택 이유(파인튜닝)**

    - 모델 파인튜닝: 기존의 ChatGPT를 사용할 때 원하는 형식으로 결과가 나오지 않거나 불필요한 정보가 포함되는 경우가 있어, 모델을 파인튜닝하는 방법을 선택했습니다. 파인튜닝을 하지 않았다면 매번 JSON 형식으로 특정 방식의 값을 요구해야 했겠지만, 이제는 차트 데이터를 JSON 형식으로 입력하면 원하는 형식의 결과를 바로 받을 수 있습니다.


3. **구현 방식**

   - 파인튜닝: 차트 요약과 관련된 데이터셋이 없어 AI-Hub의 한국어 대화 요약 데이터셋을 활용하여 파인튜닝을 진행했습니다. conditionDisease, bodyManagement, nursingManagement, recoveryTraining, cognitiveManagement와 같은 항목별로 요약하도록 만들었습니다.

   - 태그 요약 적용: 프론트엔드에서 사용할 세 가지 태그를 요약하도록 파인튜닝을 추가로 진행했습니다. 프론트엔드와의 연동 과정에서 태그를 추가하는 것이 유용할 것이라는 의견을 반영하여 이를 구현했습니다. 차트 데이터를 준비하는 데 시간이 많이 소요되었기 때문에 태그를 추가하여 다시 파인튜닝하는 것이 어렵다고 판단했고, 대신 태그를 위한 파인튜닝을 별도로 진행하는 것으로 결정했습니다.

4. 문제 해결
   - 가끔 AI가 null 값을 반환하는 문제가 있었지만, 대부분 한 번 더 시도하면 정상적으로 동작했습니다. 이에 따라 백엔드 서비스에서 첫 번째 시도에 성공하지 않을 경우 최대 세 번까지 재시도하도록 수정하였고, 세 번 시도 후에도 응답이 없을 경우 그때 프론트엔드에 에러 메시지를 보내도록 변경했습니다.



### 알림 서비스
1. **구현 방법**
- Spring 스케줄러를 활용하여 매분마다 알림 시간이 도래한 요양보호사와 보호자를 찾아 필요한 알림 메시지를 전송합니다.
- 알림 메시지는 미리 정의된 템플릿을 기반으로 구성하며, 사용자가 선택한 알림 수단(Line 또는 SMS)에 맞춰 발송됩니다.
- 사용자 편의를 위해 ‘마이페이지’에서 Line 알림 서비스와 SMS 알림 서비스를 선택할 수 있는 옵션을 제공했습니다.

2. **문제 해결**
- 메시지 전송 중복 및 전송 실패 시 오류 처리가 어려웠던 부분은 Amazon SQS를 통해 메시지 큐 관리 기능을 추가하여 문제를 해결했습니다.
- 카카오 비즈니스 채널 가입에 필요한 서류 심사에서 반려되었으나, 장기적으로 카카오 알림톡 도입 가능성을 염두에 두고, 현재는 Line과 SMS API를 대체 수단으로 활용했습니다.


### 엑셀 파일 관리 기능
엑셀 파일 관리 기능을 통해 요양원에서 다수의 요양보호사, 보호자, 돌봄대상자 정보를 한 번에 효율적으로 등록할 수 있습니다. 요양원은 제공된 엑셀 템플릿 파일을 다운로드해 데이터를 일괄적으로 입력하고 업로드하여 개별 입력보다 시간을 절감할 수 있습니다.

업로드된 파일은 서버에서 유효성 검사와 중복 검사를 거쳐 형식이 맞지 않거나 중복된 데이터는 데이터베이스에 저장되지 않습니다. 검사를 통과한 데이터만 데이터베이스에 저장되며, 검사에 통과하지 못한 오류 데이터는 데이터베이스에 저장되지 않아, 정상 데이터만 안전하게 관리됩니다.

### 리프레시 토큰
우리 서비스는 민감한 의료 데이터를 다루기에, 토큰 보안이 중요했습니다. 로그인 시 액세스 토큰과 리프레시 토큰을 발급하고, 리프레시 토큰으로 재발급 시 두 토큰을 모두 새로 발급하는 RTR 방식을 적용해 보안을 강화했습니다. 로그아웃 시에는 Redis에 저장된 리프레시 토큰을 삭제하고, 액세스 토큰은 블랙리스트에 등록해 유효성을 차단했습니다. 이를 통해 로그아웃 시 실시간으로 토큰 만료를 효과적으로 처리할 수 있었습니다.

## 🧩 ERD
<p align='center'>
    <img width="700" alt="caregiver_difficulty" src="docs/source/erd.png">
</p>

## ⚙️ 개발 스택

<div align="center">

![java 17](https://img.shields.io/badge/-Java%2017-ED8B00?style=flat-square&logo=java&logoColor=white)
![spring boot 3.3](https://img.shields.io/badge/Spring%20boot%203.3-6DB33F?style=flat-square&logo=springboot&logoColor=white)
![spring security](https://img.shields.io/badge/spring%20security-6DB33F?style=flat-square&logo=spring&logoColor=white)
![mysql 8.0](https://img.shields.io/badge/MySQL%208.0-005C84?style=flat-square&logo=mysql&logoColor=white)

![Redis](https://img.shields.io/badge/Redis-DC382D?style=flat-square&logo=Redis&logoColor=white)
![AWS S3](https://img.shields.io/badge/AWS%20S3-569A31?style=flat-square&logo=amazons3&logoColor=white)
![AWS EC2](https://img.shields.io/badge/AWS%20EC2-FF9900?style=flat-square&logo=amazonec2&logoColor=white)
![Amazon sqs](https://img.shields.io/badge/Amazon%20sqs-FF9900?style=flat-square&logo=amazon&logoColor=white)

![Naver cloud](https://img.shields.io/badge/naver%20cloud-03C75A?style=flat-square&logo=naver&logoColor=white)
![openAI](https://img.shields.io/badge/openAI-FF6C37?style=flat-square&logo=openai&logoColor=white)
![poi](https://img.shields.io/badge/poi-3F6EB5?style=flat-square&logo=apache&logoColor=white)
![line api](https://img.shields.io/badge/line%20api-00C300?style=flat-square&logo=line&logoColor=white)
![coolSms](https://img.shields.io/badge/coolSms-FF6C37?style=flat-square&logo=coolSms&logoColor=white)

</div>

# 🧑‍💻 Collaborators

<h3 align="center">Backend</h3>

<div align="center">

| **테크 리더** | **기획 리더** | **리액셔너** | **리마인더** | **리마인더** |
| ------------- | ------------- | ------------ | ------------ | ------------ |
| <div align="center">[이영준](https://github.com/20jcode)</div> | <div align="center">[김태윤](https://github.com/pykido)</div> | <div align="center">[유경미](https://github.com/yooookm)</div> | <div align="center">[박혜연](https://github.com/hyyyh0x)</div> | <div align="center">[이진솔](https://github.com/mogld)</div> |
| <div align="center"><img src="https://avatars.githubusercontent.com/u/109460399?v=4" width="100"></div> | <div align="center"><img src="https://github.com/user-attachments/assets/b6434e99-2e5d-4d46-92f0-55004d16ec3c" width="100"></div> | <div align="center"><img src="https://github.com/user-attachments/assets/9a2c803f-a49f-4343-8de3-ae8de72b7927" width="100"></div> | <div align="center"><img src="https://avatars.githubusercontent.com/u/141637975?v=4" width="100"></div> | <div align="center"><img src="https://avatars.githubusercontent.com/u/143364802?v=4" width="100"></div> |

</div>

<h3 align="center">Frontend</h3>


<div align="center">

| **조장**      | **타임 키퍼** |
| ------------- | ------------- |
|<div align="center">[문정윤](https://github.com/nnoonjy)</div>|<div align="center">[이지수](https://github.com/dlwltn0430)</div> |
| <div align="center"><img src="https://avatars.githubusercontent.com/u/102630375?v=4" width="100"></div> | <div align="center"><img src="https://avatars.githubusercontent.com/u/101401447?v=4" width="100"></div> |

</div>
