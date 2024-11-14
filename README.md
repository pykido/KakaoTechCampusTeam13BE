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

## 🧩 ERD
<p align='center'>
    <img width="700" alt="caregiver_difficulty" src="docs/source/erd.png">
</p>

## ⚙️ 개발 스택

<div align="center">

![java 17](https://img.shields.io/badge/-Java%2017-ED8B00?style=flat-square&logo=java&logoColor=white)
![spring boot 3.1.3](https://img.shields.io/badge/Spring%20boot%203.1.3-6DB33F?style=flat-square&logo=springboot&logoColor=white)
![spring security](https://img.shields.io/badge/spring%20security-6DB33F?style=flat-square&logo=spring&logoColor=white)
![mysql 8.0](https://img.shields.io/badge/MySQL%208.0-005C84?style=flat-square&logo=mysql&logoColor=white)

![Redis 6.2](https://img.shields.io/badge/Redis%206.2-DC382D?style=flat-square&logo=Redis&logoColor=white)
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
