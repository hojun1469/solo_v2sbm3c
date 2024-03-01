package dev.mvc.reply;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import dev.mvc.member.MemberVO;

@Controller
@SessionAttributes("MemberVO")
@RequestMapping("/reply")
public class ReplyCont {

  @Autowired
  private ReplyProcInter replyProc;

  @RequestMapping(value = "/create.do", method = RequestMethod.POST)
  public String createReply(ReplyVO replyVO, Model model) {
      MemberVO loggedInMember = MemberVO.getLoggedInMember();

      if (loggedInMember != null) {
          replyVO.setMemberno(loggedInMember.getMemberno());
          replyProc.createReply(replyVO);
      } else {
          System.out.println("로그인한 사용자가 없습니다."); // 디버깅을 위한 출력
      }

      return "redirect:/contents/read.do?contentsno=" + replyVO.getContentsno();
  }

  @RequestMapping(value = "/list.do/{contentsno}", method = RequestMethod.GET)
  public String getReplyList(@PathVariable int contentsno, Model model) {
      // 댓글 조회 
      List<ReplyVO> replyList = replyProc.getReplyList(contentsno);
      model.addAttribute("replyList", replyList);
      return "reply/list";
  }

  // 댓글 수정 기능
  @RequestMapping(value = "/update.do", method = RequestMethod.POST)
  public String updateReply(ReplyVO replyVO, Model model) {
      MemberVO loggedInMember = MemberVO.getLoggedInMember();

      // 본인이 작성한 댓글이거나 관리자일 경우에만 수정 가능
      if (loggedInMember != null && (loggedInMember.getGrade() == 1 || replyVO.getMemberno() == loggedInMember.getMemberno())) {
          replyProc.updateReply(replyVO);
      } else {
          System.out.println("본인이 작성한 댓글이 아니거나 권한이 없습니다."); // 디버깅을 위한 출력
      }

      return "redirect:/contents/read.do?contentsno=" + replyVO.getContentsno();
  }

  // 댓글 삭제 기능
  @RequestMapping(value = "/delete.do", method = RequestMethod.GET)
  public String deleteReply(@RequestParam int replyno, @RequestParam int contentsno, Model model) {
      MemberVO loggedInMember = MemberVO.getLoggedInMember();
      ReplyVO replyVO = replyProc.read(replyno);

      // 본인이 작성한 댓글이거나 관리자일 경우에만 삭제 가능
      if (loggedInMember != null && (loggedInMember.getGrade() == 1 || replyVO.getMemberno() == loggedInMember.getMemberno())) {
          replyProc.deleteReply(replyno);
      } else {
          System.out.println("본인이 작성한 댓글이 아니거나 권한이 없습니다."); // 디버깅을 위한 출력
      }

      return "redirect:/contents/read.do?contentsno=" + contentsno;
  }
}
