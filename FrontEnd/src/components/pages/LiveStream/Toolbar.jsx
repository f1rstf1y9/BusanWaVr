import ExitToAppIcon from "@mui/icons-material/ExitToApp";
import CameraswitchIcon from "@mui/icons-material/Cameraswitch";
import VideocamIcon from "@mui/icons-material/Videocam";
import VideocamOffIcon from "@mui/icons-material/VideocamOff";
import MicIcon from "@mui/icons-material/Mic";
import MicOffIcon from "@mui/icons-material/MicOff";
import FullscreenIcon from "@mui/icons-material/Fullscreen";
import FullscreenExitIcon from "@mui/icons-material/FullscreenExit";
import CommentIcon from "@mui/icons-material/Comment";
import CommentsDisabledIcon from "@mui/icons-material/CommentsDisabled";

import styled from "styled-components";

import { useSelector, useDispatch } from "react-redux";

const Toolbar = (props) => {
  const { isAudioEnabled, isVideoEnabled, isFullScreen, isChatOpen } =
    useSelector((state) => state.liveStream);
  const dispatch = useDispatch();

  const ToolbarContainer = styled.div`
    display: flex;
    justify-content: center;
    position: fixed;
    left: 50%;
    transform: translate(-50%, 0);
    bottom: 30px;
    background-color: #eee;
    border-radius: 30px;
    padding: 0 10px;
  `;

  const ToolbarButton = styled.button`
    width: 60px;
    height: 60px;
    border-radius: 100%;
    display: flex;
    align-items: center;
    justify-content: center;
    background-color: transparent;
    &:hover {
      border: none;
    }
    transition: none;
  `;

  return (
    <ToolbarContainer>
      {isVideoEnabled ? (
        <ToolbarButton onClick={props.toggleVideo}>
          <VideocamIcon />
        </ToolbarButton>
      ) : (
        <ToolbarButton onClick={props.toggleVideo}>
          <VideocamOffIcon />
        </ToolbarButton>
      )}
      <ToolbarButton
        type="button"
        id="buttonSwitchCamera"
        onClick={props.switchCamera}
      >
        <CameraswitchIcon />
      </ToolbarButton>
      {isAudioEnabled ? (
        <ToolbarButton onClick={props.toggleAudio}>
          <MicIcon />
        </ToolbarButton>
      ) : (
        <ToolbarButton onClick={props.toggleAudio}>
          <MicOffIcon />
        </ToolbarButton>
      )}
      {isFullScreen ? (
        <ToolbarButton onClick={props.toggleFullScreen}>
          <FullscreenExitIcon />
        </ToolbarButton>
      ) : (
        <ToolbarButton onClick={props.toggleFullScreen}>
          <FullscreenIcon />
        </ToolbarButton>
      )}

      {isChatOpen ? (
        <ToolbarButton onClick={props.handleChatToggle}>
          <CommentIcon />
        </ToolbarButton>
      ) : (
        <ToolbarButton onClick={props.handleChatToggle}>
          <CommentsDisabledIcon />
        </ToolbarButton>
      )}

      <ToolbarButton
        type="button"
        id="buttonLeaveSession"
        onClick={props.leaveSession}
      >
        <ExitToAppIcon />
      </ToolbarButton>
    </ToolbarContainer>
  );
};
export default Toolbar;
