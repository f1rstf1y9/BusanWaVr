import React, { useState, useEffect } from "react";
import { useParams } from "react-router-dom"; 
import FollowingCard from "../../blocks/FollowingCard";

function UserFollowingBoard() {
  const [followingData, setFollowingData] = useState([]);
  const accessToken = localStorage.getItem("accessToken");
  const { userId } = useParams();

  useEffect(() => {
    fetchData();
  }, []);


  // 토큰 말고 userId받게 수정해야함
  const fetchData = async () => {
    try {
      const response = await fetch(`http://52.79.93.203/user/following/${userId}`, {
        method: "GET",
        headers: {
          "Content-Type": "application/json",
        },
      });
      if (response.status === 200) {
        console.log("팔로잉데이터 받았어요");
        const data = await response.json();
        setFollowingData(data.data.guides);
      } else {
        alert("위시데이터를 받아올 수 없습니다. 잠시 후 다시 시도해 주세요.");
      }
    } catch (error) {
      console.error(error);
    }
  };

  return (
    <div>
      <h1>유저 팔로잉 보드</h1>
      {followingData ? (
        <FollowingCard followingData={followingData} />
      ) : (
        <p>로딩중ㅎ</p>
      )}
    </div>
  );
}

export default UserFollowingBoard;
