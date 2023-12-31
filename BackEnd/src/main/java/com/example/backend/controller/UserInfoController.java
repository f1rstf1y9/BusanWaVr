package com.example.backend.controller;

import com.example.backend.dto.Response;
import com.example.backend.dto.userinfo.GuideCanceledToursDto;
import com.example.backend.dto.userinfo.GuideEndedToursDto;
import com.example.backend.dto.userinfo.GuideFollowerDto;
import com.example.backend.dto.userinfo.GuideHomeDto;
import com.example.backend.dto.userinfo.GuideInfoDto;
import com.example.backend.dto.userinfo.GuideReviewsDto;
import com.example.backend.dto.userinfo.GuideScheduledToursDto;
import com.example.backend.dto.userinfo.UserFollowDto;
import com.example.backend.dto.userinfo.UserInfoDto;
import com.example.backend.dto.userinfo.UserTourDto;
import com.example.backend.dto.userinfo.UserWishDto;
import com.example.backend.security.UserDetailsImpl;
import com.example.backend.service.user.UserInfoService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserInfoController {

    private final UserInfoService userInfoService;

    @GetMapping("/user/wish/{userId}")
    public Response getUserWishList(@PathVariable Long userId,
            @PageableDefault(size = 6) Pageable pageable) {
        UserWishDto.Response response = userInfoService.getUserWishList(
                userId, pageable);

        return new Response<>("200", "성공적으로 위시리스트를 가져왔습니다.", response);
    }

    @PostMapping("/user/{guideId}")
    public Response followGuide(@AuthenticationPrincipal UserDetailsImpl userDetails,
            @PathVariable Long guideId) {

        boolean isFollowed = userInfoService.userFollow(userDetails.getUser().getId(), guideId);

        if (isFollowed) {
            return new Response<>("200", "성공적으로 가이드를 팔로우했습니다.", null);
        } else {
            return new Response<>("200", "성공적으로 가이드를 언팔로우했습니다.", null);
        }
    }

    @GetMapping("/user/following/{userId}")
    public Response<UserFollowDto.Response> getFollowingGuides(
            @PathVariable Long userId,
            @PageableDefault(size = 6) Pageable pageable) {
        UserFollowDto.Response response = userInfoService.getFollowingGuideList(
                userId, pageable);

        return new Response<>("200", "성공적으로 팔로잉하는 가이드의 목록을 가져왔습니다.", response);
    }

    @GetMapping("/guide/{guideId}/tour/schedule")
    public Response<GuideScheduledToursDto.Response> getGuidesScheduledTours(
            @PathVariable Long guideId,
            @PageableDefault(size = 6) Pageable pageable) {
        GuideScheduledToursDto.Response response = userInfoService.guideScheduledToursService(guideId,
                pageable);
        return new Response<>("200", "성공적으로 가이드의 예정된 투어 목록을 가져왔습니다.", response);
    }

    @GetMapping("/guide/{guideId}/tour/end")
    public Response<GuideEndedToursDto.Response> getGuidesEndedTours(
            @PathVariable Long guideId,
            @PageableDefault(size = 6) Pageable pageable) {
        GuideEndedToursDto.Response response = userInfoService.guideEndedToursService(
                guideId, pageable);
        return new Response<>("200", "성공적으로 가이드의 종료된 투어 목록을 가져왔습니다.", response);
    }

    @GetMapping("/user/userInfo/{userId}")
    public Response<UserInfoDto.Response> getUserInfo(@PathVariable Long userId) {
        UserInfoDto.Response response = userInfoService.getUserInfo(userId);
        return new Response<>("200", "성공적으로 사용자 정보를 가져왔습니다.", response);
    }

    @GetMapping("/guide/guideInfo/{guideId}")
    public Response<GuideInfoDto.Response> getGuideInfo(@PathVariable Long guideId) {
        GuideInfoDto.Response response = userInfoService.getGuideInfo(guideId);
        return new Response<>("200", "성공적으로 가이드 정보를 가져왔습니다.", response);
    }

    @GetMapping("/guide/{guideId}/tour/review")
    public Response<GuideReviewsDto.Response> getGuidesReviews(
            @PathVariable Long guideId,
            @PageableDefault(size = 6) Pageable pageable) {
        GuideReviewsDto.Response response = userInfoService.guideReviewsService(guideId,
                pageable);
        return new Response<>("200", "성공적으로 가이드의 리뷰 목록을 가져왔습니다.", response);
    }

    @GetMapping("/guide/{guideId}/home")
    public Response<GuideHomeDto.Response> getGuideHome(
            @PathVariable Long guideId,
            @PageableDefault(size = 6) Pageable pageable) {
        GuideHomeDto.Response response = userInfoService.guideHome(guideId, pageable);
        return new Response<>("200", "성공적으로 가이드 홈 정보를 불러왔습니다", response);
    }

    @GetMapping("/user/tour/{userId}")
    public Response<UserTourDto.Response> getUserTours(@PathVariable Long userId) {
        UserTourDto.Response response = userInfoService.getUserTour(userId);
        return new Response<>("200", "성공적으로 유저의 투어 정보를 불러왔습니다", response);
    }

    @GetMapping("/guide/follower/{guideId}")
    public Response<List<GuideFollowerDto>> getGuideFollower(@PathVariable Long guideId) {
        List<GuideFollowerDto> response = userInfoService.getGuideFollowerList(guideId);
        return new Response<>("200", "성공적으로 가이드의 팔로워 정보를 불러왔습니다", response);
    }

    @GetMapping("/guide/{guideId}/tour/canceled")
    public Response<GuideCanceledToursDto.Response> getGuideCanceledTours(
            @PathVariable Long guideId,
            @PageableDefault(size = 6) Pageable pageable) {
        GuideCanceledToursDto.Response response = userInfoService.getGuideCanceledTourList(
                guideId, pageable);
        return new Response<>("200", "성공적으로 가이드의 취소된 투어 목록을 가져왔습니다.", response);
    }

    @GetMapping("/user/{guideId}/follow")
    public Response<Boolean> checkIsFollowed(@AuthenticationPrincipal UserDetailsImpl userDetails, @PathVariable Long guideId){
        boolean response = userInfoService.checkIsFollowed(userDetails.getUser(), guideId);
        return new Response("200", "성공적으로 해당 가이드 팔로우 여부를 확인했습니다.", response);
    }
}
