# 🌊BusanWaVR(부산와바)

> 360도 영상 라이브 스트리밍을 통한 부산지역 랜선 투어 제공 서비스
> 

<br>

## 📌 프로젝트 개요

- **프로젝트명**: BusanWaVR(부산와바)
- **개발기간**: 2023.07.04 ~ 2023.08.18 (7주)
- **팀원 구성**: 6명 (프론트엔드 3인, 백엔드 3인)
- **소개 UCC**: [YouTube 링크](https://youtu.be/v10Yo84CSPc)
- **성과**: 🏆SSAFY 9기 공통 프로젝트 우수상(2등)

<br>

## 🎯 프로젝트 배경

SSAFY 부울경 캠퍼스에서 반년 간 교육을 들으며 부산 지역에는 잘 알려진 관광 명소 뿐만 아니라, 숨겨진 매력이 많은 도시라는 것을 알게되었습니다. 저희는 이러한 부산의 매력을 널리 알릴 수 있는 **랜선 투어 서비스**를 기획하게 되었습니다. 

기존의 일방적인 라이브 방송 형식의 랜선 투어는 참가자와의 소통이 부족하다는 단점이 있었기에 **참가자와 가이드 간 상호작용을 강화**한 서비스를 제공하고자 했습니다. 이를 위해 ‘부산와바’는 VR 기술을 통해, 부산의 다양한 매력을 **생동감 있게 경험**할 수 있도록 구현했습니다.

<br>

## ⚙️ 주요 기능 및 서비스 화면

**1. 로그인 및 메인 화면**<br>

- 지역별 투어 및 추천 투어 확인

| <img title="" src="#" alt="" width="386"> | <img title="" src="#" alt="" width="386"> |
| --- | --- |
| 메인 페이지 | 로그인 |

<br>

**2. 마이페이지**<br>

- 예정된 투어 일정 확인
- 찜한 투어 확인

| <img title="" src="https://github.com/f1rstf1y9/BeNurse/raw/master/Readme_assets/Web_mkschedule.gif" alt="" width="386"> | <img title="" src="https://github.com/f1rstf1y9/BeNurse/raw/master/Readme_assets/Web_Setting.gif" alt="" width="386"> |
| --- | --- |
| 근무표 생성 | 병원 관리 |

<br>

**3.** 투어 작성 페이지 <br>

- 투어 지역, 카테고리, 기간, 인원 설정
- 투어 상세 정보 포스트 작성
- 카카오 지도 API 활용 투어 코스 등록

**4.** 투어 검색 페이지 <br>

- 제목, 가이드, 코스, 카테고리, 지역에 따라 투어 검색

**5.** 투어 상세 페이지 <br>

- 투어 상세 정보 확인
- 투어 찜하기 / 투어 예약하기

**6. 메이트 모집** 페이지 <br>

- 특정 투어에 함께 할 메이트 구인글 작성
- 투어의 현재 참여 인원 확인

**7. 투어 시작 페이지**

- 유튜브 라이브 링크와 연동하여 투어 시작
- 카메라 및 마이크 설정

**8. 투어 스트리밍 화면**

- 360도 스트리밍 화면
- 투어 참여자 간 실시간 화상 채팅
- 음성 인식 채팅
- 동작 인식 기반 실시간 투표
- VR 기기용 스트리밍 화면으로 연결되는 QR코드

<br>

## 🧑‍💻 개발 환경 및 기술 스택

### Management Tool

<img src="https://img.shields.io/badge/gitlab-FC6D26?style=for-the-badge&logo=gitlab&logoColor=white"> <img src="https://img.shields.io/badge/jira-0052CC?style=for-the-badge&logo=jira&logoColor=white"> <img src="https://img.shields.io/badge/mattermost-0058CC?style=for-the-badge&logo=mattermost&logoColor=white"> <img src="https://img.shields.io/badge/notion-000000?style=for-the-badge&logo=notion&logoColor=white"> <img src="https://img.shields.io/badge/figma-F24E1E?style=for-the-badge&logo=figma&logoColor=white">

### Frontend

<img src="https://img.shields.io/badge/javascript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black"> <img src="https://img.shields.io/badge/typescript-3178C6?style=for-the-badge&logo=typescript&logoColor=white"> <img src="https://img.shields.io/badge/vite-646CFF?style=for-the-badge&logo=vite&logoColor=white"> <img src="https://img.shields.io/badge/react-61DAFB?style=for-the-badge&logo=react&logoColor=black"> <img src="https://img.shields.io/badge/redux-764ABC?style=for-the-badge&logo=redux&logoColor=white"> <img src="https://img.shields.io/badge/styledcomponents-DB7093?style=for-the-badge&logo=styledcomponents&logoColor=white"> <img src="https://img.shields.io/badge/mui-007FFF?style=for-the-badge&logo=mui&logoColor=white"> <img src="https://img.shields.io/badge/openvidu-05CD5F?style=for-the-badge&logo=&logoColor=white"> 

### Backend

<img src="[https://img.shields.io/badge/spring boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white](https://img.shields.io/badge/spring%20boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)"> <img src="[https://img.shields.io/badge/spring security-6DB33F?style=for-the-badge&logo=springsecurity&logoColor=white](https://img.shields.io/badge/spring%20security-6DB33F?style=for-the-badge&logo=springsecurity&logoColor=white)"> <img src="https://img.shields.io/badge/redis-FF4438?style=for-the-badge&logo=redis&logoColor=white"> <img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white"> <img src="https://img.shields.io/badge/swagger-85EA2D?style=for-the-badge&logo=swagger&logoColor=black">

### Infra

<img src="[https://img.shields.io/badge/amazon ec2-FF9900?style=for-the-badge&logo=amazonec2&logoColor=white](https://img.shields.io/badge/amazon%20ec2-FF9900?style=for-the-badge&logo=amazonec2&logoColor=white)"> <img src="https://img.shields.io/badge/nginx-009639?style=for-the-badge&logo=nginx&logoColor=white"> <img src="https://img.shields.io/badge/docker-2496ED?style=for-the-badge&logo=docker&logoColor=white"> <img src="https://img.shields.io/badge/jenkins-D24939?style=for-the-badge&logo=jenkins&logoColor=white">

### AI API

<img src="https://img.shields.io/badge/teachable%20machine-1B73E8?style=for-the-badge&logo=&logoColor=white"> <img src="https://img.shields.io/badge/azure%20stt-0085CF?style=for-the-badge&logo=&logoColor=white"> 

<br>

## 🚧 설계

### 시스템 아키텍처

<img src="https://github.com/user-attachments/assets/773d7600-ff3b-4e38-9c66-23f0ec58b9ef" width="600"/>

```
📂 BackEnd
  └─ 📂 src
      └─ 📂 main
      │   ├─ 📂 generated/com/example/backend/model
      │   │   ├─ 📂 category
      │   │   ├─ 📂 chat
      │   │   ├─ 📂 course
      │   │   ├─ 📂 courseimage
      │   │   ├─ 📂 follower
      │   │   ├─ 📂 image
      │   │   ├─ 📂 joiner
      │   │   ├─ 📂 mate
      │   │   ├─ 📂 review
      │   │   ├─ 📂 tour
      │   │   ├─ 📂 tourcategory
      │   │   ├─ 📂 tourimage
      │   │   ├─ 📂 user
      │   │   ├─ 📂 usercategory
      │   │   └─ 📂 wish
      │   └─ 📂 java/com/example/backend
      │   │   ├─ 📂 config
      │   │   ├─ 📂 controller
      │   │   ├─ 📂 document
      │   │   ├─ 📂 dto
      │   │   ├─ 📂 exception
      │   │   ├─ 📂 model
      │   │   ├─ 📂 security
      │   │   ├─ 📂 sevice
      │   │   ├─ 📂 util
      │   │   └─ 📜 BackEndApplication.java
      └─ 📂 test/java/com/example/backend
          └─ 📂 Controller
```

```
📂 FrontEnd
 └─ 📂 src
    ├─ 📂 assets
    ├─ 📂 components
    │   ├─ 📂 atoms
    │   ├─ 📂 blocks
    │   ├─ 📂 common
    │   └─ 📂 pages
    │       ├─ 📂 Auth
    │       ├─ 📂 GuideProfile
    │       ├─ 📂 Home
    │       ├─ 📂 LiveStream
    │       ├─ 📂 Mate
    │       ├─ 📂 Review
    │       ├─ 📂 Root
    │       ├─ 📂 Tour
    │       └─ 📂 UserProfile
    ├─ 📂 hooks
    ├─ 📂 navigations
    ├─ 📂 store
    ├─ 📂 utils
    ├─ 📜 index.css
    └─ 📜 main.tsx

```

### 메뉴 트리

<img src="https://github.com/user-attachments/assets/d89e90fa-9aed-4333-85b3-fb6515593e70" alt="메뉴트리" width="800"/>

<br>
<br>

## **😎** 팀원 소개

| [김남우](https://github.com/niyamallo) | [서정희](https://github.com/jh2dang) | [정은경](https://github.com/f1rstf1y9) | [정영빈](https://github.com/wjddudqls96) | [황재영](https://github.com/JJaeki) | [김민구](https://github.com/kimingu7) |
| --- | --- | --- | --- | --- | --- |
| <img title="" src="https://avatars.githubusercontent.com/u/122415726?s=96&v=4" alt="" width="500"> | <img title="" src="https://avatars.githubusercontent.com/u/122415714?s=96&v=4" alt="" width="500"> | <img title="" src="https://avatars.githubusercontent.com/u/94157035?s=96&v=4" alt="" width="500"> | <img title="" src="https://avatars.githubusercontent.com/u/59672589?s=96&v=4" alt="" width="500"> | <img title="" src="https://avatars.githubusercontent.com/u/122856412?s=96&v=4" alt="" width="500"> | <img title="" src="https://avatars.githubusercontent.com/u/122415709?s=96&v=4" alt="" width="500"> |
| Frontend | Frontend | Frontend | Backend | Backend | Backend |
