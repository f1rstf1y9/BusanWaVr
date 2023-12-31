import React from "react";
import { Link, useParams } from "react-router-dom";

function UserNavbar() {
  const { userId } = useParams();

  return (
    <nav>
      <ul>
        <li>
          <Link to={`/user/${userId}/mypage/`}>내 정보</Link>
        </li>
        <li>
          <Link to={`/user/${userId}/mypage/tour`}>내 여행</Link>
        </li>
        <li>
          <Link to={`/user/${userId}/mypage/wish`}>위시리스트</Link>
        </li>
        <li>
          <Link to={`/user/${userId}/mypage/following`}>팔로잉 가이드</Link>
        </li>
        <li>
          <Link to={`/user/${userId}/mypage/review`}>작성한 리뷰</Link>
        </li>
      </ul>
    </nav>
  );
}

export default UserNavbar;
